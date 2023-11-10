package co.edu.uco.spa.service.mapper.entity.concrete;

import co.edu.uco.spa.crosscutting.excepcion.concrete.ServiceSpaException;
import co.edu.uco.spa.crosscutting.excepcion.messages.CatalogoMensajes;
import co.edu.uco.spa.crosscutting.excepcion.messages.enumerator.CodigoMensaje;
import co.edu.uco.spa.crosscutting.util.UtilObjeto;
import co.edu.uco.spa.data.entity.TipoImagenEntity;
import co.edu.uco.spa.service.domain.tipoimagen.TipoImagenDomain;
import co.edu.uco.spa.service.mapper.entity.EntityMapper;

public class TipoImagenEntityMapper implements EntityMapper<TipoImagenEntity, TipoImagenDomain>{

	@Override
	public TipoImagenDomain toDomain(TipoImagenEntity entity) {

		if(UtilObjeto.esNulo(entity)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000100);
			throw ServiceSpaException.crear(mensajeUsuario,mensajeTecnico);	
			
		}
		
		return TipoImagenDomain.crear(null,null);
	}

	@Override
	public TipoImagenEntity toEntity(TipoImagenDomain domain) {
		if(UtilObjeto.esNulo(domain)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000101);
			throw ServiceSpaException.crear(mensajeUsuario,mensajeTecnico);	
			
		}		return TipoImagenEntity.crear(null, null);
	}
	
	
	
	
	

}
