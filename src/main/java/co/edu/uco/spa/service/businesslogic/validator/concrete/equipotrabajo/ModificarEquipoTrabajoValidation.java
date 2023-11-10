package co.edu.uco.spa.service.businesslogic.validator.concrete.equipotrabajo;

import co.edu.uco.spa.service.businesslogic.validator.Validator;
import co.edu.uco.spa.service.domain.equipotrabajo.EquipoTrabajoDomain;
import co.edu.uco.spa.service.domain.equipotrabajo.rules.CargoEquipoTrabajoValidationRule;
import co.edu.uco.spa.service.domain.equipotrabajo.rules.DescripcionEquipoTrabajoValidationRule;
import co.edu.uco.spa.service.domain.equipotrabajo.rules.FotoEquipoTrabajoValidationRule;
import co.edu.uco.spa.service.domain.equipotrabajo.rules.IdEquipoTrabajoValidationRule;
import co.edu.uco.spa.service.domain.equipotrabajo.rules.NombreEmpleadoEquipoTrabajoValidationRule;
import co.edu.uco.spa.service.domain.equipotrabajo.rules.TituloEquipoTrabajoValidationRule;


public class ModificarEquipoTrabajoValidation implements Validator<EquipoTrabajoDomain>{
	
	private static final Validator<EquipoTrabajoDomain> instancia = new ModificarEquipoTrabajoValidation();

	
	


	
	
	public final void execute(final EquipoTrabajoDomain  data) {
		
		IdEquipoTrabajoValidationRule.ejecutarValidacion(data);
		NombreEmpleadoEquipoTrabajoValidationRule.ejecutarValidacion(data);
		CargoEquipoTrabajoValidationRule.ejecutarValidacion(data);
		TituloEquipoTrabajoValidationRule.ejecutarValidacion(data);
		DescripcionEquipoTrabajoValidationRule.ejecutarValidacion(data);
		FotoEquipoTrabajoValidationRule.ejecutarValidacion(data);
		
			
		
	}
	public static final void ejecutar (final EquipoTrabajoDomain data) {
		instancia.execute(data);
	}
	
	

	

}
