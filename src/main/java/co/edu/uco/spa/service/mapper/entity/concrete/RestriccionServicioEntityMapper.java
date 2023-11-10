package co.edu.uco.spa.service.mapper.entity.concrete;

import co.edu.uco.spa.crosscutting.excepcion.concrete.ServiceSpaException;
import co.edu.uco.spa.crosscutting.excepcion.messages.CatalogoMensajes;
import co.edu.uco.spa.crosscutting.excepcion.messages.enumerator.CodigoMensaje;
import co.edu.uco.spa.crosscutting.util.UtilObjeto;
import co.edu.uco.spa.data.entity.RestriccionServicioEntity;
import co.edu.uco.spa.service.domain.restriccionservicio.RestriccionServicioDomain;
import co.edu.uco.spa.service.mapper.entity.EntityMapper;

public class RestriccionServicioEntityMapper  implements EntityMapper<RestriccionServicioEntity, RestriccionServicioDomain>{

	@Override
	public RestriccionServicioDomain toDomain(RestriccionServicioEntity entity) {
		if(UtilObjeto.esNulo(entity)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000095);
			throw ServiceSpaException.crear(mensajeUsuario,mensajeTecnico);	
			
		}
		
		
		return RestriccionServicioDomain.crear(entity.getId(), entity.getRestriccionServicio());
		
	}

	@Override
	public RestriccionServicioEntity toEntity(RestriccionServicioDomain domain) {
		if(UtilObjeto.esNulo(domain)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000096);
			throw ServiceSpaException.crear(mensajeUsuario,mensajeTecnico);	
			
		}
		

		
		return RestriccionServicioEntity.crear(domain.getId(), domain.getRestriccionServicio());
	}
	
	
	
	
	

}
