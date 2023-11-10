package co.edu.uco.spa.service.businesslogic.validator.concrete.direccion;

import co.edu.uco.spa.service.businesslogic.validator.Validator;
import co.edu.uco.spa.service.domain.direccion.DireccionDomain;
import co.edu.uco.spa.service.domain.direccion.rules.BarrioDireccionValidationRule;
import co.edu.uco.spa.service.domain.direccion.rules.IdDirecionValidationRule;
import co.edu.uco.spa.service.domain.support.ubicacionsucursal.rules.DireccionValidationRule;

public class ModificarDireccionValidation implements Validator<DireccionDomain>{
	
	
	
	private static final Validator<DireccionDomain> instancia = new ModificarDireccionValidation();

	
	


	
	
	public final void execute(final DireccionDomain  data) {
		IdDirecionValidationRule.ejecutarValidacion(data);
		DireccionValidationRule.ejecutarValidacion(data);
		BarrioDireccionValidationRule.ejecutarValidacion(data);
		
		
			
		
	}
	public static final void ejecutar (final DireccionDomain data) {
		instancia.execute(data);
	}
	
	

	

}
