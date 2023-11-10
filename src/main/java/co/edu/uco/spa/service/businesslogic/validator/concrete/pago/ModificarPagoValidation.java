package co.edu.uco.spa.service.businesslogic.validator.concrete.pago;

import co.edu.uco.spa.service.businesslogic.validator.Validator;
import co.edu.uco.spa.service.domain.notificacion.rules.NotificacionNotificacionValidationRule;
import co.edu.uco.spa.service.domain.pago.PagoDomain;
import co.edu.uco.spa.service.domain.pago.rules.EstadoPagoValidationRule;
import co.edu.uco.spa.service.domain.pago.rules.IdPagoValidationRule;
import co.edu.uco.spa.service.domain.pago.rules.MontoPagoValidationRule;
import co.edu.uco.spa.service.domain.pago.rules.PagoConfirmadoPagoValidationRule;
import co.edu.uco.spa.service.domain.tipopago.rules.TipoPagoTipoPagoValidationRule;


public class ModificarPagoValidation implements Validator<PagoDomain> {
	
	
private static final Validator<PagoDomain> instancia = new ModificarPagoValidation();

	


	
	
	public final void execute(final PagoDomain  data) {
		IdPagoValidationRule.ejecutarValidacion(data);
		TipoPagoTipoPagoValidationRule.ejecutarValidacion(data);
		PagoConfirmadoPagoValidationRule.ejecutarValidacion(data);
		MontoPagoValidationRule.ejecutarValidacion(data);
		EstadoPagoValidationRule.ejecutarValidacion(data);
		NotificacionNotificacionValidationRule.ejecutarValidacion(data);
		
			
		
	}
	public static final void ejecutar (final PagoDomain data) {
		instancia.execute(data);
	}

}
