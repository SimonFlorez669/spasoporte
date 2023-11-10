package co.edu.uco.spa.service.domain.bancoimagenes;

import java.awt.Image;
import java.util.UUID;

import co.edu.uco.spa.data.entity.TipoImagenEntity;
import co.edu.uco.spa.service.domain.tipoimagen.TipoImagenDomain;


public class BancoImagenesDomain {
	
	private UUID id;
	private TipoImagenDomain tipoImagen;
	private Image formatoImagen;
	private String descripcion;
	
	
	
	
	
	
	
	
	public BancoImagenesDomain(final UUID id,final TipoImagenDomain tipoImagen,final Image formatoImagen,final String descripcion) {
		
		
		setDescripcion(descripcion);
		setFormatoImagen(formatoImagen);
		setId(id);
		setTipoImagen(null);
	}
	
	
	
	public static final BancoImagenesDomain crear(final UUID id, final TipoImagenEntity tipoImagen, final Image formatoImagen, final String descripcion) {
		return new BancoImagenesDomain(id, null, formatoImagen, descripcion);
	}
	
	
	
	
	

	public final UUID getId() {
		return id;
	}
	
	public final TipoImagenDomain getTipoImagen() {
		return tipoImagen;
	}
	
	
	public final Image getFormatoImagen() {
		return formatoImagen;
	}
	
	public final String getDescripcion() {
		return descripcion;
	}

	public final void setId(UUID id) {
		this.id = id;
	}
	
	

	public final BancoImagenesDomain setTipoImagen(final TipoImagenDomain tipoImagen) {
		this.tipoImagen = tipoImagen;
		return this;
	}

	public final BancoImagenesDomain setFormatoImagen(final Image formatoImagen) {
		this.formatoImagen = formatoImagen;
		return this;
	}

	public final BancoImagenesDomain setDescripcion(final String descripcion) {
		this.descripcion = descripcion;
		return this;
	}
	
	
	
	
	

}
