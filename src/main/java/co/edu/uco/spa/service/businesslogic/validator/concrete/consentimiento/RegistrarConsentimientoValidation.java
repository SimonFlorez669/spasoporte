package co.edu.uco.spa.service.businesslogic.validator.concrete.consentimiento;

import co.edu.uco.spa.service.businesslogic.validator.Validator;
import co.edu.uco.spa.service.businesslogic.validator.concrete.acercanosotros.RegistrarAcercaNosotrosValidator;
import co.edu.uco.spa.service.domain.acercanosotros.AcercaNosotrosDomain;
import co.edu.uco.spa.service.domain.consentimiento.ConsentimientoDomain;
import co.edu.uco.spa.service.domain.consentimiento.rules.DocumentoConsentimientoValidationRule;
import co.edu.uco.spa.service.domain.consentimiento.rules.IdConsentimientoConsentimientoValidationRule;
import co.edu.uco.spa.service.domain.consentimiento.rules.IdConsentimientoValidationRule;

public class RegistrarConsentimientoValidation  implements Validator<ConsentimientoDomain>{

	
	private static final Validator<ConsentimientoDomain> instancia = new RegistrarConsentimientoValidation();

		
		


			
			
			public final void execute(final ConsentimientoDomain  data) {
				IdConsentimientoConsentimientoValidationRule.ejecutarValidacion(data);
				IdConsentimientoValidationRule.ejecutarValidacion(data);
				DocumentoConsentimientoValidationRule.ejecutarValidacion(data);
				
					
				
			}
			public static final void ejecutar (final ConsentimientoDomain data) {
				instancia.execute(data);
			}
			
			
		
			
			
			
}
