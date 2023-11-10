package co.edu.uco.spa.service.mapper.entity.concrete;

import co.edu.uco.spa.crosscutting.excepcion.concrete.ServiceSpaException;
import co.edu.uco.spa.crosscutting.excepcion.messages.CatalogoMensajes;
import co.edu.uco.spa.crosscutting.excepcion.messages.enumerator.CodigoMensaje;
import co.edu.uco.spa.crosscutting.util.UtilObjeto;
import co.edu.uco.spa.data.entity.AcercaDeNosotrosEntity;
import co.edu.uco.spa.service.domain.acercanosotros.AcercaNosotrosDomain;
import co.edu.uco.spa.service.mapper.entity.EntityMapper;

public class AcercaNosotrosEntityMapper implements EntityMapper<AcercaDeNosotrosEntity, AcercaNosotrosDomain> {

	@Override
	public AcercaNosotrosDomain toDomain(AcercaDeNosotrosEntity entity) {
		if(UtilObjeto.esNulo(entity)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000080);
			throw ServiceSpaException.crear(mensajeUsuario,mensajeTecnico);
		}
			
			return AcercaNosotrosDomain.crear(null, null, null, null, null, null, null);

			
	}
	
	
	
	@Override
	public AcercaDeNosotrosEntity toEntity(AcercaNosotrosDomain domain) {
		if(UtilObjeto.esNulo(domain)) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000004);
			var mensajeTecnico = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000081);
			throw ServiceSpaException.crear(mensajeUsuario,mensajeTecnico);		
		}
			
			
			
			return AcercaDeNosotrosEntity.crear(null, null, null, null, null, null, null);
	}
	
	

}
