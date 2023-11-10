package co.edu.uco.spa.service.businesslogic.validator.concrete.sucursal;

import co.edu.uco.spa.service.businesslogic.validator.Validator;
import co.edu.uco.spa.service.businesslogic.validator.servicio.ModificarServicioValidation;
import co.edu.uco.spa.service.domain.acercanosotros.rules.UbicacionAcercaNosotrosValidationRule;
import co.edu.uco.spa.service.domain.clientes.rules.IdClientesValidationRule;
import co.edu.uco.spa.service.domain.restriccionservicio.rules.RestriccionServicioRestriccionServicioValidationRule;
import co.edu.uco.spa.service.domain.servicio.ServicioDomain;
import co.edu.uco.spa.service.domain.servicio.rules.IdServicioValidationRule;
import co.edu.uco.spa.service.domain.sucursal.SucursalDomain;
import co.edu.uco.spa.service.domain.sucursal.rules.IdSucursalValidationRule;
import co.edu.uco.spa.service.domain.sucursal.rules.NombreSucursalValidationRule;
import co.edu.uco.spa.service.domain.sucursal.rules.NumeroEmpleadosSucursalValidationRule;
import co.edu.uco.spa.service.domain.sucursal.rules.TelefonoSucursalValidationRule;

public class ModificarSucursalValidation implements Validator<SucursalDomain>{
private static final Validator<SucursalDomain> instancia = new ModificarSucursalValidation();

	


	
	
	public final void execute(final SucursalDomain  data) {
		
		
		IdSucursalValidationRule.ejecutarValidacion(data);
		NombreSucursalValidationRule.ejecutarValidacion(data);
		TelefonoSucursalValidationRule.ejecutarValidacion(data);
		NumeroEmpleadosSucursalValidationRule.ejecutarValidacion(data);
		IdServicioValidationRule.ejecutarValidacion(data);
		IdClientesValidationRule.ejecutarValidacion(data);
		UbicacionAcercaNosotrosValidationRule.ejecutarValidacion(data);
		

		
			
		
	}
	
	
	
	public static final void ejecutar (final SucursalDomain data) {
		instancia.execute(data);
	}


}
