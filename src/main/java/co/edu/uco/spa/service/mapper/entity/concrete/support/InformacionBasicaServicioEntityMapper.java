package co.edu.uco.spa.service.mapper.entity.concrete.support;

import co.edu.uco.spa.crosscutting.excepcion.concrete.ServiceSpaException;
import co.edu.uco.spa.crosscutting.excepcion.messages.CatalogoMensajes;
import co.edu.uco.spa.crosscutting.excepcion.messages.enumerator.CodigoMensaje;
import co.edu.uco.spa.crosscutting.util.UtilObjeto;
import co.edu.uco.spa.data.entity.support.InformacionBasicaServicioEntity;
import co.edu.uco.spa.service.domain.support.InformacionPersonalClientesDomain;
import co.edu.uco.spa.service.mapper.entity.EntityMapper;

public class InformacionBasicaServicioEntityMapper implements EntityMapper<InformacionBasicaServicioEntity, InformacionPersonalClientesDomain>{

	@Override
	public InformacionPersonalClientesDomain toDomain(InformacionBasicaServicioEntity entity) {
		if(UtilObjeto.esNulo(entity)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000109);
			throw ServiceSpaException.crear(mensajeUsuario,mensajeTecnico);		
			
		}
		
		return InformacionPersonalClientesDomain.crear(entity.getNombreServicio(), entity.getDescripcionServicio(),null);
	}
	
	
	
	
	@Override
	public InformacionBasicaServicioEntity toEntity(InformacionPersonalClientesDomain domain) {
		if(UtilObjeto.esNulo(domain)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000110);
			throw ServiceSpaException.crear(mensajeUsuario,mensajeTecnico);		
			
		}		return InformacionBasicaServicioEntity.crear(domain.getApellido(), domain.getApellido(), null, 0);
	}

	
	
	
	
	
	
}
