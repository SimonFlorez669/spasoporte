package co.edu.uco.spa.crosscutting.excepcion.concrete;

import co.edu.uco.spa.crosscutting.excepcion.SpaExcepcion;
import co.edu.uco.spa.crosscutting.excepcion.enumerator.LugarExcepcion;

public class ControllerSpaException extends SpaExcepcion{

	

	public ControllerSpaException(Throwable excepcionRaiz, String mensajeUsuario, String mensajeTecnico,
			LugarExcepcion lugar) {
		super(excepcionRaiz, mensajeUsuario, mensajeTecnico, lugar);
	}

	private static final long serialVersionUID = 1L;

}
