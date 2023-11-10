package co.edu.uco.spa.service.dto.support;

import co.edu.uco.spa.service.domain.support.InformacionBasicaServicioDomain;
import co.edu.uco.spa.service.dto.PreciosDTO;

public class InformacionBasicaServicioDTO {
	
	
	private String nombreServicio;
	private String descripcionServicio;
	private PreciosDTO precio;
	private int duracion;
	
	
	
	public InformacionBasicaServicioDTO(final String nombreServicio,final String descripcionServicio,final PreciosDTO precio,
			final int duracion) {
		
		setDescripcionServicio(descripcionServicio);
		setDuracion(duracion);
		setNombreServicio(nombreServicio);
		setPrecio(precio);
		
	}
	
	
	
	
	
	
	public static final InformacionBasicaServicioDTO crear (final String nombreServicio, final String descripcionServicio, final PreciosDTO precio,
			final int duracion) {
		return new InformacionBasicaServicioDTO(nombreServicio, descripcionServicio, null, duracion);
	}
	
	
	



	public final String getNombreServicio() {
		return nombreServicio;
	}



	public final String getDescripcionServicio() {
		return descripcionServicio;
	}



	public final PreciosDTO getPrecio() {
		return precio;
	}



	public final int getDuracion() {
		return duracion;
	}



	public final void setNombreServicio(final String nombreServicio) {
		this.nombreServicio = nombreServicio;
	}



	public final void setDescripcionServicio(final String descripcionServicio) {
		this.descripcionServicio = descripcionServicio;
	}



	public final void setPrecio(final PreciosDTO precio) {
		this.precio = precio;
	}



	public final void setDuracion(final int duracion) {
		this.duracion = duracion;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
