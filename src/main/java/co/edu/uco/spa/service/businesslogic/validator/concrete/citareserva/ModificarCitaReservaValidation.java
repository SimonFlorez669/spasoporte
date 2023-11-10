package co.edu.uco.spa.service.businesslogic.validator.concrete.citareserva;

import co.edu.uco.spa.service.businesslogic.validator.Validator;
import co.edu.uco.spa.service.domain.citareserva.CitaReservaDomain;
import co.edu.uco.spa.service.domain.citareserva.rules.CodigoCitaCitaReservaValidationRule;
import co.edu.uco.spa.service.domain.citareserva.rules.IdCitaReservaValidationRule;

public class ModificarCitaReservaValidation implements Validator<CitaReservaDomain> {
	
	
private static final Validator<CitaReservaDomain> instancia = new ModificarCitaReservaValidation();

	
	
	@Override
	public final void execute(final CitaReservaDomain data) {
		IdCitaReservaValidationRule.ejecutarValidacion(data);
		CodigoCitaCitaReservaValidationRule.ejecutarValidacion(data);
		
			
		
	}
	public static final void ejecutar (final CitaReservaDomain data) {
		instancia.execute(data);
	}

}
