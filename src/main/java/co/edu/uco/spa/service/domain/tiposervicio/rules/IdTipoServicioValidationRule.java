package co.edu.uco.spa.service.domain.tiposervicio.rules;

import co.edu.uco.spa.crosscutting.excepcion.concrete.ServiceSpaException;
import co.edu.uco.spa.crosscutting.excepcion.messages.CatalogoMensajes;
import co.edu.uco.spa.crosscutting.excepcion.messages.enumerator.CodigoMensaje;
import co.edu.uco.spa.crosscutting.util.UtilTexto;
import co.edu.uco.spa.service.domain.ValidationRule;

public class IdTipoServicioValidationRule implements ValidationRule<String>{

	private static final ValidationRule<String> instancia = new IdTipoServicioValidationRule();
	private IdTipoServicioValidationRule() {
		super();
	}
	
	public static final void ejecutarValidacion(final String dato) {
		instancia.validar(dato);
	}
	
	@Override
	public void validar(String dato) {
		validarLongitud(dato);
		validarObligatoriedad(dato);
		validarFormato(dato);
		
	}
	
	private final void validarLongitud(final String dato) {
		if(UtilTexto.longitudMaximaValida(dato,50)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			throw ServiceSpaException.crear(mensajeUsuario);	

			
		}
	}
	private final void validarObligatoriedad(final String dato) {
		if(UtilTexto.estaVacio(dato)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			throw ServiceSpaException.crear(mensajeUsuario);
		}
	}
	private final void validarFormato(final String dato) {
		if(!UtilTexto.contieneSoloLetras(dato)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			throw ServiceSpaException.crear(mensajeUsuario);
		}
	}
	
	

}
