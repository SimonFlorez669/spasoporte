package co.edu.uco.spa.crosscutting.excepcion;

import java.sql.SQLException;

import co.edu.uco.spa.crosscutting.excepcion.concrete.ServiceSpaException;
import co.edu.uco.spa.crosscutting.excepcion.enumerator.LugarExcepcion;
import co.edu.uco.spa.crosscutting.util.UtilObjeto;
import co.edu.uco.spa.crosscutting.util.UtilTexto;
import co.edu.uco.tiendaonline.crosscutting.exception.TiendaOnlineException;
import co.edu.uco.tiendaonline.crosscutting.exception.concrete.ServiceTiendaOnlineException;

public class SpaExcepcion extends RuntimeException{

	
	private static final long serialVersionUID = 1L;
	
	private Throwable excepcionRaiz;
	private String mensajeUsuario;
	private String mensajeTecnico;
	private LugarExcepcion lugar;
	private boolean tieneExcepcionRaiz;
	
	
	public SpaExcepcion(final Throwable excepcionRaiz, final String mensajeUsuario, final String mensajeTecnico,final  LugarExcepcion lugar) {
		setExcepcionRaiz(excepcionRaiz);
		setLugar(lugar);
		setMensajeTecnico(mensajeTecnico);
		setMensajeUsuario(mensajeUsuario);
		
		 
	}
	
	public static Exception crear(final Throwable excpcionRaiz, final String mensajeUsuario,final String mensajeTecnico, final LugarExcepcion lugar) {
		return new SpaExcepcion(excpcionRaiz, mensajeUsuario, mensajeTecnico,lugar);
	}

	public static final SpaExcepcion crear(final String mensajeUsuario) {
		return new ServiceSpaException(null, mensajeUsuario,mensajeUsuario);
	}
	
	public static final SpaExcepcion crear (final String mensajeUsuario, final String mensajeTecnico) {
		return new ServiceSpaException(null, mensajeUsuario, mensajeTecnico);
	}
	
	public static final SpaExcepcion crear (final Throwable excepcionRaiz, final String mensajeUsuario, final String mensajeTecnico) {
		return new ServiceSpaException(excepcionRaiz, mensajeUsuario, mensajeTecnico);
	




	public static final long getSerialversionuid() {
		return serialVersionUID;
	}


	public final Throwable getExcepcionRaiz() {
		return excepcionRaiz;
	}


	public final String getMensajeUsuario() {
		return mensajeUsuario;
	}


	public final String getMensajeTecnico() {
		return mensajeTecnico;
	}


	public final LugarExcepcion getLugar() {
		return lugar;
	}


	public final boolean isTieneExcepcionRaiz() {
		return tieneExcepcionRaiz;
	}




	public final void setExcepcionRaiz(final Throwable excepcionRaiz) {
		setTieneExcepcionRaiz(!UtilObjeto.esNulo(excepcionRaiz));
		this.excepcionRaiz = UtilObjeto.obtenerValorDefecto(excepcionRaiz, new Exception());
	}




	public final void setMensajeUsuario(final String mensajeUsuario) {
		this.mensajeUsuario = UtilTexto.aplicarTrim(mensajeUsuario);
	}




	public final void setMensajeTecnico(final String mensajeTecnico) {
		this.mensajeTecnico = UtilTexto.aplicarTrim(mensajeTecnico);
	}




	public final void setLugar(final LugarExcepcion lugar) {
		this.lugar = UtilObjeto.obtenerValorDefecto(lugar, LugarExcepcion.GENERAL);
	}




	
	
	
	private final void setTieneExcepcionRaiz (final boolean tieneExcepcionRaiz) {
		this.tieneExcepcionRaiz = tieneExcepcionRaiz;
	}








	
	
	
	
	
	

}
