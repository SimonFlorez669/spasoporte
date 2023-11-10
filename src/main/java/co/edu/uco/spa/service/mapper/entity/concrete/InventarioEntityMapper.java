package co.edu.uco.spa.service.mapper.entity.concrete;

import co.edu.uco.spa.crosscutting.excepcion.concrete.ServiceSpaException;
import co.edu.uco.spa.crosscutting.excepcion.messages.CatalogoMensajes;
import co.edu.uco.spa.crosscutting.excepcion.messages.enumerator.CodigoMensaje;
import co.edu.uco.spa.crosscutting.util.UtilObjeto;
import co.edu.uco.spa.data.entity.InventarioEntity;
import co.edu.uco.spa.service.domain.inventario.InventarioDomain;
import co.edu.uco.spa.service.mapper.entity.EntityMapper;

public class InventarioEntityMapper implements EntityMapper<InventarioEntity, InventarioDomain> {

	@Override
	public InventarioDomain toDomain(InventarioEntity entity) {
		if(UtilObjeto.esNulo(entity)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000085);
			throw ServiceSpaException.crear(mensajeUsuario,mensajeTecnico);	
			
		}
		
		
		
		return InventarioDomain.crear(null, null, null, null, null);
	}

	@Override
	public InventarioEntity toEntity(InventarioDomain domain) {
		if(UtilObjeto.esNulo(domain)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000086);
			throw ServiceSpaException.crear(mensajeUsuario,mensajeTecnico);	
			
		}		return InventarioEntity.crear(null, null, null, null, null);
	}
	
	
	
	

}
