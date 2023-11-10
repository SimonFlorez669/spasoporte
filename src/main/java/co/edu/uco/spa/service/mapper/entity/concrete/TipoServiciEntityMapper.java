package co.edu.uco.spa.service.mapper.entity.concrete;

import co.edu.uco.spa.crosscutting.excepcion.concrete.ServiceSpaException;
import co.edu.uco.spa.crosscutting.excepcion.messages.CatalogoMensajes;
import co.edu.uco.spa.crosscutting.excepcion.messages.enumerator.CodigoMensaje;
import co.edu.uco.spa.crosscutting.util.UtilObjeto;
import co.edu.uco.spa.data.entity.TipoServicioEntity;
import co.edu.uco.spa.service.domain.tiposervicio.TipoServicioDomain;
import co.edu.uco.spa.service.mapper.entity.EntityMapper;

public class TipoServiciEntityMapper  implements EntityMapper<TipoServicioEntity, TipoServicioDomain> {

	@Override
	public TipoServicioDomain toDomain(TipoServicioEntity entity) {
		if(UtilObjeto.esNulo(entity)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000106);
			throw ServiceSpaException.crear(mensajeUsuario,mensajeTecnico);	
			
		}		return TipoServicioDomain.crear(entity.getId(), entity.getTipoServicio());
	}

	@Override
	public TipoServicioEntity toEntity(TipoServicioDomain domain) {
		if(UtilObjeto.esNulo(domain)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000118);
			throw ServiceSpaException.crear(mensajeUsuario,mensajeTecnico);	
			
		}		return TipoServicioEntity.crear(domain.getId(), domain.getTipoServicio());
	}
	
	
	
	
	
	

}
