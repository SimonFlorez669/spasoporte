package co.edu.uco.spa.service.businesslogic.validator.concrete.precios;

import co.edu.uco.spa.service.businesslogic.validator.Validator;
import co.edu.uco.spa.service.domain.precios.PreciosDomain;
import co.edu.uco.spa.service.domain.precios.rules.IdPreciosValidationRule;
import co.edu.uco.spa.service.domain.precios.rules.PreciosPreciosValidationRule;


public class ModificarPreciosValidation implements Validator<PreciosDomain>{
	
	
	
	
private static final Validator<PreciosDomain> instancia = new ModificarPreciosValidation();

	


	
	
	public final void execute(final PreciosDomain  data) {
		
		IdPreciosValidationRule.ejecutarValidacion(data);
		PreciosPreciosValidationRule.ejecutarValidacion(data);
			
		
	}
	
	
	
	public static final void ejecutar (final PreciosDomain data) {
		instancia.execute(data);
	}


}
