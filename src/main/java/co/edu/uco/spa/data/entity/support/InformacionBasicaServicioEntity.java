package co.edu.uco.spa.data.entity.support;

import co.edu.uco.spa.data.entity.PreciosEntity;

public class InformacionBasicaServicioEntity {
	private String nombreServicio;
	private String descripcionServicio;
	private PreciosEntity precio;
	private int duracion;
	
	
	
	private InformacionBasicaServicioEntity( final String nombreServicio, final String descripcionServicio, final PreciosEntity precio,
			final int duracion) {
		setNombreServicio(nombreServicio);
		setDescripcionServicio(descripcionServicio);
		setPrecio(precio);
		setDuracion(duracion);
		
	}
	
	
	public static final InformacionBasicaServicioEntity crear (final String nombreServicio, final String descripcionServicio, final PreciosEntity precio,
			final int duracion) {
		return new InformacionBasicaServicioEntity(nombreServicio, descripcionServicio, precio, duracion);
	}



	private final void setNombreServicio(String nombreServicio) {
		this.nombreServicio = nombreServicio;
	}



	private final void setDescripcionServicio(String descripcionServicio) {
		this.descripcionServicio = descripcionServicio;
	}



	private final void setPrecio(PreciosEntity precio) {
		this.precio = precio;
	}



	private final void setDuracion(int duracion) {
		this.duracion = duracion;
	}



	public final String getNombreServicio() {
		return nombreServicio;
	}



	public final String getDescripcionServicio() {
		return descripcionServicio;
	}



	public final PreciosEntity getPrecio() {
		return precio;
	}



	public final int getDuracion() {
		return duracion;
	}
	
	
	
	
	
	

	
}