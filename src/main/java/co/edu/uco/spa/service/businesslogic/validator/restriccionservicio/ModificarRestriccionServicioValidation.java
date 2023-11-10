package co.edu.uco.spa.service.businesslogic.validator.restriccionservicio;

import co.edu.uco.spa.service.businesslogic.validator.Validator;
import co.edu.uco.spa.service.domain.restriccionservicio.RestriccionServicioDomain;
import co.edu.uco.spa.service.domain.restriccionservicio.rules.IdRestriccionServicioValidationRule;
import co.edu.uco.spa.service.domain.restriccionservicio.rules.RestriccionServicioRestriccionServicioValidationRule;

public class ModificarRestriccionServicioValidation implements Validator<RestriccionServicioDomain>{
	
	
private static final Validator<RestriccionServicioDomain> instancia = new ModificarRestriccionServicioValidation();

	


	
	
	public final void execute(final RestriccionServicioDomain  data) {
		
		
		IdRestriccionServicioValidationRule.ejecutarValidacion(data);
		RestriccionServicioRestriccionServicioValidationRule.ejecutarValidacion(data);
		
		
		
		
			
		
	}
	
	
	
	public static final void ejecutar (final RestriccionServicioDomain data) {
		instancia.execute(data);
	}


}
