package co.edu.uco.spa.service.domain.support.identificacioncompletaclientes;

import co.edu.uco.spa.service.domain.tipoidentificacion.TipoIdentificacionDomain;

public class IdentificacionCompletaClientesDomain {
	
	
	private TipoIdentificacionDomain tipoIdentificacion;
	private int numeroIdentificacion;
	
	
	public IdentificacionCompletaClientesDomain(final TipoIdentificacionDomain tipoIdentificacion,final int numeroIdentificacion) {
		setNumeroIdentificacion(numeroIdentificacion);
		setTipoIdentificacion(tipoIdentificacion);
		
	}
	
	
	
	public static final IdentificacionCompletaClientesDomain crear (final TipoIdentificacionDomain tipoIdentificacion,
			final int numeroIdentificacion) {
		return new IdentificacionCompletaClientesDomain(tipoIdentificacion, numeroIdentificacion);
	}
	
	
	
	
	public final TipoIdentificacionDomain getTipoIdentificacion() {
		return tipoIdentificacion;
	}
	public final int getNumeroIdentificacion() {
		return numeroIdentificacion;
	
	}
	
	
	
	public final IdentificacionCompletaClientesDomain setTipoIdentificacion(final TipoIdentificacionDomain tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
		return this;
	}
	public final IdentificacionCompletaClientesDomain setNumeroIdentificacion(final int numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
		return this;
	}
	
	
	
	
	
	
	

}
