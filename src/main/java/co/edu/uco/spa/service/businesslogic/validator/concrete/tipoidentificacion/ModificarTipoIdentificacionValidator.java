package co.edu.uco.spa.service.businesslogic.validator.concrete.tipoidentificacion;

import co.edu.uco.spa.service.businesslogic.validator.Validator;
import co.edu.uco.spa.service.domain.tipoidentificacion.TipoIdentificacionDomain;
import co.edu.uco.spa.service.domain.tipoidentificacion.rules.IdTipoIdentificacionValidationRule;
import co.edu.uco.spa.service.domain.tipoidentificacion.rules.NombreTipoIdentificacionValidationRule;

public class ModificarTipoIdentificacionValidator implements Validator<TipoIdentificacionDomain> {

	
	
	
	
	
private static final Validator<TipoIdentificacionDomain> instancia = new ModificarTipoIdentificacionValidator();
	
	@Override
	public final void execute(final TipoIdentificacionDomain data) {
			NombreTipoIdentificacionValidationRule.ejecutarValidacion(data);
			IdTipoIdentificacionValidationRule.ejecutarValidacion(data);
			
		
		
	}
	public static final void ejecutar (final TipoIdentificacionDomain data) {
		instancia.execute(data);
	}
	
	
}
