package co.edu.uco.spa.service.businesslogic.validator.concrete.notificacion;

import co.edu.uco.spa.service.businesslogic.validator.Validator;
import co.edu.uco.spa.service.domain.notificacion.NotificacionDomain;
import co.edu.uco.spa.service.domain.notificacion.rules.IdNotificacionValidationRule;
import co.edu.uco.spa.service.domain.notificacion.rules.NotificacionNotificacionValidationRule;

public class RegistrarNotificacionValidation implements Validator<NotificacionDomain>{
	
	
	
private static final Validator<NotificacionDomain> instancia = new RegistrarNotificacionValidation();

	


	
	
	public final void execute(final NotificacionDomain  data) {
		
		IdNotificacionValidationRule.ejecutarValidacion(data);
		NotificacionNotificacionValidationRule.ejecutarValidacion(data);
			
		
	}
	public static final void ejecutar (final NotificacionDomain data) {
		instancia.execute(data);
	}

}
