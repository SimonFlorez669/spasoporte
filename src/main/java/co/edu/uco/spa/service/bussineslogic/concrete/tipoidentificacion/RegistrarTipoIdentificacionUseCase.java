package co.edu.uco.spa.service.bussineslogic.concrete.tipoidentificacion;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.spa.crosscutting.excepcion.concrete.ServiceSpaException;
import co.edu.uco.spa.crosscutting.excepcion.messages.CatalogoMensajes;
import co.edu.uco.spa.crosscutting.excepcion.messages.enumerator.CodigoMensaje;
import co.edu.uco.spa.crosscutting.util.UtilObjeto;
import co.edu.uco.spa.data.dao.TipoIdentificacionDAO;
import co.edu.uco.spa.data.dao.daofactory.DAOFactory;
import co.edu.uco.spa.data.entity.TipoIdentificacionEntity;
import co.edu.uco.spa.service.domain.tipoidentificacion.TipoIdentificacionDomain;
import co.edu.uco.spa.service.mapper.entity.concrete.TipoIdentificacionEntityMapper;


public class RegistrarTipoIdentificacionUseCase {
	

	private  DAOFactory factoria;

	public RegistrarTipoIdentificacionUseCase(final DAOFactory factoria) {
		setFactoria(factoria);		
	}
	
	public final void execute(TipoIdentificacionDomain domain) {
		

		domain = obtenerTipoIdentificacionDomain( domain);

		validarNoExistenciaTipoIdentificacionConMismoCodigo(domain.getCodigo());

		validarNoExistenciaTipoIdentificacionConMismoNombre(domain.getNombre());

		registrarNuevoTipoIdentificacion(domain);
	}
	
	private void validarIntegridadTipoIdentificacion(final TipoIdentificacionDomain domain) {
		if (UtilObjeto.esNulo(domain)) {
		    var mensajeUsuario= "El objeto TipoIdentificacionDomain no puede ser nulo";
			throw  ServiceSpaException.crear(mensajeUsuario);
		}

		if (UtilObjeto.esNulooVacio(domain.getNombre())) {
			var  mensajeUsuario= CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000074);
		    throw  ServiceSpaException.crear(mensajeUsuario);
		}

		if (UtilObjeto.esNulooVacio(domain.getCodigo())) {
			var mensajeUsuario= CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000074);
			throw  ServiceSpaException.crear(mensajeUsuario);
		}

		if (domain.getNombre().length() > 255) {
			var mensajeUsuario= CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000075);
			throw  ServiceSpaException.crear(mensajeUsuario);
		}

		if (domain.getCodigo().length() > 10) {
			var mensajeUsuario= CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000076);
			throw  ServiceSpaException.crear(mensajeUsuario);
		    }

	}
	
	private void registrarNuevoTipoIdentificacion(final TipoIdentificacionDomain domain) {
		var entity = TipoIdentificacionEntityMapper.convertToEntity(domain);
		getTipoIdentificacionDAO().crear(entity);
		
	}
	
	private final void validarNoExistenciaTipoIdentificacionConMismoNombre(final String nombre) {

		var domain =TipoIdentificacionDomain.crear(null, null, nombre);
		var entity = TipoIdentificacionEntityMapper.convertToEntity(domain);
		var resultados = getTipoIdentificacionDAO().consultar(entity);
		
		if(resultados.isEmpty()) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000077)+ nombre;
			throw ServiceSpaException.crear(mensajeUsuario);
		}
	}
	private final void validarNoExistenciaTipoIdentificacionConMismoNombrePorMi(final String nombre) {
		TipoIdentificacionEntity entity = convertirTipoIdentificacionDomainAEntity(nombre);
	    List<TipoIdentificacionEntity> resultados = getTipoIdentificacionDAO().consultar(entity);

		if(resultados.isEmpty()) {
			lanzarExcepcionTipoIdentificacionExistentePorNombre(nombre);
		}
	}
	private final void validarNoExistenciaTipoIdentificacionConMismoCodigo(final String codigo) {
		var domain = TipoIdentificacionDomain.crear(null, codigo, null);
		var entity = TipoIdentificacionEntityMapper.convertToEntity(domain);
		var resultados = getTipoIdentificacionDAO().consultar(entity);
		
		if(resultados.isEmpty()) {
			var mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000078)+ codigo;
			throw ServiceSpaException.crear(mensajeUsuario);
		}
	}
	private final void validarNoExistenciaTipoIdentificacionConMismoCodigoPorMi(final String codigo) {
		TipoIdentificacionEntity entity = convertirTipoIdentificacionDomainAEntity(codigo);
	    List<TipoIdentificacionEntity> resultados = getTipoIdentificacionDAO().consultar(entity);

		if(resultados.isEmpty()) {
			lanzarExcepcionTipoIdentificacionExistente(codigo);
		}
	}
	
	private final TipoIdentificacionDomain obtenerTipoIdentificacionDomain(TipoIdentificacionDomain domain) {
		
		Optional<TipoIdentificacionEntity> optional ;
		UUID uuid;
		do {
			uuid= UUID.randomUUID();			
			optional = getTipoIdentificacionDAO().consultarPorId(uuid);
			
		}while(!optional.isEmpty());
			
		return TipoIdentificacionDomain.crear(domain.getId(), domain.getNombre(), domain.getNotacion());
				}
	private final DAOFactory getFactoria() {
		return factoria;
	}
	
	private final void setFactoria(final DAOFactory factoria) {
		if(UtilObjeto.esNulo(factoria)) {
			var mensajeUsuario= CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000068);
			var mensajeTecnico= CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000069);
			 throw ServiceSpaException.crear(mensajeUsuario, mensajeTecnico);
		}
		this.factoria = factoria;
	}
	
	private final TipoIdentificacionDAO getTipoIdentificacionDAO() {
		return getFactoria().obtenerTipoIdentificacionDAO();
	}
	//Creada para mejorar 
	private TipoIdentificacionEntity convertirTipoIdentificacionDomainAEntity(String codigo) {
	    TipoIdentificacionDomain domain = TipoIdentificacionDomain.crear(null, codigo, null);
	    return TipoIdentificacionEntityMapper.convertToEntity(domain);
	}

	private void lanzarExcepcionTipoIdentificacionExistente(String codigo) {
	    String mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000078) + codigo;
	    throw ServiceSpaException.crear(mensajeUsuario);
	}
	private void lanzarExcepcionTipoIdentificacionExistentePorNombre(String nombre) {
	    String mensajeUsuario = CatalogoMensajes.obtenerContenido(CodigoMensaje.M0000077) + nombre;
	    throw ServiceSpaException.crear(mensajeUsuario);
	}

	
	
	

}
