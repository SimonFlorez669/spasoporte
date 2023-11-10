package co.edu.uco.spa.service.mapper.entity.concrete.support;

import co.edu.uco.spa.crosscutting.excepcion.concrete.ServiceSpaException;
import co.edu.uco.spa.crosscutting.excepcion.messages.CatalogoMensajes;
import co.edu.uco.spa.crosscutting.excepcion.messages.enumerator.CodigoMensaje;
import co.edu.uco.spa.crosscutting.util.UtilObjeto;
import co.edu.uco.spa.data.entity.support.NumeroTelefonoCompletoClientesEntity;
import co.edu.uco.spa.service.domain.support.NumeroTelefonoCompletoClientesDomain;
import co.edu.uco.spa.service.mapper.entity.EntityMapper;

public class NumeroTelefonoCompletoClientesEntityMapper implements EntityMapper<NumeroTelefonoCompletoClientesEntity, NumeroTelefonoCompletoClientesDomain>{

	@Override
	public NumeroTelefonoCompletoClientesDomain toDomain(NumeroTelefonoCompletoClientesEntity entity) {
		if(UtilObjeto.esNulo(entity)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000070);
			throw ServiceSpaException.crear(mensajeUsuario,mensajeTecnico);
		}
			
			
			return NumeroTelefonoCompletoClientesDomain.crear(entity.getNumeroTelefono(), false);
	}

	@Override
	public NumeroTelefonoCompletoClientesEntity toEntity(NumeroTelefonoCompletoClientesDomain domain) {
		if(UtilObjeto.esNulo(domain)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000070);
			throw ServiceSpaException.crear(mensajeUsuario,mensajeTecnico);
		}
			
			return NumeroTelefonoCompletoClientesEntity.crear(domain.getNumeroTelefono(), false);
			}
	
	

}
