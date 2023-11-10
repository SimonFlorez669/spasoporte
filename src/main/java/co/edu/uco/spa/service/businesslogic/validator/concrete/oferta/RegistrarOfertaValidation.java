package co.edu.uco.spa.service.businesslogic.validator.concrete.oferta;

import co.edu.uco.spa.service.businesslogic.validator.Validator;
import co.edu.uco.spa.service.domain.bancoimagenes.rules.DescripcionBancoImagenesValidationRule;
import co.edu.uco.spa.service.domain.bancoimagenes.rules.TipoImagenBancoImagenesValidationRule;
import co.edu.uco.spa.service.domain.oferta.OfertaDomain;
import co.edu.uco.spa.service.domain.oferta.rules.DescripcionOfertaValidationRule;
import co.edu.uco.spa.service.domain.oferta.rules.DescuentoOfertaValidationRule;
import co.edu.uco.spa.service.domain.oferta.rules.IdOfertaValidationRule;
import co.edu.uco.spa.service.domain.servicio.rules.IdServicioValidationRule;
import co.edu.uco.spa.service.domain.support.tiempooferta.rules.DesdeValidationRule;
import co.edu.uco.spa.service.domain.support.tiempooferta.rules.HastaValidationRule;
import co.edu.uco.spa.service.domain.tiposervicio.rules.TipoServicioTipoServicioValidationRule;

public class RegistrarOfertaValidation implements Validator<OfertaDomain>{
	
private static final Validator<OfertaDomain> instancia = new RegistrarOfertaValidation();

	


	
	
	public final void execute(final OfertaDomain  data) {
		IdOfertaValidationRule.ejecutarValidacion(data);
		IdServicioValidationRule.ejecutarValidacion(data);
		DescripcionOfertaValidationRule.ejecutarValidacion(data);
	    DesdeValidationRule.ejecutarValidacion(data);
	    HastaValidationRule.ejecutarValidacion(data);
	    DescuentoOfertaValidationRule.ejecutarValidacion(data);
	    TipoImagenBancoImagenesValidationRule.ejecutarValidacion(data);
	    DescripcionBancoImagenesValidationRule.ejecutarValidacion(data);
		IdServicioValidationRule.ejecutarValidacion(data);
		TipoServicioTipoServicioValidationRule.ejecutarValidacion(data);
			
		
	}
	public static final void ejecutar (final OfertaDomain data) {
		instancia.execute(data);
	}

}
