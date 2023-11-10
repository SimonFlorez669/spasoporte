package co.edu.uco.spa.service.mapper.entity.concrete.support;

import co.edu.uco.spa.crosscutting.excepcion.concrete.ServiceSpaException;
import co.edu.uco.spa.crosscutting.excepcion.messages.CatalogoMensajes;
import co.edu.uco.spa.crosscutting.excepcion.messages.enumerator.CodigoMensaje;
import co.edu.uco.spa.crosscutting.util.UtilObjeto;
import co.edu.uco.spa.data.entity.support.InformacionPersonalClientesEntity;
import co.edu.uco.spa.service.domain.support.InformacionPersonalClientesDomain;
import co.edu.uco.spa.service.mapper.entity.EntityMapper;

public class InformacionPersonalClientesEntityMapper implements EntityMapper<InformacionPersonalClientesEntity, InformacionPersonalClientesDomain>{

	@Override
	public InformacionPersonalClientesDomain toDomain(InformacionPersonalClientesEntity entity) {
		if(UtilObjeto.esNulo(entity)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000070);
			throw ServiceSpaException.crear(mensajeUsuario,mensajeTecnico);	
		}
			return InformacionPersonalClientesDomain.crear(entity.getNombre(), entity.getApellido(), entity.getFechaNacimiento());
	}

	@Override
	public InformacionPersonalClientesEntity toEntity(InformacionPersonalClientesDomain domain) {
		if(UtilObjeto.esNulo(domain)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000071);
			throw ServiceSpaException.crear(mensajeUsuario,mensajeTecnico);		
		}
		
			return InformacionPersonalClientesEntity.crear(domain.getNombre(), domain.getApellido(), domain.getFechaNacimiento());
	}
	
	
	
	

}
