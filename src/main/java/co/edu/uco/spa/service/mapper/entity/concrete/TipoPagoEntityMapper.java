package co.edu.uco.spa.service.mapper.entity.concrete;

import co.edu.uco.spa.crosscutting.excepcion.concrete.ServiceSpaException;
import co.edu.uco.spa.crosscutting.excepcion.messages.CatalogoMensajes;
import co.edu.uco.spa.crosscutting.excepcion.messages.enumerator.CodigoMensaje;
import co.edu.uco.spa.crosscutting.util.UtilObjeto;
import co.edu.uco.spa.data.entity.TipoPagoEntity;
import co.edu.uco.spa.service.domain.tipopago.TipoPagoDomain;
import co.edu.uco.spa.service.mapper.entity.EntityMapper;

public class TipoPagoEntityMapper implements EntityMapper<TipoPagoEntity, TipoPagoDomain>{

	@Override
	public TipoPagoDomain toDomain(TipoPagoEntity entity) {
		if(UtilObjeto.esNulo(entity)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000102);
			throw ServiceSpaException.crear(mensajeUsuario,mensajeTecnico);	
			
		}
		
		
		return TipoPagoDomain.crear(entity.getId(), entity.getTipoPago());
	}

	@Override
	public TipoPagoEntity toEntity(TipoPagoDomain domain) {
		if(UtilObjeto.esNulo(domain)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000103);
			throw ServiceSpaException.crear(mensajeUsuario,mensajeTecnico);	
			
		}
				return TipoPagoEntity.crear(domain.getId(), domain.getTipoPago());
	}
	
	
	
	
	

}
