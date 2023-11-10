package co.edu.uco.spa.service.mapper.entity.concrete;

import co.edu.uco.spa.crosscutting.excepcion.concrete.ServiceSpaException;
import co.edu.uco.spa.crosscutting.excepcion.messages.CatalogoMensajes;
import co.edu.uco.spa.crosscutting.excepcion.messages.enumerator.CodigoMensaje;
import co.edu.uco.spa.crosscutting.util.UtilObjeto;
import co.edu.uco.spa.data.entity.BancoImagenesEntity;
import co.edu.uco.spa.service.domain.bancoimagenes.BancoImagenesDomain;
import co.edu.uco.spa.service.mapper.entity.EntityMapper;

public class BancoImagenesEntityMapper  implements EntityMapper<BancoImagenesEntity, BancoImagenesDomain>{

	@Override
	public BancoImagenesDomain toDomain(BancoImagenesEntity entity) {
		if(UtilObjeto.esNulo(entity)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000070);
			throw ServiceSpaException.crear(mensajeUsuario,mensajeTecnico);
			
		}
			
			return BancoImagenesDomain.crear(entity.getId(), entity.getTipoImagen(), entity.getFormatoImagen(), entity.getDescripcion());
	}

	@Override
	public BancoImagenesEntity toEntity(BancoImagenesDomain domain) {
		if(UtilObjeto.esNulo(domain)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000071);
			throw ServiceSpaException.crear(mensajeUsuario,mensajeTecnico);
			
		}
			
			return BancoImagenesEntity.crear(domain.getId(), null,domain.getFormatoImagen() , domain.getDescripcion());
	}
	
	
	
	

}
