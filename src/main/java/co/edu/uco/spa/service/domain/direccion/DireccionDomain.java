package co.edu.uco.spa.service.domain.direccion;

import java.util.UUID;


public class DireccionDomain {
	
	private UUID id;
	private String direccion;
	private String barrio;
	
	
	
	
	
	public DireccionDomain(final UUID id,final String direccion,final String barrio) {
		setBarrio(barrio);
		setDireccion(direccion);
		setId(id);
	}
	
	
	
	public static final  DireccionDomain crear(final UUID id, final String direccion, final String barrio) {
		return new DireccionDomain(id, direccion, barrio);
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
	
	
	
	public final DireccionDomain setId(final UUID id) {
		this.id = id;
		return this;
	}
	public final DireccionDomain setDireccion(final String direccion) {
		this.direccion = direccion;
		return this;
		
	}
	public final DireccionDomain setBarrio(final String barrio) {
		this.barrio = barrio;
		return this;
	}
	
	
	
	

}
