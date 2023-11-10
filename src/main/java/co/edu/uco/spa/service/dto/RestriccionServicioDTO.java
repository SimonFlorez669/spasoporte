package co.edu.uco.spa.service.dto;

import java.util.UUID;


public class RestriccionServicioDTO {
	
	
	private UUID id;
	private String restriccionServicio;
	
	
	
	public RestriccionServicioDTO(final UUID id,final String restriccionServicio) {
		
		setId(id);
		setRestriccionServicio(restriccionServicio);
	}
	
	
	
	public static final RestriccionServicioDTO crear(final UUID id, final String restriccionServicio) {
		return new RestriccionServicioDTO(id, restriccionServicio);
	}


	
	

	public final UUID getId() {
		return id;
	}



	public final String getRestriccionServicio() {
		return restriccionServicio;
	}





	public final void setId(final UUID id) {
		this.id = id;
	}





	public final void setRestriccionServicio(final String restriccionServicio) {
		this.restriccionServicio = restriccionServicio;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
