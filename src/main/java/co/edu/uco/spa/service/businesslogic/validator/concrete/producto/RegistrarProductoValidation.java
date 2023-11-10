package co.edu.uco.spa.service.businesslogic.validator.concrete.producto;

import co.edu.uco.spa.service.businesslogic.validator.Validator;

import co.edu.uco.spa.service.domain.producto.ProductoDomain;
import co.edu.uco.spa.service.domain.producto.rules.CantidadExistenteProductoValidationRule;
import co.edu.uco.spa.service.domain.producto.rules.IdProductoValidationRule;
import co.edu.uco.spa.service.domain.producto.rules.IdTipoProductoProductoValidationRule;
import co.edu.uco.spa.service.domain.producto.rules.NombreProductoValidationRule;
import co.edu.uco.spa.service.domain.producto.rules.PrecioUnitarioProductoValidationRule;
import co.edu.uco.spa.service.domain.producto.rules.UnidadMedidaProductoValidationRule;

public class RegistrarProductoValidation implements Validator<ProductoDomain>{
	
	
	
	
private static final Validator<ProductoDomain> instancia = new RegistrarProductoValidation();

	


	
	
	public final void execute(final ProductoDomain  data) {
		IdProductoValidationRule.ejecutarValidacion(data);
		IdTipoProductoProductoValidationRule.ejecutarValidacion(data);
		NombreProductoValidationRule.ejecutarValidacion(data);
		CantidadExistenteProductoValidationRule.ejecutarValidacion(data);
		PrecioUnitarioProductoValidationRule.ejecutarValidacion(data);
		UnidadMedidaProductoValidationRule.ejecutarValidacion(data);s
		
		
			
		
	}
	
	
	
	public static final void ejecutar (final ProductoDomain data) {
		instancia.execute(data);
	}


}
