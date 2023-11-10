package co.edu.uco.spa.data.entity;

import java.util.UUID;



public class TipoIdentificacionEntity {
	
	private UUID id;
	private String nombre;
	private String notacion;
	
	
	
	
	
	
	private TipoIdentificacionEntity(final UUID id, final String nombre, final String notacion) {
		setId(id);
		setNombre(nombre);
		setNotacion(notacion);
	}



	
	public static final TipoIdentificacionEntity crear(final UUID id, final String nombre,final String notacion) {
		return new TipoIdentificacionEntity(id, nombre, notacion);
	}



	private final void setId(UUID id) {
		this.id = id;
	}



	private final void setNombre(String nombre) {
		this.nombre = nombre;
	}



	private final void setNotacion(String notacion) {
		this.notacion = notacion;
	}



	public final UUID getId() {
		return id;
	}



	public final String getNombre() {
		return nombre;
	}



	public final String getNotacion() {
		return notacion;
	}
	
	
	
	
	

}
