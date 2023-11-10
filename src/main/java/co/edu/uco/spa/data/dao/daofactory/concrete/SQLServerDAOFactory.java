package co.edu.uco.spa.data.dao.daofactory.concrete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.plaf.basic.BasicTreeUI.TreeHomeAction;

import co.edu.uco.spa.crosscutting.excepcion.SpaExcepcion;
import co.edu.uco.spa.crosscutting.excepcion.concrete.CrosscuttingSpaExcepcion;
import co.edu.uco.spa.crosscutting.excepcion.enumerator.LugarExcepcion;
import co.edu.uco.spa.crosscutting.excepcion.messages.CatalogoMensajes;
import co.edu.uco.spa.crosscutting.excepcion.messages.enumerator.CodigoMensaje;
import co.edu.uco.spa.crosscutting.util.UtilSQL;
import co.edu.uco.spa.data.dao.AtencionClienteDAO;
import co.edu.uco.spa.data.dao.BancoImagenesDAO;
import co.edu.uco.spa.data.dao.CalificacionDAO;
import co.edu.uco.spa.data.dao.CitaReservaDAO;
import co.edu.uco.spa.data.dao.ClienteDAO;
import co.edu.uco.spa.data.dao.ConsentimientoDAO;
import co.edu.uco.spa.data.dao.DireccionDAO;
import co.edu.uco.spa.data.dao.EquipoTrabajoDAO;
import co.edu.uco.spa.data.dao.InventarioDAO;
import co.edu.uco.spa.data.dao.NotificacionDAO;
import co.edu.uco.spa.data.dao.OfertaDAO;
import co.edu.uco.spa.data.dao.PagosDAO;
import co.edu.uco.spa.data.dao.PreciosDAO;
import co.edu.uco.spa.data.dao.ProductoDAO;
import co.edu.uco.spa.data.dao.RestriccionServicioDAO;
import co.edu.uco.spa.data.dao.ServicioDAO;
import co.edu.uco.spa.data.dao.SucursalDAO;
import co.edu.uco.spa.data.dao.TipoIdentificacionDAO;
import co.edu.uco.spa.data.dao.TipoImagenDAO;
import co.edu.uco.spa.data.dao.TipoPagoDAO;
import co.edu.uco.spa.data.dao.TipoProductoDAO;
import co.edu.uco.spa.data.dao.TipoServicioDAO;
import co.edu.uco.spa.data.dao.TipoUsuarioDAO;
import co.edu.uco.spa.data.dao.UsuariosDAO;
import co.edu.uco.spa.data.dao.concrete.sqlserver.AtencionClienteSQLServerDAO;
import co.edu.uco.spa.data.dao.concrete.sqlserver.BancoImagenesSQLServerDAO;
import co.edu.uco.spa.data.dao.concrete.sqlserver.CalificacionSQLSeverDAO;
import co.edu.uco.spa.data.dao.concrete.sqlserver.CitasReservaSLQServerDAO;
import co.edu.uco.spa.data.dao.concrete.sqlserver.ClienteSQLServerDAO;
import co.edu.uco.spa.data.dao.concrete.sqlserver.ConsentimientoSQLServerDAO;
import co.edu.uco.spa.data.dao.concrete.sqlserver.DireccionSQLServerDAO;
import co.edu.uco.spa.data.dao.concrete.sqlserver.EquipoTrabajoSQLServerDAO;
import co.edu.uco.spa.data.dao.concrete.sqlserver.InventarioSQLServerDAO;
import co.edu.uco.spa.data.dao.concrete.sqlserver.NotificacionSQLSeverDAO;
import co.edu.uco.spa.data.dao.concrete.sqlserver.OfertaSQLServerDAO;
import co.edu.uco.spa.data.dao.concrete.sqlserver.PagoSQLServerDAO;
import co.edu.uco.spa.data.dao.concrete.sqlserver.PreciosSQLServerDAO;
import co.edu.uco.spa.data.dao.concrete.sqlserver.ProductoSQLServerDAO;
import co.edu.uco.spa.data.dao.concrete.sqlserver.RestriccionServicioSQLServerDAO;
import co.edu.uco.spa.data.dao.concrete.sqlserver.ServicioSQLServerDAO;
import co.edu.uco.spa.data.dao.concrete.sqlserver.SucursalSQLServerDAO;
import co.edu.uco.spa.data.dao.concrete.sqlserver.TipoIdentificacionSQLServerDAO;
import co.edu.uco.spa.data.dao.concrete.sqlserver.TipoImagenSQLServerDAO;
import co.edu.uco.spa.data.dao.concrete.sqlserver.TipoPagoSQLServerDAO;
import co.edu.uco.spa.data.dao.concrete.sqlserver.TipoProductoSQLServerDAO;
import co.edu.uco.spa.data.dao.concrete.sqlserver.TipoServicioSQLServerDAO;
import co.edu.uco.spa.data.dao.concrete.sqlserver.TipoUsuarioSQLServerDAO;
import co.edu.uco.spa.data.dao.concrete.sqlserver.UsuariosSQLServerDAO;
import co.edu.uco.spa.data.dao.daofactory.DAOFactory;

