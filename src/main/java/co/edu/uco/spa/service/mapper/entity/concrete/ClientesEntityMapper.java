package co.edu.uco.spa.service.mapper.entity.concrete;


import co.edu.uco.spa.crosscutting.excepcion.concrete.ServiceSpaException;
import co.edu.uco.spa.crosscutting.excepcion.messages.CatalogoMensajes;
import co.edu.uco.spa.crosscutting.excepcion.messages.enumerator.CodigoMensaje;
import co.edu.uco.spa.crosscutting.util.UtilObjeto;
import co.edu.uco.spa.data.entity.ClienteEntity;
import co.edu.uco.spa.service.domain.clientes.ClientesDomain;
import co.edu.uco.spa.service.mapper.entity.EntityMapper;

public class ClientesEntityMapper implements EntityMapper<ClienteEntity, ClientesDomain> {

	
	
private static final EntityMapper<ClienteEntity, ClientesDomain> instancia = new ClientesEntityMapper();
	
	private ClientesEntityMapper() {
		super();
	}
	@Override
	public ClientesDomain toDomain(ClienteEntity entity) {
		if(UtilObjeto.esNulo(entity)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000070);
			throw ServiceSpaException.crear(mensajeUsuario,mensajeTecnico);
		}	
		
		return ClientesDomain.crear(null, null, null, null, null, null, null);
	}

	
	@Override
	public ClienteEntity toEntity(ClientesDomain domain) {
		if(UtilObjeto.esNulo(domain)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000071);
			throw ServiceSpaException.crear(mensajeUsuario,mensajeTecnico);
		}
		return ClienteEntity.crear(null, null, null, null, null, null, null);
	}
	
	public static final ClientesDomain
	convertToDomain(final ClienteEntity entity) {
		return instancia.toDomain(entity);
	}
	public static final ClienteEntity
	convertToEntity(final ClientesDomain domain) {
		return instancia.toEntity(domain);
	}
}
