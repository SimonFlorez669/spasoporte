package co.edu.uco.spa.data.entity;

import java.util.UUID;

public class RestriccionServicioEntity {
	
	private UUID id;
	private String restriccionServicio;
	
	
	
	private RestriccionServicioEntity(final UUID id, final String restriccionServicio) {
		setId(id);
		setRestriccionServicio(restriccionServicio);
		
	}
	
	public static final RestriccionServicioEntity crear(final UUID id, final String restriccionServicio) {
		return new RestriccionServicioEntity(id, restriccionServicio);
	}



	private final void setId(UUID id) {
		this.id = id;
	}



	private final void setRestriccionServicio(String restriccionServicio) {
		this.restriccionServicio = restriccionServicio;
	}



	public final UUID getId() {
		return id;
	}



	public final String getRestriccionServicio() {
		return restriccionServicio;
	}
	
	
	
	
	
	

}
