package co.edu.uco.spa.service.businesslogic.validator.servicio;

import co.edu.uco.spa.service.businesslogic.validator.Validator;
import co.edu.uco.spa.service.domain.restriccionservicio.rules.RestriccionServicioRestriccionServicioValidationRule;
import co.edu.uco.spa.service.domain.servicio.ServicioDomain;
import co.edu.uco.spa.service.domain.servicio.rules.IdServicioValidationRule;
import co.edu.uco.spa.service.domain.tiposervicio.rules.TipoServicioTipoServicioValidationRule;

public class ModificarServicioValidation implements Validator<ServicioDomain> {
	
	
private static final Validator<ServicioDomain> instancia = new ModificarServicioValidation();

	


	
	
	public final void execute(final ServicioDomain  data) {
		
		IdServicioValidationRule.ejecutarValidacion(data);
		TipoServicioTipoServicioValidationRule.ejecutarValidacion(data);
		RestriccionServicioRestriccionServicioValidationRule.ejecutarValidacion(data);
		
		
			
		
	}
	
	
	
	public static final void ejecutar (final ServicioDomain data) {
		instancia.execute(data);
	}


}
