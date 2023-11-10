package co.edu.uco.spa.service.mapper.entity.concrete;

import co.edu.uco.spa.crosscutting.excepcion.concrete.ServiceSpaException;
import co.edu.uco.spa.crosscutting.excepcion.messages.CatalogoMensajes;
import co.edu.uco.spa.crosscutting.excepcion.messages.enumerator.CodigoMensaje;
import co.edu.uco.spa.crosscutting.util.UtilObjeto;
import co.edu.uco.spa.data.entity.ProductoEntity;
import co.edu.uco.spa.service.domain.producto.ProductoDomain;
import co.edu.uco.spa.service.mapper.entity.EntityMapper;

public class ProductoEntityMapper implements EntityMapper<ProductoEntity, ProductoDomain>{

	@Override
	public ProductoDomain toDomain(ProductoEntity entity) {
		if(UtilObjeto.esNulo(entity)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000093);
			throw ServiceSpaException.crear(mensajeUsuario,mensajeTecnico);	
			
		}
				return ProductoDomain.crear(entity.getId(), entity.getIdTipoProducto(), entity.getNombre(), entity.getCantidadExistente(), entity.getPrecioUnitario(), entity.getUnidadMedida());
	}

	@Override
	public ProductoEntity toEntity(ProductoDomain domain) {
		if(UtilObjeto.esNulo(domain)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000094);
			throw ServiceSpaException.crear(mensajeUsuario,mensajeTecnico);	
			
		}
				return ProductoEntity.crear(domain.getId(), domain.getIdTipoProducto(), domain.getNombre(), domain.getCantidadExistente(), domain.getPrecioUnitario(), domain.getUnidadMedida());
				
	}
	
	
	
	
	

}
