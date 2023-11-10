package co.edu.uco.spa.service.mapper.entity.concrete;

import co.edu.uco.spa.crosscutting.excepcion.concrete.ServiceSpaException;
import co.edu.uco.spa.crosscutting.excepcion.messages.CatalogoMensajes;
import co.edu.uco.spa.crosscutting.excepcion.messages.enumerator.CodigoMensaje;
import co.edu.uco.spa.crosscutting.util.UtilObjeto;
import co.edu.uco.spa.data.entity.ServicioEntity;
import co.edu.uco.spa.service.domain.servicio.ServicioDomain;
import co.edu.uco.spa.service.mapper.entity.EntityMapper;

public class ServicioEntityMapper implements EntityMapper<ServicioEntity, ServicioDomain>{

	@Override
	public ServicioDomain toDomain(ServicioEntity entity) {
		if(UtilObjeto.esNulo(entity)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000097);
			throw ServiceSpaException.crear(mensajeUsuario,mensajeTecnico);	
			
		}
		
		
		return ServicioDomain.crear(null, null, null, null);
	}

	@Override
	public ServicioEntity toEntity(ServicioDomain domain) {
		if(UtilObjeto.esNulo(domain)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000098);
			throw ServiceSpaException.crear(mensajeUsuario,mensajeTecnico);	
			
		}
				return ServicioEntity.crear(null, null, null, null);
	}
	
	
	

}
