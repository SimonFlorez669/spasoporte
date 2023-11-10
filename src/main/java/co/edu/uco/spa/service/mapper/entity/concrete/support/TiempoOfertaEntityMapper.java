package co.edu.uco.spa.service.mapper.entity.concrete.support;

import co.edu.uco.spa.crosscutting.excepcion.concrete.ServiceSpaException;
import co.edu.uco.spa.crosscutting.excepcion.messages.CatalogoMensajes;
import co.edu.uco.spa.crosscutting.excepcion.messages.enumerator.CodigoMensaje;
import co.edu.uco.spa.crosscutting.util.UtilObjeto;
import co.edu.uco.spa.data.entity.support.TiempoOfertaOfertaEntity;
import co.edu.uco.spa.service.domain.support.TiempoOfertaDomain;
import co.edu.uco.spa.service.mapper.entity.EntityMapper;

public class TiempoOfertaEntityMapper implements EntityMapper<TiempoOfertaOfertaEntity, TiempoOfertaDomain>{

	@Override
	public TiempoOfertaDomain toDomain(TiempoOfertaOfertaEntity entity) {
		if(UtilObjeto.esNulo(entity)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000070);
			throw ServiceSpaException.crear(mensajeUsuario,mensajeTecnico);		
		}
			
			
			return TiempoOfertaDomain.crear(entity.getDesde(), entity.getHasta());
	}

	@Override
	public TiempoOfertaOfertaEntity toEntity(TiempoOfertaDomain domain) {
		if(UtilObjeto.esNulo(domain)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000071);
			throw ServiceSpaException.crear(mensajeUsuario,mensajeTecnico);		
		}
			
			return TiempoOfertaOfertaEntity.crear(domain.getDesde(), domain.getHasta());
	}
	

}
