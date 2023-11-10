package co.edu.uco.spa.crosscutting.util;

import java.sql.Connection;
import java.sql.SQLException;

import co.edu.uco.spa.crosscutting.excepcion.concrete.CrosscuttingSpaExcepcion;
import co.edu.uco.spa.crosscutting.excepcion.messages.CatalogoMensajes;
import co.edu.uco.spa.crosscutting.excepcion.messages.enumerator.CodigoMensaje;



public class UtilSQL {
	

	

	private UtilSQL() {
		super();
	}
	
	public static final boolean conexionAbierta(final Connection conexion) throws Exception {
		if(!UtilObjeto.esNulo(conexion)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico =CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000007);
			throw CrosscuttingSpaExcepcion.crear(mensajeUsuario,mensajeTecnico);
			}
		
		try {
			return !conexion.isClosed();
		} catch (final SQLException excepcion) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000005);
			throw CrosscuttingSpaExcepcion.crear(excepcion,mensajeUsuario,mensajeTecnico);
		}
			catch (final Exception excepcion) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000006);
			throw CrosscuttingSpaExcepcion.crear(excepcion,mensajeUsuario,mensajeTecnico);
		}
	}
	
	public static final void cerrarConexion (final Connection conexion) throws Exception  {
		if(!UtilObjeto.esNulo(conexion)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico =CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000008);
			throw CrosscuttingSpaExcepcion.crear(mensajeUsuario,mensajeTecnico);
			}
		try {
			if(!conexionAbierta(conexion)) {
				var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
				var mensajeTecnico =CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000009);
				throw CrosscuttingSpaExcepcion.crear(mensajeUsuario,mensajeTecnico);
				}
			conexion.close();
		}
		catch(CrosscuttingSpaExcepcion excepcion){
			throw excepcion;
		} 
		catch(final SQLException excepcion){
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico =CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000013);
			throw CrosscuttingSpaExcepcion.crear(excepcion,mensajeUsuario,mensajeTecnico);
		}
		catch( final Exception excepcion) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico =CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000014);
			throw CrosscuttingSpaExcepcion.crear(excepcion,mensajeUsuario,mensajeTecnico);
		}
		}
		
		public static final void iniciarTransaccion (final Connection conexion) throws Exception{
			if(!UtilObjeto.esNulo(conexion)) {
				var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
				var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000010);
				throw CrosscuttingSpaExcepcion.crear(mensajeUsuario,mensajeTecnico);
				}
			try {
				if(!conexionAbierta(conexion)) {
					var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
					var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000011);
					throw CrosscuttingSpaExcepcion.crear(mensajeUsuario,mensajeTecnico);
					}
				if(!conexion.getAutoCommit()) {
					var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
					var mensajeTecnico =CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000012);
					throw CrosscuttingSpaExcepcion.crear(mensajeUsuario,mensajeTecnico);
					}
				conexion.setAutoCommit(false);
			}
			catch(CrosscuttingSpaExcepcion excepcion){
				throw excepcion;
			}
			catch(final SQLException excepcion){
				var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
				var mensajeTecnico =CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000015);
				throw CrosscuttingSpaExcepcion.crear(excepcion,mensajeUsuario,mensajeTecnico);
			}
			catch( final Exception excepcion) {
				var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
				var mensajeTecnico =CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000016);
				throw CrosscuttingSpaExcepcion.crear(excepcion,mensajeUsuario,mensajeTecnico);
			}
		}
		public static final void confirmarTransaccion(final Connection conexion) throws Exception {

			if (UtilObjeto.esNulo(conexion)) {
				var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
				var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000017);
				throw CrosscuttingSpaExcepcion.crear(mensajeUsuario, mensajeTecnico);
			}

			try {
				if (!conexionAbierta(conexion)) {
					var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
					var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000018);
					throw CrosscuttingSpaExcepcion.crear(mensajeUsuario, mensajeTecnico);
				}

				if (conexion.getAutoCommit()) {
					var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
					var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000019);
					throw CrosscuttingSpaExcepcion.crear(mensajeUsuario, mensajeTecnico);
				}

				conexion.commit();
			} catch (final CrosscuttingSpaExcepcion excepcion) {
				throw excepcion;
			} catch (final SQLException excepcion) {
				var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
				var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000020);
				throw CrosscuttingSpaExcepcion.crear(excepcion, mensajeUsuario, mensajeTecnico);
			} catch (final Exception excepcion) {
				var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
				var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000021);
				throw CrosscuttingSpaExcepcion.crear(excepcion, mensajeUsuario, mensajeTecnico);
			}
		}

		public static final void cancelarTransaccion(final Connection conexion) throws Exception {

			if (UtilObjeto.esNulo(conexion)) { 
				var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
				var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000022);
				throw CrosscuttingSpaExcepcion.crear(mensajeUsuario, mensajeTecnico);
			}

			try {
				if (!conexionAbierta(conexion)) {
					var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
					var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000023);
					throw CrosscuttingSpaExcepcion.crear(mensajeUsuario, mensajeTecnico);
				}

				if (conexion.getAutoCommit()) {
					var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
					var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000024);
					throw CrosscuttingSpaExcepcion.crear(mensajeUsuario, mensajeTecnico);
				}

				conexion.rollback();
			} catch (final CrosscuttingSpaExcepcion excepcion) {
				throw excepcion;
			} catch (final SQLException excepcion) {
				var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
				var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000025);
				throw CrosscuttingSpaExcepcion.crear(excepcion, mensajeUsuario, mensajeTecnico);
			} catch (final Exception excepcion) {
				var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
				var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000026);
				throw CrosscuttingSpaExcepcion.crear(excepcion, mensajeUsuario, mensajeTecnico);
			}
		}
		

}

