package co.edu.uco.spa.data.entity;

import java.awt.Image;
import java.util.UUID;

public class BancoImagenesEntity {
	

	private UUID id;
	private TipoImagenEntity tipoImagen;
	private Image formatoImagen;
	private String descripcion;
	
	
	private BancoImagenesEntity(final UUID id, final TipoImagenEntity tipoImagen, final Image formatoImagen, final String descripcion) {
		setId(id);
		setTipoImagen(tipoImagen);
		setFormatoImagen(formatoImagen);
		setDescripcion(descripcion);
	}
	
	public static final BancoImagenesEntity crear(final UUID id, final TipoImagenEntity tipoImagen, final Image formatoImagen, final String descripcion) {
		return new BancoImagenesEntity(id, tipoImagen, formatoImagen, descripcion);
	}


	private final void setId(UUID id) {
		this.id = id;
	}


	private final void setTipoImagen(TipoImagenEntity tipoImagen) {
		this.tipoImagen = tipoImagen;
	}


	private final void setFormatoImagen(Image formatoImagen) {
		this.formatoImagen = formatoImagen;
	}


	private final void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public final UUID getId() {
		return id;
	}


	public final TipoImagenEntity getTipoImagen() {
		return tipoImagen;
	}


	public final Image getFormatoImagen() {
		return formatoImagen;
	}


	public final String getDescripcion() {
		return descripcion;
	}
	
	
	
	
	
	
	
	
	
	
}
