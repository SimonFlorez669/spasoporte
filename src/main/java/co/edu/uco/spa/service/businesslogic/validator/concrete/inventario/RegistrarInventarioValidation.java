package co.edu.uco.spa.service.businesslogic.validator.concrete.inventario;

import co.edu.uco.spa.service.businesslogic.validator.Validator;
import co.edu.uco.spa.service.domain.inventario.InventarioDomain;
import co.edu.uco.spa.service.domain.inventario.rules.IdInventarioValidationRule;
import co.edu.uco.spa.service.domain.producto.rules.CantidadExistenteProductoValidationRule;
import co.edu.uco.spa.service.domain.producto.rules.NombreProductoValidationRule;
import co.edu.uco.spa.service.domain.sucursal.rules.NombreSucursalValidationRule;
import co.edu.uco.spa.service.domain.tipoproducto.rules.TipoProductoTipoProductoValidationRule;

public class RegistrarInventarioValidation implements Validator<InventarioDomain> {
	
private static final Validator<InventarioDomain> instancia = new RegistrarInventarioValidation();

	


	
	
	public final void execute(final InventarioDomain  data) {
		 IdInventarioValidationRule.ejecutarValidacion(data);
		 NombreProductoValidationRule.ejecutarValidacion(data);
		 CantidadExistenteProductoValidationRule.ejecutarValidacion(data);
		 TipoProductoTipoProductoValidationRule.ejecutarValidacion(data);
		 NombreSucursalValidationRule.ejecutarValidacion(data);
		 
		
			
		
	}
	public static final void ejecutar (final InventarioDomain data) {
		instancia.execute(data);
	}
	

}
