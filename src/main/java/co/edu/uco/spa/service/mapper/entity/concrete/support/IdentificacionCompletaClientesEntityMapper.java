package co.edu.uco.spa.service.mapper.entity.concrete.support;


import co.edu.uco.spa.crosscutting.excepcion.concrete.ServiceSpaException;
import co.edu.uco.spa.crosscutting.excepcion.messages.CatalogoMensajes;
import co.edu.uco.spa.crosscutting.excepcion.messages.enumerator.CodigoMensaje;
import co.edu.uco.spa.crosscutting.util.UtilObjeto;
import co.edu.uco.spa.data.entity.support.IdentificacionCompletaClientesEntity;
import co.edu.uco.spa.service.domain.support.IdentificacionCompletaClientesDomain;
import co.edu.uco.spa.service.mapper.entity.EntityMapper;

public class IdentificacionCompletaClientesEntityMapper implements EntityMapper<IdentificacionCompletaClientesEntity, IdentificacionCompletaClientesDomain>{

	@Override
	public IdentificacionCompletaClientesDomain toDomain(IdentificacionCompletaClientesEntity entity) {
		if(UtilObjeto.esNulo(entity)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000070);
			throw ServiceSpaException.crear(mensajeUsuario,mensajeTecnico);
		
		}
		
		return IdentificacionCompletaClientesDomain.crear(null, 0);
	}

	@Override
	public IdentificacionCompletaClientesEntity toEntity(IdentificacionCompletaClientesDomain domain) {
		if(UtilObjeto.esNulo(domain)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000071);
			throw ServiceSpaException.crear(mensajeUsuario,mensajeTecnico);	
		}
			return IdentificacionCompletaClientesEntity.crear(null, 0);
	}
	
	
	
	

}
