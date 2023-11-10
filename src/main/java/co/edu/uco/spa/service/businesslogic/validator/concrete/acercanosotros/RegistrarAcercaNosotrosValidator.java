package co.edu.uco.spa.service.businesslogic.validator.concrete.acercanosotros;

import co.edu.uco.spa.service.businesslogic.validator.Validator;
import co.edu.uco.spa.service.domain.acercanosotros.AcercaNosotrosDomain;
import co.edu.uco.spa.service.domain.acercanosotros.rules.CertificadoAcercaNosotrosValidationRule;
import co.edu.uco.spa.service.domain.acercanosotros.rules.IdAcercaNosotrosValidationRule;
import co.edu.uco.spa.service.domain.acercanosotros.rules.MisionAcercaNosotrosValidationRule;
import co.edu.uco.spa.service.domain.acercanosotros.rules.RedesSocialesAcercaNosotrosValidatioRule;
import co.edu.uco.spa.service.domain.acercanosotros.rules.UbicacionAcercaNosotrosValidationRule;
import co.edu.uco.spa.service.domain.acercanosotros.rules.VisionAcercaNosotrosValidationRule;

public class RegistrarAcercaNosotrosValidator implements Validator<AcercaNosotrosDomain>{

	
	private static final Validator<AcercaNosotrosDomain> instancia = new RegistrarAcercaNosotrosValidator();

	
	
	@Override
	public final void execute(final AcercaNosotrosDomain data) {
		IdAcercaNosotrosValidationRule.ejecutarValidacion(data);
		MisionAcercaNosotrosValidationRule.ejecutarValidacion(data);
		VisionAcercaNosotrosValidationRule.ejecutarValidacion(data);
		UbicacionAcercaNosotrosValidationRule.ejecutarValidacion(data);
		RedesSocialesAcercaNosotrosValidatioRule.ejecutarValidacion(data);
		CertificadoAcercaNosotrosValidationRule.ejecutarValidacion(data);
		
	}
	
	public static final void ejecutar (final AcercaNosotrosDomain data) {
		instancia.execute(data);
	}

}
