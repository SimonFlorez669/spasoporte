package co.edu.uco.spa.crosscutting.excepcion.concrete;

import co.edu.uco.spa.crosscutting.excepcion.SpaExcepcion;
import co.edu.uco.spa.crosscutting.excepcion.enumerator.LugarExcepcion;

public class DataSpaExeption extends SpaExcepcion{
	
public DataSpaExeption(final Throwable excepcionRaiz, final String mensajeUsuario,
			String mensajeTecnico) {
		super(excepcionRaiz, mensajeUsuario, mensajeTecnico,LugarExcepcion.DATA);
	}


	
	
	public static final SpaExcepcion crear(final String mensajeUsuario) {
		return new DataSpaExeption(null, mensajeUsuario, mensajeUsuario);
	}
	
	
	
	public static final SpaExcepcion crear (final String mensajeUsuario, final String mensajeTecnico) {
		return new DataSpaExeption(null, mensajeUsuario, mensajeTecnico);
	}
	
	
	
	
	public static final SpaExcepcion crear (final Throwable excepcionRaiz, final String mensajeUsuario, final String mensajeTecnico) {
		return new DataSpaExeption(excepcionRaiz, mensajeUsuario, mensajeTecnico);

}
	
	
}
