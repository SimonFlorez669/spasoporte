package co.edu.uco.spa.service.mapper.entity.concrete.support;

import co.edu.uco.spa.crosscutting.excepcion.concrete.ServiceSpaException;
import co.edu.uco.spa.crosscutting.excepcion.messages.CatalogoMensajes;
import co.edu.uco.spa.crosscutting.excepcion.messages.enumerator.CodigoMensaje;
import co.edu.uco.spa.crosscutting.util.UtilObjeto;
import co.edu.uco.spa.data.entity.support.CorreoElectronicoCompletoClientesEntity;
import co.edu.uco.spa.service.domain.support.CorreoElectronicoCompletoClientesDomain;
import co.edu.uco.spa.service.mapper.entity.EntityMapper;

public class CorreoElectronicoCompletaClientesEntityMapper  implements EntityMapper<CorreoElectronicoCompletoClientesEntity, CorreoElectronicoCompletoClientesDomain>{

	@Override
	public CorreoElectronicoCompletoClientesDomain toDomain(CorreoElectronicoCompletoClientesEntity entity) {
		if(UtilObjeto.esNulo(entity)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000107);
			throw ServiceSpaException.crear(mensajeUsuario,mensajeTecnico);
		}
		
		return CorreoElectronicoCompletoClientesDomain.crear(entity.getCorreoElectronico(), false);
	}

	@Override
	public CorreoElectronicoCompletoClientesEntity toEntity(CorreoElectronicoCompletoClientesDomain domain) {
		if(UtilObjeto.esNulo(domain)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000108);
			throw ServiceSpaException.crear(mensajeUsuario,mensajeTecnico);
		}
		
		return CorreoElectronicoCompletoClientesEntity.crear(domain.getCorreoElectronico(), false);
	}
	
	

}
