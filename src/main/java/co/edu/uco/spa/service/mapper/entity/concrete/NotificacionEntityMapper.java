package co.edu.uco.spa.service.mapper.entity.concrete;

import co.edu.uco.spa.crosscutting.excepcion.concrete.ServiceSpaException;
import co.edu.uco.spa.crosscutting.excepcion.messages.CatalogoMensajes;
import co.edu.uco.spa.crosscutting.excepcion.messages.enumerator.CodigoMensaje;
import co.edu.uco.spa.crosscutting.util.UtilObjeto;
import co.edu.uco.spa.data.entity.NotificacionEntity;
import co.edu.uco.spa.service.domain.notificacion.NotificacionDomain;
import co.edu.uco.spa.service.mapper.entity.EntityMapper;

public class NotificacionEntityMapper implements EntityMapper<NotificacionEntity, NotificacionDomain>{

	@Override
	public NotificacionDomain toDomain(NotificacionEntity entity) {
		
		if(UtilObjeto.esNulo(entity)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000087);
			throw ServiceSpaException.crear(mensajeUsuario,mensajeTecnico);	
			
		}
		
		return NotificacionDomain.crear(entity.getId(), entity.getNotificacion());
	}

	@Override
	public NotificacionEntity toEntity(NotificacionDomain domain) {
		if(UtilObjeto.esNulo(domain)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000088);
			throw ServiceSpaException.crear(mensajeUsuario,mensajeTecnico);	
			
		}		
		return NotificacionEntity.crear(domain.getId(), domain.getNotificacion());
	}
	
	
	
	
	
	

}
