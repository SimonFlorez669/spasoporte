package co.edu.uco.spa.service.mapper.entity.concrete;

import co.edu.uco.spa.crosscutting.excepcion.concrete.ServiceSpaException;
import co.edu.uco.spa.crosscutting.excepcion.messages.CatalogoMensajes;
import co.edu.uco.spa.crosscutting.excepcion.messages.enumerator.CodigoMensaje;
import co.edu.uco.spa.crosscutting.util.UtilObjeto;
import co.edu.uco.spa.data.entity.PreciosEntity;
import co.edu.uco.spa.service.domain.precios.PreciosDomain;
import co.edu.uco.spa.service.mapper.entity.EntityMapper;

public class PreciosEntityMapper implements EntityMapper<PreciosEntity, PreciosDomain>{

	@Override
	public PreciosDomain toDomain(PreciosEntity entity) {
		
		if(UtilObjeto.esNulo(entity)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000091);
			throw ServiceSpaException.crear(mensajeUsuario,mensajeTecnico);	
			
		}
		
		
		return PreciosDomain.crear(entity.getId(), entity.getPrecios());
	}

	@Override
	public PreciosEntity toEntity(PreciosDomain domain) {
		if(UtilObjeto.esNulo(domain)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000092);
			throw ServiceSpaException.crear(mensajeUsuario,mensajeTecnico);	
			
		}		return PreciosEntity.crear(domain.getId(), domain.getPrecios());
	}
	
	
	
	
	

}
