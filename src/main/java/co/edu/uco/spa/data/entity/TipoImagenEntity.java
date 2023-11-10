package co.edu.uco.spa.data.entity;

import java.util.UUID;

public class TipoImagenEntity {
	
	private UUID id;
	private TipoImagenEntity tipoImagen;
	
	
	
	
	private TipoImagenEntity(final UUID id,final TipoImagenEntity tipoImagen) {
		setId(id);
		setTipoImagen(tipoImagen);
		
	}
	
	public static final TipoImagenEntity crear(final UUID id,final TipoImagenEntity tipoImagen) {
		return new TipoImagenEntity(id, tipoImagen);
	}

	


	private final void setId(UUID id) {
		this.id = id;
	}




	private final void setTipoImagen(TipoImagenEntity tipoImagen) {
		this.tipoImagen = tipoImagen;
	}




	public final UUID getId() {
		return id;
	}




	public final TipoImagenEntity getTipoImagen() {
		return tipoImagen;
	}
	
	
	
	
	
	
	

}
