package co.edu.uco.spa.service.domain.support.informacionbasicaservicio;

import co.edu.uco.spa.service.domain.precios.PreciosDomain;

public class InformacionBasicaServicioDomain {
	
	private String nombreServicio;
	private String descripcionServicio;
	private PreciosDomain precio;
	private int duracion;
	
	
	
	
	
	
	
	
	public InformacionBasicaServicioDomain(final String nombreServicio,final  String descripcionServicio,final PreciosDomain precio,
		final	int duracion) {
		setDescripcionServicio(descripcionServicio);
		setDuracion(duracion);
		setNombreServicio(nombreServicio);
		setPrecio(null);
	}
	
	public static final InformacionBasicaServicioDomain crear (final String nombreServicio, final String descripcionServicio, final PreciosDomain precio,
			final int duracion) {
		return new InformacionBasicaServicioDomain (nombreServicio, descripcionServicio, precio, duracion);
	}
	
	
	
	
	public final String getNombreServicio() {
		return nombreServicio;
	}
	public final String getDescripcionServicio() {
		return descripcionServicio;
	}
	public final PreciosDomain getPrecio() {
		return precio;
	}
	
	
	public final int getDuracion() {
		return duracion;
	}
	
	
	
	public final InformacionBasicaServicioDomain setNombreServicio(String nombreServicio) {
		this.nombreServicio = nombreServicio;
		return this;
	}
	
	
	public final InformacionBasicaServicioDomain setDescripcionServicio(String descripcionServicio) {
		this.descripcionServicio = descripcionServicio;
		return this;
	}
	
	
	public final InformacionBasicaServicioDomain setPrecio(PreciosDomain precio) {
		this.precio = precio;
		return this;
	}
	
	
	public final InformacionBasicaServicioDomain setDuracion(int duracion) {
		this.duracion = duracion;
		return this;
	}
	
	
	
	
	
	
	

}
