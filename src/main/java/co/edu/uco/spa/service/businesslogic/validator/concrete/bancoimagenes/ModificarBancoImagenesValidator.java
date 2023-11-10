package co.edu.uco.spa.service.businesslogic.validator.concrete.bancoimagenes;

import co.edu.uco.spa.service.businesslogic.validator.Validator;
import co.edu.uco.spa.service.domain.bancoimagenes.BancoImagenesDomain;
import co.edu.uco.spa.service.domain.bancoimagenes.rules.DescripcionBancoImagenesValidationRule;
import co.edu.uco.spa.service.domain.bancoimagenes.rules.FormatoImagenBancoImagenesValidationRule;
import co.edu.uco.spa.service.domain.bancoimagenes.rules.IdBancoImagenesValidationRule;
import co.edu.uco.spa.service.domain.bancoimagenes.rules.TipoImagenBancoImagenesValidationRule;

public class ModificarBancoImagenesValidator implements Validator<BancoImagenesDomain> {
	
private static final Validator<BancoImagenesDomain> instancia = new ModificarBancoImagenesValidator();

	
	
	@Override
	public final void execute(final BancoImagenesDomain data) {
			IdBancoImagenesValidationRule.ejecutarValidacion(data);
			TipoImagenBancoImagenesValidationRule.ejecutarValidacion(data);
			FormatoImagenBancoImagenesValidationRule.ejecutarValidacion(data);
			DescripcionBancoImagenesValidationRule.ejecutarValidacion(data);
			
		
	}
	public static final void ejecutar (final BancoImagenesDomain data) {
		instancia.execute(data);
	}
	

}
