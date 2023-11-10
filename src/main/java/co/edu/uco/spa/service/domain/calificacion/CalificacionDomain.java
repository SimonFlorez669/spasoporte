package co.edu.uco.spa.service.domain.calificacion;

import java.util.UUID;


public class CalificacionDomain {
	

	private UUID id;
	private String calificacion;
	
	
	
	
	
	
	
	public CalificacionDomain(final UUID id, final String calificacion) {
		setCalificacionfi(calificacion);
		setId(id);
		
	}
	
	
	
	
	public static final CalificacionDomain crear(final UUID id, final String calificacion) {
		return new CalificacionDomain(id, calificacion);
	}
	
	
	
	public final UUID getId() {
		return id;
	}
	public final String getCalificacion() {
		return calificacion;
	}
	
	
	
	public final CalificacionDomain setId(final UUID id) {
		this.id = id;
		return this;
	}
	public final CalificacionDomain setCalificacionfi(final String calificacion) {
		this.calificacion = calificacion;
		return this;
	}
	
	
	

}
