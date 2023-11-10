package co.edu.uco.spa.crosscutting.excepcion.concrete;

import co.edu.uco.spa.crosscutting.excepcion.SpaExcepcion;
import co.edu.uco.spa.crosscutting.excepcion.enumerator.LugarExcepcion;

public class CrosscuttingSpaExcepcion extends SpaExcepcion{
	
	private static final long serialVersionUID = -9177484194129685659L;

	

	public CrosscuttingSpaExcepcion(Throwable excepcionRaiz, String mensajeUsuario, String mensajeTecnico) {
		super(excepcionRaiz,mensajeUsuario,mensajeTecnico,LugarExcepcion.CROSSCUTING);
	}
  
	
	
	public static final SpaExcepcion crear(final String mensajeUsuario) {
		return new DataSpaExeption(null, mensajeUsuario, mensajeUsuario);
	}
	
	
	
	public static final SpaExcepcion crear (final String mensajeUsuario,final String mensajeTecnico) {
		return new DataSpaExeption(null, mensajeUsuario, mensajeTecnico);
		
	}
	public static final SpaExcepcion crear(final Throwable excepcioRaiz, final String mensajeUsuario, final String mensajeTecnico) {
		return new DataSpaExeption(excepcioRaiz, mensajeUsuario, mensajeTecnico);
	}
	s
	
}
