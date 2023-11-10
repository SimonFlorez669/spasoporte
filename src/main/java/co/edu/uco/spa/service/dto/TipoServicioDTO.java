package co.edu.uco.spa.service.dto;

import java.util.UUID;


public class TipoServicioDTO {
	

	private UUID id;
	private String tipoServicio;
	
	
	public TipoServicioDTO(final UUID id,final String tipoServicio) {
		setId(id);
		setTipoServicio(tipoServicio);	
	}
	
	
	
	public static final TipoServicioDTO crear (final UUID id, final String tipoServicio) {
		return new TipoServicioDTO(id, tipoServicio);
	}
	
	


	public final UUID getId() {
		return id;
	}


	public final String getTipoServicio() {
		return tipoServicio;
	}


	public final void setId(final UUID id) {
		this.id = id;
	}


	public final void setTipoServicio(final String tipoServicio) {
		this.tipoServicio = tipoServicio;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
