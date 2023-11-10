package co.edu.uco.spa.service.domain.restriccionservicio;

import java.util.UUID;


public class RestriccionServicioDomain {
	
	private UUID id;
	private String restriccionServicio;
	
	
	
	
	public RestriccionServicioDomain(final UUID id, final String restriccionServicio) {
		setId(id);
		setRestriccionServicio(restriccionServicio);
	}
	
	public static final RestriccionServicioDomain crear(final UUID id, final String restriccionServicio) {
		return new RestriccionServicioDomain(id, restriccionServicio);
	}
	
	
	
	
	public final UUID getId() {
		return id;
	}
	public final String getRestriccionServicio() {
		return restriccionServicio;
	}
	
	
	
	public final RestriccionServicioDomain setId(final UUID id) {
		this.id = id;
		return this;
	}
	public final RestriccionServicioDomain setRestriccionServicio(final String restriccionServicio) {
		this.restriccionServicio = restriccionServicio;
		return this;
	}
	
	
	
	
	
	
	
	

}
