package co.edu.uco.spa.service.mapper.entity.concrete;

import co.edu.uco.spa.crosscutting.excepcion.concrete.ServiceSpaException;
import co.edu.uco.spa.crosscutting.excepcion.messages.CatalogoMensajes;
import co.edu.uco.spa.crosscutting.excepcion.messages.enumerator.CodigoMensaje;
import co.edu.uco.spa.crosscutting.util.UtilObjeto;
import co.edu.uco.spa.data.entity.PagoEntity;
import co.edu.uco.spa.service.domain.pago.PagoDomain;
import co.edu.uco.spa.service.mapper.entity.EntityMapper;

public class PagoEntityMapper  implements EntityMapper<PagoEntity,PagoDomain >{

	@Override
	public PagoDomain toDomain(PagoEntity entity) {
		if(UtilObjeto.esNulo(entity)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000089);
			throw ServiceSpaException.crear(mensajeUsuario,mensajeTecnico);	
			
		}
		
		return PagoDomain.crear(null, null, false, 0, null, null);
	}

	@Override
	public PagoEntity toEntity(PagoDomain domain) {
		if(UtilObjeto.esNulo(domain)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000090);
			throw ServiceSpaException.crear(mensajeUsuario,mensajeTecnico);	
			
		}		return PagoEntity.crear(null, null, false, 0, null, null);
	}
	
	
	

}
