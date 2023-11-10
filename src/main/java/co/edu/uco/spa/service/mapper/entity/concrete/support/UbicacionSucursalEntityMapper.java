package co.edu.uco.spa.service.mapper.entity.concrete.support;

import co.edu.uco.spa.crosscutting.excepcion.concrete.ServiceSpaException;
import co.edu.uco.spa.crosscutting.excepcion.messages.CatalogoMensajes;
import co.edu.uco.spa.crosscutting.excepcion.messages.enumerator.CodigoMensaje;
import co.edu.uco.spa.crosscutting.util.UtilObjeto;
import co.edu.uco.spa.data.entity.support.UbicacionSucursalEntity;
import co.edu.uco.spa.service.domain.support.UbicacionSucursalDomain;
import co.edu.uco.spa.service.mapper.entity.EntityMapper;

public class UbicacionSucursalEntityMapper implements EntityMapper<UbicacionSucursalEntity, UbicacionSucursalDomain> {

	@Override
	public UbicacionSucursalDomain toDomain(UbicacionSucursalEntity entity) {
		if(UtilObjeto.esNulo(entity)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000070);
			throw ServiceSpaException.crear(mensajeUsuario,mensajeTecnico);
		}
			
			return UbicacionSucursalDomain.crear(entity.getDireccion(), entity.getPais(), entity.getDepartamento(), entity.getUbicacion());
	}

	@Override
	public UbicacionSucursalEntity toEntity(UbicacionSucursalDomain domain) {
		if(UtilObjeto.esNulo(domain)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000071);
			throw ServiceSpaException.crear(mensajeUsuario,mensajeTecnico);		
		}
			
			return UbicacionSucursalEntity.crear(domain.getDireccion(), domain.getPais(),domain.getDepartamento(), domain.getUbicacion());
			
			
	}
	
	

}
