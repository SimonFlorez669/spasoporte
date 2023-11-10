package co.edu.uco.spa.service.mapper.entity.concrete;

import co.edu.uco.spa.crosscutting.excepcion.concrete.ServiceSpaException;
import co.edu.uco.spa.crosscutting.excepcion.messages.CatalogoMensajes;
import co.edu.uco.spa.crosscutting.excepcion.messages.enumerator.CodigoMensaje;
import co.edu.uco.spa.crosscutting.util.UtilObjeto;
import co.edu.uco.spa.data.entity.TipoProductoEntity;
import co.edu.uco.spa.service.domain.tipoproducto.TipoProductoDomain;
import co.edu.uco.spa.service.mapper.entity.EntityMapper;

public class TipoProductoEntityMapper implements EntityMapper<TipoProductoEntity, TipoProductoDomain> {

	@Override
	public TipoProductoDomain toDomain(TipoProductoEntity entity) {
		if(UtilObjeto.esNulo(entity)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000116);
			throw ServiceSpaException.crear(mensajeUsuario,mensajeTecnico);	
			
		}
		
		return TipoProductoDomain.crear(entity.getId(), entity.getTipoProducto());
		
		
	}
	
	
	

	@Override
	public TipoProductoEntity toEntity(TipoProductoDomain domain) {
		if(UtilObjeto.esNulo(domain)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000117);
			throw ServiceSpaException.crear(mensajeUsuario,mensajeTecnico);	
			
		}		return TipoProductoEntity.crear(domain.getId(), domain.getTipoProducto());
		
		
	}
	
	
	
	
	

}
