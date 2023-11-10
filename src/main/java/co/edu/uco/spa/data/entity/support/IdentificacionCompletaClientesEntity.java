package co.edu.uco.spa.data.entity.support;

import co.edu.uco.spa.data.entity.TipoIdentificacionEntity;

	public class IdentificacionCompletaClientesEntity {
	private TipoIdentificacionEntity tipoIdentificacion;
	private int numeroIdentificacion;
	
	
	
	
	private IdentificacionCompletaClientesEntity(final TipoIdentificacionEntity tipoIdentificacion,
			final int numeroIdentificacion) {
		 
		setTipoIdentificacion(tipoIdentificacion);
		setNumeroIdentificacion(numeroIdentificacion);
	}

	
	public static final IdentificacionCompletaClientesEntity crear (final TipoIdentificacionEntity tipoIdentificacion,
			final int numeroIdentificacion) {
		return new IdentificacionCompletaClientesEntity(tipoIdentificacion, numeroIdentificacion);
	}



	private final void setTipoIdentificacion(TipoIdentificacionEntity tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}




	private final void setNumeroIdentificacion(int numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}




	public final TipoIdentificacionEntity getTipoIdentificacion() {
		return tipoIdentificacion;
	}




	public final int getNumeroIdentificacion() {
		return numeroIdentificacion;
	}
	
	
	
	
	
	

	
}