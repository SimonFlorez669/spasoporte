package co.edu.uco.spa.data.entity;

import java.util.UUID;

public class DireccionEntity {

	private UUID id;
	private String direccion;
	private String barrio;
	
	
	private DireccionEntity(final UUID id, final String direccion, final String barrio) {
		setId(id);
		setBarrio(barrio);
		setDireccion(direccion);
		
	}
	
	public static final  DireccionEntity crear(final UUID id, final String direccion, final String barrio) {
		return new DireccionEntity(id, direccion, barrio);
	}


	private final void setId(UUID id) {
		this.id = id;
	}


	private final void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	private final void setBarrio(String barrio) {
		this.barrio = barrio;
	}


	public final UUID getId() {
		return id;
	}


	public final String getDireccion() {
		return direccion;
	}


	public final String getBarrio() {
		return barrio;
	}
	
	
	
	
	
	
	
	
}
