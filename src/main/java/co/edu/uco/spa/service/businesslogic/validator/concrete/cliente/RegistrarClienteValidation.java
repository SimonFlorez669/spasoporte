package co.edu.uco.spa.service.businesslogic.validator.concrete.cliente;

import co.edu.uco.spa.service.businesslogic.validator.Validator;
import co.edu.uco.spa.service.domain.clientes.ClientesDomain;
import co.edu.uco.spa.service.domain.clientes.rules.IdClientesValidationRule;
import co.edu.uco.spa.service.domain.support.correoelectronicocompletoclientesdomain.rules.CorreoElectronicoConfirmadoValidationRule;
import co.edu.uco.spa.service.domain.support.identificacioncompletaclientes.rules.NumeroIdentificacionValidationRule;
import co.edu.uco.spa.service.domain.support.informacionpersonalclientes.rules.ApellidoValidationRule;
import co.edu.uco.spa.service.domain.support.informacionpersonalclientes.rules.FechaNacimientoValidationRule;
import co.edu.uco.spa.service.domain.support.informacionpersonalclientes.rules.NombreValidationRule;
import co.edu.uco.spa.service.domain.support.numerotelefonocompletoclientes.rules.NumeroTelefonoValidationRule;
import co.edu.uco.spa.service.domain.support.ubicacionsucursal.rules.DireccionValidationRule;
import co.edu.uco.spa.service.domain.tipousuario.rules.IdTipoUsuarioValidationRule;

public class RegistrarClienteValidation implements Validator<ClientesDomain> {
	
private static final Validator<ClientesDomain> instancia = new RegistrarClienteValidation();



	
	
	@Override
	public final void execute(final ClientesDomain data) {
		IdClientesValidationRule.ejecutarValidacion(data);
		IdTipoUsuarioValidationRule.ejecutarValidacion(data);
		CorreoElectronicoConfirmadoValidationRule.ejecutarValidacion(data);
	    NumeroTelefonoValidationRule.ejecutarValidacion(data);
	    NumeroIdentificacionValidationRule.ejecutarValidacion(data);
	    DireccionValidationRule.ejecutarValidacion(data);
        ApellidoValidationRule.ejecutarValidacion(data);	
        FechaNacimientoValidationRule.ejecutarValidacion(data);
        NombreValidationRule.ejecutarValidacion(data);
		
			
		
	}
	public static final void ejecutar (final ClientesDomain data) {
		instancia.execute(data);
	}
	
	

}
