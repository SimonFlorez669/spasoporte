package co.edu.uco.spa.service.businesslogic.validator.concrete.calificacion;

import co.edu.uco.spa.service.businesslogic.validator.Validator;
import co.edu.uco.spa.service.domain.calificacion.CalificacionDomain;
import co.edu.uco.spa.service.domain.calificacion.rules.CalificacionValidationRule;
import co.edu.uco.spa.service.domain.calificacion.rules.IdCalificacionValidationRule;

public class ModificarCalificacionValidator implements Validator<CalificacionDomain>{
	
	
private static final Validator<CalificacionDomain> instancia = new RegistrarCalificacionValidator();

	
	
	@Override
	public final void execute(final CalificacionDomain data) {
			IdCalificacionValidationRule.ejecutarValidacion(data);
			CalificacionValidationRule.ejecutarValidacion(data);
			
		
	}
	public static final void ejecutar (final CalificacionDomain data) {
		instancia.execute(data);
	}
	

}
