package co.edu.uco.spa.service.mapper.entity.concrete;

import co.edu.uco.spa.crosscutting.excepcion.concrete.ServiceSpaException;
import co.edu.uco.spa.crosscutting.excepcion.messages.CatalogoMensajes;
import co.edu.uco.spa.crosscutting.excepcion.messages.enumerator.CodigoMensaje;
import co.edu.uco.spa.crosscutting.util.UtilObjeto;
import co.edu.uco.spa.data.entity.ConsentimientoEntity;
import co.edu.uco.spa.service.domain.consentimiento.ConsentimientoDomain;
import co.edu.uco.spa.service.mapper.entity.EntityMapper;

public class ConsentimientoEntityMapper implements EntityMapper<ConsentimientoEntity, ConsentimientoDomain>{

	@Override
	public ConsentimientoDomain toDomain(ConsentimientoEntity entity) {
		if(UtilObjeto.esNulo(entity)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000070);
			throw ServiceSpaException.crear(mensajeUsuario,mensajeTecnico);
			
		}
			
			return ConsentimientoDomain.crear(entity.getId(), entity.getIdConsentimiento(), entity.getDocumento());
	}

	@Override
	public ConsentimientoEntity toEntity(ConsentimientoDomain domain) {
		if(UtilObjeto.esNulo(domain)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000071);
			throw ServiceSpaException.crear(mensajeUsuario,mensajeTecnico);	
			
		}
			
			return ConsentimientoEntity.crear(domain.getId(), domain.getIdConsentimiento(), domain.getDocumento());
	}
	
	
	

}
