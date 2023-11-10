package co.edu.uco.spa.service.domain.tipoimagen;

import java.util.UUID;



public class TipoImagenDomain {
	private UUID id;
	private TipoImagenDomain tipoImagen;
	
	
	

	
	public TipoImagenDomain(final UUID id,final TipoImagenDomain tipoImagen) {
		setId(id);
		setTipoImagen(tipoImagen);
	}
	
	
	public static final TipoImagenDomain crear(final UUID id,final TipoImagenDomain tipoImagen) {
		return new TipoImagenDomain(id, tipoImagen);
	}
	
	
	
	
	public final UUID getId() {
		return id;
	}
	public final TipoImagenDomain getTipoImagen() {
		return tipoImagen;
	}
	
	
	public final TipoImagenDomain setId(final UUID id) {
		this.id = id;
		return this;
	}
	
	
	public final TipoImagenDomain setTipoImagen(final TipoImagenDomain tipoImagen) {
		this.tipoImagen = tipoImagen;
		return this;
	}
	
	
	
	
	
	

}
