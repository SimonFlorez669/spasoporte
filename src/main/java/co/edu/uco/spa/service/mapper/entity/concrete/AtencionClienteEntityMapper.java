package co.edu.uco.spa.service.mapper.entity.concrete;

import co.edu.uco.spa.crosscutting.excepcion.concrete.ServiceSpaException;
import co.edu.uco.spa.crosscutting.excepcion.messages.CatalogoMensajes;
import co.edu.uco.spa.crosscutting.excepcion.messages.enumerator.CodigoMensaje;
import co.edu.uco.spa.crosscutting.util.UtilObjeto;
import co.edu.uco.spa.data.entity.AtencionClienteEntity;
import co.edu.uco.spa.service.domain.atencioncliente.AtencionClienteDomain;
import co.edu.uco.spa.service.mapper.entity.EntityMapper;

public class AtencionClienteEntityMapper implements EntityMapper<AtencionClienteEntity, AtencionClienteDomain>{

	@Override
	public AtencionClienteDomain toDomain(AtencionClienteEntity entity) {
		if(UtilObjeto.esNulo(entity)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000080);
			throw ServiceSpaException.crear(mensajeUsuario,mensajeTecnico);		
		}
			
			return AtencionClienteDomain.crear(entity.getId(), entity.getDiasDeAtencion(), entity.getHorario(), entity.getPlataformaComunicacion());
	}

	@Override
	public AtencionClienteEntity toEntity(AtencionClienteDomain domain) {
		if(UtilObjeto.esNulo(domain)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000082);
			throw ServiceSpaException.crear(mensajeUsuario,mensajeTecnico);
		}
			
			
			return AtencionClienteEntity.crear(domain.getId(), domain.getDiasDeAtencion(), domain.getHorario(), domain.getPlataformaComunicacion());
			
	}
	
	

}
