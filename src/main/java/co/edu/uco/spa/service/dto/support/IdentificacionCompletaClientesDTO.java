package co.edu.uco.spa.service.dto.support;


import co.edu.uco.spa.service.dto.TipoIdentificacionDTO;

public class IdentificacionCompletaClientesDTO {
	
	
	

	private TipoIdentificacionDTO tipoIdentificacion;
	private int numeroIdentificacion;
	
	
	public IdentificacionCompletaClientesDTO(final TipoIdentificacionDTO tipoIdentificacion,final int numeroIdentificacion) {
		setNumeroIdentificacion(numeroIdentificacion);
		setTipoIdentificacion(getTipoIdentificacion());
	}
	
	
	
	
	
	
	public static final IdentificacionCompletaClientesDTO crear (final TipoIdentificacionDTO tipoIdentificacion,
			final int numeroIdentificacion) {
		return new IdentificacionCompletaClientesDTO(tipoIdentificacion, numeroIdentificacion);
	}
	


	public final TipoIdentificacionDTO getTipoIdentificacion() {
		return tipoIdentificacion;
	}


	public final int getNumeroIdentificacion() {
		return numeroIdentificacion;
	}


	public final void setTipoIdentificacion(final TipoIdentificacionDTO tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}


	public final void setNumeroIdentificacion(final int numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}
	
	
	
	
	
	
	}
	


