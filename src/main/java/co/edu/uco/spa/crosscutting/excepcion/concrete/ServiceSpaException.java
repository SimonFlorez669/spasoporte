package co.edu.uco.spa.crosscutting.excepcion.concrete;

import co.edu.uco.spa.crosscutting.excepcion.SpaExcepcion;
import co.edu.uco.spa.crosscutting.excepcion.enumerator.LugarExcepcion;

public class ServiceSpaException extends SpaExcepcion {
	
	private static final long serialVersionUID = -1983857422331149874L;


	public ServiceSpaException(Throwable excepcionRaiz, String mensajeUsuario, String mensajeTecnico) {
		super(excepcionRaiz, mensajeUsuario, mensajeTecnico, LugarExcepcion.SERVICE);
	}
	
	public static final SpaExcepcion crear(final String mensajeUsuario) {
		return new ServiceSpaException(null, mensajeUsuario,mensajeUsuario);
	}
	
	public static final SpaExcepcion crear (final String mensajeUsuario, final String mensajeTecnico) {
		return new ServiceSpaException(null, mensajeUsuario, mensajeTecnico);
	}
	
	public static final SpaExcepcion crear (final Throwable excepcionRaiz, final String mensajeUsuario, final String mensajeTecnico) {
		return new ServiceSpaException(excepcionRaiz, mensajeUsuario, mensajeTecnico);
	}

}
