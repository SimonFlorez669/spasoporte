package co.edu.uco.spa.service.businesslogic.validator.concrete.atencioncliente;

import co.edu.uco.spa.service.businesslogic.validator.Validator;
import co.edu.uco.spa.service.domain.atencioncliente.AtencionClienteDomain;
import co.edu.uco.spa.service.domain.atencioncliente.rules.DiasDeAtencionAtencionClienteValidationRule;
import co.edu.uco.spa.service.domain.atencioncliente.rules.HorarioAtencionClienteValidationRule;
import co.edu.uco.spa.service.domain.atencioncliente.rules.IdAtencionAtencionClienteValidationRule;
import co.edu.uco.spa.service.domain.atencioncliente.rules.PlataformaComunicacionAtencionClienteValidationRule;

public class ModificarAtencionClienteValidator implements Validator<AtencionClienteDomain> {


	private static final Validator<AtencionClienteDomain> instancia = new ModificarAtencionClienteValidator();

	
	
	@Override
	public final void execute(final AtencionClienteDomain data) {
			
			IdAtencionAtencionClienteValidationRule.ejecutarValidacion(data);
			DiasDeAtencionAtencionClienteValidationRule.ejecutarValidacion(data);
			HorarioAtencionClienteValidationRule.ejecutarValidacion(data);
			PlataformaComunicacionAtencionClienteValidationRule.ejecutarValidacion(data);
		
		
	}
	public static final void ejecutar (final AtencionClienteDomain data) {
		instancia.execute(data);
	}
	
	
	

}
