package co.edu.uco.spa.service.mapper.entity.concrete;

import co.edu.uco.spa.crosscutting.excepcion.concrete.ServiceSpaException;
import co.edu.uco.spa.crosscutting.excepcion.messages.CatalogoMensajes;
import co.edu.uco.spa.crosscutting.excepcion.messages.enumerator.CodigoMensaje;
import co.edu.uco.spa.crosscutting.util.UtilObjeto;
import co.edu.uco.spa.data.entity.SucursalEntity;
import co.edu.uco.spa.service.domain.sucursal.SucursalDomain;
import co.edu.uco.spa.service.mapper.entity.EntityMapper;

public class SucursalEntityMapper  implements EntityMapper<SucursalEntity, SucursalDomain>{

	@Override
	public SucursalDomain toDomain(SucursalEntity entity) {
		
		if(UtilObjeto.esNulo(entity)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000099);
			throw ServiceSpaException.crear(mensajeUsuario,mensajeTecnico);	
			
		}
		
		return SucursalDomain.crear(entity.getId(), entity.getNombre(), entity.getTelefono(), entity.getNumeroEmpleados(),null, null, null);
	}

	@Override
	public SucursalEntity toEntity(SucursalDomain domain) {
		
		
		if(UtilObjeto.esNulo(domain)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000105);
			throw ServiceSpaException.crear(mensajeUsuario,mensajeTecnico);	
			
		}
		
		return SucursalEntity.crear(domain.getId(), domain.getNombre(), domain.getTelefono(), domain.getNumeroEmpleados(),null, null, null);
	}
	
	
	

}
