package co.edu.uco.spa.data.entity;

import java.util.UUID;

public class CalificacionEntity {
	
	private UUID id;
	private String calificacion;
	
	
	
	private CalificacionEntity(final UUID id, final String calificacion) {
		setId(id);
		setCalificacion(calificacion);
	}
	
	public static final CalificacionEntity crear(final UUID id, final String calificacion) {
		return new CalificacionEntity(id, calificacion);
	}



	private final void setId(UUID id) {
		this.id = id;
	}



	private final void setCalificacion(String calificacion) {
		this.calificacion = calificacion;
	}



	public final UUID getId() {
		return id;
	}



	public final String getCalificacion() {
		return calificacion;
	}
	
	
	
	
	
	

}
