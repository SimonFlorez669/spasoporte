package co.edu.uco.spa.service.mapper.entity.concrete;

import co.edu.uco.spa.crosscutting.excepcion.concrete.ServiceSpaException;
import co.edu.uco.spa.crosscutting.excepcion.messages.CatalogoMensajes;
import co.edu.uco.spa.crosscutting.excepcion.messages.enumerator.CodigoMensaje;
import co.edu.uco.spa.crosscutting.util.UtilObjeto;
import co.edu.uco.spa.data.entity.EquipoTrabajoEntity;
import co.edu.uco.spa.service.domain.equipotrabajo.EquipoTrabajoDomain;
import co.edu.uco.spa.service.mapper.entity.EntityMapper;

public class EquipoTrabajoEntityMapper implements EntityMapper<EquipoTrabajoEntity, EquipoTrabajoDomain> {

	@Override
	public EquipoTrabajoDomain toDomain(EquipoTrabajoEntity entity) {
		
		if(UtilObjeto.esNulo(entity)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000083);
			throw ServiceSpaException.crear(mensajeUsuario,mensajeTecnico);	
			
		}
		return EquipoTrabajoDomain.crear(entity.getId(), entity.getNombreEmpleado(), entity.getCargo(), entity.getTitulos(), entity.getDescripcion(), entity.getFoto());
	}

	@Override
	public EquipoTrabajoEntity toEntity(EquipoTrabajoDomain domain) {
		if(UtilObjeto.esNulo(domain)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000084);
			throw ServiceSpaException.crear(mensajeUsuario,mensajeTecnico);			
		}
			
			
			return EquipoTrabajoEntity.crear(domain.getId(), domain.getNombreEmpleado(), domain.getCargo(), domain.getTitulos(), domain.getDescripcion(), domain.getFoto());
	}
	
	
	
	
	
	
	

}
