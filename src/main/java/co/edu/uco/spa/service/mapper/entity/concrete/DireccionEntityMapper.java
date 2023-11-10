package co.edu.uco.spa.service.mapper.entity.concrete;

import co.edu.uco.spa.crosscutting.excepcion.concrete.ServiceSpaException;
import co.edu.uco.spa.crosscutting.excepcion.messages.CatalogoMensajes;
import co.edu.uco.spa.crosscutting.excepcion.messages.enumerator.CodigoMensaje;
import co.edu.uco.spa.crosscutting.util.UtilObjeto;
import co.edu.uco.spa.data.entity.DireccionEntity;
import co.edu.uco.spa.service.domain.direccion.DireccionDomain;
import co.edu.uco.spa.service.mapper.entity.EntityMapper;

public class DireccionEntityMapper implements EntityMapper<DireccionEntity, DireccionDomain>{

	@Override
	public DireccionDomain toDomain(DireccionEntity entity) {
		if(UtilObjeto.esNulo(entity)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000070);
			throw ServiceSpaException.crear(mensajeUsuario,mensajeTecnico);
		}
			
			
			
			return DireccionDomain.crear(entity.getId(), entity.getDireccion(), entity.getBarrio());
	}

	@Override
	public DireccionEntity toEntity(DireccionDomain domain) {
		if(UtilObjeto.esNulo(domain)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000071);
			throw ServiceSpaException.crear(mensajeUsuario,mensajeTecnico);		
		}
			
			return DireccionEntity.crear(domain.getId(), domain.getDireccion(), domain.getBarrio());
	}
	
	
	
	

}
