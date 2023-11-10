package co.edu.uco.spa.data.entity;

import java.util.UUID;

public class TipoServicioEntity {

	private UUID id;
	private String tipoServicio;
	
	
	
	
	private TipoServicioEntity( final UUID id, final String tipoServicio) {
		setId(id);
		setTipoServicio(tipoServicio);
		
	}

	public static final TipoServicioEntity crear (final UUID id, final String tipoServicio) {
		return new TipoServicioEntity(id, tipoServicio);
	}



	private final void setId(UUID id) {
		this.id = id;
	}




	private final void setTipoServicio(String tipoServicio) {
		this.tipoServicio = tipoServicio;
	}




	public final UUID getId() {
		return id;
	}




	public final String getTipoServicio() {
		return tipoServicio;
	}
	
	
	
	
	
}