public class SQLServerDAOFactory extends DAOFactory {

	private Connection conexion; 
	private boolean enTransaccion = false;
	
	
	
	public SQLServerDAOFactory() {
		abrirConexion();
	}
	
	
	
	@Override
	protected void abirConexion() {
		try {
			var cadenaConexion = "jdbc:sqlserver://<server>:<port>;encrypt=false;databaseName=<database>;user=<user>;password=<password>";
			conexion = DriverManager.getConnection(cadenaConexion);
		} catch (final SQLException excepcion) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000028);
			throw SpaExcepcion.crear( excepcion, mensajeUsuario, mensajeTecnico, null);
		} catch (final Exception excepcion) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000029);
			throw SpaExcepcion.crear(excepcion, mensajeTecnico, mensajeTecnico, null)
		}		
	}

	@Override
	public void cerrarConexion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void iniciarTransaccion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void confirmarTransaccion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cancelarTransaccion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ClienteDAO obtenerClienteDAO() {
			
		try {
			if (!UtilSQL.conexionAbierta(conexion)) {
				var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
				var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000034);
				throw CrosscuttingSpaExcepcion.crear(mensajeUsuario, mensajeTecnico);
			}
		} catch (Exception exepcion) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000034);
			throw CrosscuttingSpaExcepcion.crear(mensajeUsuario, mensajeTecnico);

			
		}

		return new ClienteSQLServerDAO(conexion);
	}

	@Override
	public AtencionClienteDAO obtenerAtencionClienteDAO() {
		try {
			if (!UtilSQL.conexionAbierta(conexion)) {
				var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
				var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000034);
				throw CrosscuttingSpaExcepcion.crear(mensajeUsuario, mensajeTecnico);
			}
		} catch (Exception exepcion) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000034);
			throw CrosscuttingSpaExcepcion.crear(mensajeUsuario, mensajeTecnico);
	}
		
		return new AtencionClienteSQLServerDAO(conexion);
	}

	@Override
	public BancoImagenesDAO obtenerBancoImagenesDAO() {
		try {
			if (!UtilSQL.conexionAbierta(conexion)) {
				var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
				var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000034);
				throw CrosscuttingSpaExcepcion.crear(mensajeUsuario, mensajeTecnico);
			}
		} catch (Exception exepcion) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000034);
			throw CrosscuttingSpaExcepcion.crear(mensajeUsuario, mensajeTecnico);
	}
		
		return new BancoImagenesSQLServerDAO(conexion);
		
		
	}

	@Override
	public CalificacionDAO obtenerCalificacionDAO() {
		try {
			if (!UtilSQL.conexionAbierta(conexion)) {
				var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
				var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000034);
				throw CrosscuttingSpaExcepcion.crear(mensajeUsuario, mensajeTecnico);
			}
		} catch (Exception exepcion) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000034);
			throw CrosscuttingSpaExcepcion.crear(mensajeUsuario, mensajeTecnico);
	}
		return new CalificacionSQLSeverDAO(conexion);
	}

	@Override
	public CitaReservaDAO obtenerCitaReservaDAO() {
		try {
			if (!UtilSQL.conexionAbierta(conexion)) {
				var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
				var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000034);
				throw CrosscuttingSpaExcepcion.crear(mensajeUsuario, mensajeTecnico);
			}
		} catch (Exception exepcion) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000034);
			throw CrosscuttingSpaExcepcion.crear(mensajeUsuario, mensajeTecnico);
	}
		return new CitasReservaSLQServerDAO(conexion);
	}

	@Override
	public ClienteDAO obtenerClientesDAO() {
		
		try {
			if (!UtilSQL.conexionAbierta(conexion)) {
				var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
				var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000034);
				throw CrosscuttingSpaExcepcion.crear(mensajeUsuario, mensajeTecnico);
			}
		} catch (Exception exepcion) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000034);
			throw CrosscuttingSpaExcepcion.crear(mensajeUsuario, mensajeTecnico);
	}
		return new ClienteSQLServerDAO(conexion);
	}

	@Override
	public ConsentimientoDAO obtenerConsentimientoDAO() {
		try {
			if (!UtilSQL.conexionAbierta(conexion)) {
				var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
				var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000034);
				throw CrosscuttingSpaExcepcion.crear(mensajeUsuario, mensajeTecnico);
			}
		} catch (Exception exepcion) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000034);
			throw CrosscuttingSpaExcepcion.crear(mensajeUsuario, mensajeTecnico);
	}
		return new ConsentimientoSQLServerDAO(conexion);
	}

	@Override
	public DireccionDAO obtenerDireccionDAO() {
		try {
			if (!UtilSQL.conexionAbierta(conexion)) {
				var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
				var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000034);
				throw CrosscuttingSpaExcepcion.crear(mensajeUsuario, mensajeTecnico);
			}
		} catch (Exception exepcion) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000034);
			throw CrosscuttingSpaExcepcion.crear(mensajeUsuario, mensajeTecnico);
	}
		return new DireccionSQLServerDAO(conexion);
	}

	@Override
	public EquipoTrabajoDAO obtenerEquipoTrabajoDAO() {
		try {
			if (!UtilSQL.conexionAbierta(conexion)) {
				var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
				var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000034);
				throw CrosscuttingSpaExcepcion.crear(mensajeUsuario, mensajeTecnico);
			}
		} catch (Exception exepcion) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000034);
			throw CrosscuttingSpaExcepcion.crear(mensajeUsuario, mensajeTecnico);
	}
		return new EquipoTrabajoSQLServerDAO(conexion);
	}

	@Override
	public InventarioDAO obtenerInventarioDAO() {
		
		try {
			if (!UtilSQL.conexionAbierta(conexion)) {
				var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
				var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000034);
				throw CrosscuttingSpaExcepcion.crear(mensajeUsuario, mensajeTecnico);
			}
		} catch (Exception exepcion) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000034);
			throw CrosscuttingSpaExcepcion.crear(mensajeUsuario, mensajeTecnico);
	}
		return new InventarioSQLServerDAO(conexion);
	}

	@Override
	public NotificacionDAO obtenerNotificacionDAO() {
		try {
			if (!UtilSQL.conexionAbierta(conexion)) {
				var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
				var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000034);
				throw CrosscuttingSpaExcepcion.crear(mensajeUsuario, mensajeTecnico);
			}
		} catch (Exception exepcion) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000034);
			throw CrosscuttingSpaExcepcion.crear(mensajeUsuario, mensajeTecnico);
	}		
		
		return new NotificacionSQLSeverDAO(conexion);
	}

	@Override
	public OfertaDAO obtenerOfertaDAO() {
		try {
			if (!UtilSQL.conexionAbierta(conexion)) {
				var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
				var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000034);
				throw CrosscuttingSpaExcepcion.crear(mensajeUsuario, mensajeTecnico);
			}
		} catch (Exception exepcion) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000034);
			throw CrosscuttingSpaExcepcion.crear(mensajeUsuario, mensajeTecnico);
	}		
		return new OfertaSQLServerDAO(conexion);
	}

	@Override
	public PagosDAO obtenerPagoDAO() {
		try {
			if (!UtilSQL.conexionAbierta(conexion)) {
				var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
				var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000034);
				throw CrosscuttingSpaExcepcion.crear(mensajeUsuario, mensajeTecnico);
			}
		} catch (Exception exepcion) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000034);
			throw CrosscuttingSpaExcepcion.crear(mensajeUsuario, mensajeTecnico);
	}
		return new PagoSQLServerDAO(conexion);
	}

	@Override
	public PreciosDAO obtenerPreciosDAO() {
		try {
			if (!UtilSQL.conexionAbierta(conexion)) {
				var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
				var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000034);
				throw CrosscuttingSpaExcepcion.crear(mensajeUsuario, mensajeTecnico);
			}
		} catch (Exception exepcion) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000034);
			throw CrosscuttingSpaExcepcion.crear(mensajeUsuario, mensajeTecnico);
	}
		return new PreciosSQLServerDAO(conexion);
	
	}

	@Override
	public ProductoDAO obtenerProductoDAO() {
		try {
			if (!UtilSQL.conexionAbierta(conexion)) {
				var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
				var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000034);
				throw CrosscuttingSpaExcepcion.crear(mensajeUsuario, mensajeTecnico);
			}
		} catch (Exception exepcion) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000034);
			throw CrosscuttingSpaExcepcion.crear(mensajeUsuario, mensajeTecnico);
	}
		return new ProductoSQLServerDAO(conexion);
	}

	@Override
	public RestriccionServicioDAO obtenerRestriccionServicioDAO() {
		try {
			if (!UtilSQL.conexionAbierta(conexion)) {
				var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
				var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000034);
				throw CrosscuttingSpaExcepcion.crear(mensajeUsuario, mensajeTecnico);
			}
		} catch (Exception exepcion) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000034);
			throw CrosscuttingSpaExcepcion.crear(mensajeUsuario, mensajeTecnico);
	}
		return new RestriccionServicioSQLServerDAO(conexion);
	}

	@Override
	public ServicioDAO obtenerServicioDAO() {
		try {
			if (!UtilSQL.conexionAbierta(conexion)) {
				var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
				var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000034);
				throw CrosscuttingSpaExcepcion.crear(mensajeUsuario, mensajeTecnico);
			}
		} catch (Exception exepcion) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000034);
			throw CrosscuttingSpaExcepcion.crear(mensajeUsuario, mensajeTecnico);
	}
		return new ServicioSQLServerDAO(conexion);
	}

	@Override
	public SucursalDAO obtenerSucursalDAO() {
		try {
			if (!UtilSQL.conexionAbierta(conexion)) {
				var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
				var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000034);
				throw CrosscuttingSpaExcepcion.crear(mensajeUsuario, mensajeTecnico);
			}
		} catch (Exception exepcion) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000034);
			throw CrosscuttingSpaExcepcion.crear(mensajeUsuario, mensajeTecnico);
	}
		return new SucursalSQLServerDAO(conexion);
	}

	@Override
	public TipoIdentificacionDAO obtenerTipoIdentificacionDAO() {
		try {
			if (!UtilSQL.conexionAbierta(conexion)) {
				var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
				var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000034);
				throw CrosscuttingSpaExcepcion.crear(mensajeUsuario, mensajeTecnico);
			}
		} catch (Exception exepcion) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000034);
			throw CrosscuttingSpaExcepcion.crear(mensajeUsuario, mensajeTecnico);
	}
		return new TipoIdentificacionSQLServerDAO(conexion);
	}

	@Override
	public TipoImagenDAO obtenerTipoImagenDAO() {
		try {
			if (!UtilSQL.conexionAbierta(conexion)) {
				var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
				var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000034);
				throw CrosscuttingSpaExcepcion.crear(mensajeUsuario, mensajeTecnico);
			}
		} catch (Exception exepcion) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000034);
			throw CrosscuttingSpaExcepcion.crear(mensajeUsuario, mensajeTecnico);
	}
		return new TipoImagenSQLServerDAO(conexion);
	}

	@Override
	public TipoPagoDAO obtenerTipoPagoDAO() {
		try {
			if (!UtilSQL.conexionAbierta(conexion)) {
				var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
				var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000034);
				throw CrosscuttingSpaExcepcion.crear(mensajeUsuario, mensajeTecnico);
			}
		} catch (Exception exepcion) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000034);
			throw CrosscuttingSpaExcepcion.crear(mensajeUsuario, mensajeTecnico);
	}
		return new TipoPagoSQLServerDAO(conexion);
	}

	@Override
	public TipoProductoDAO obtenerTipoProductoDAO() {
		try {
			if (!UtilSQL.conexionAbierta(conexion)) {
				var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
				var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000034);
				throw CrosscuttingSpaExcepcion.crear(mensajeUsuario, mensajeTecnico);
			}
		} catch (Exception exepcion) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000034);
			throw CrosscuttingSpaExcepcion.crear(mensajeUsuario, mensajeTecnico);
	}
		return new TipoProductoSQLServerDAO(conexion);
	}

	@Override
	public TipoServicioDAO obtenerTipoServicioDAO() {
		try {
			if (!UtilSQL.conexionAbierta(conexion)) {
				var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
				var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000034);
				throw CrosscuttingSpaExcepcion.crear(mensajeUsuario, mensajeTecnico);
			}
		} catch (Exception exepcion) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000034);
			throw CrosscuttingSpaExcepcion.crear(mensajeUsuario, mensajeTecnico);
	}
		return new TipoServicioSQLServerDAO(conexion);
	}

	@Override
	public TipoUsuarioDAO obtenerTipoUsuarioDAO() {
		try {
			if (!UtilSQL.conexionAbierta(conexion)) {
				var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
				var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000034);
				throw CrosscuttingSpaExcepcion.crear(mensajeUsuario, mensajeTecnico);
			}
		} catch (Exception exepcion) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000034);
			throw CrosscuttingSpaExcepcion.crear(mensajeUsuario, mensajeTecnico);
	}
		return new TipoUsuarioSQLServerDAO(conexion);
	}

	@Override
	public UsuariosDAO obtenerUsuariosDAO() {
		try {
			if (!UtilSQL.conexionAbierta(conexion)) {
				var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
				var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000034);
				throw CrosscuttingSpaExcepcion.crear(mensajeUsuario, mensajeTecnico);
			}
		} catch (Exception exepcion) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000034);
			throw CrosscuttingSpaExcepcion.crear(mensajeUsuario, mensajeTecnico);
	}
		return new UsuariosSQLServerDAO(conexion);
	}
	


}
