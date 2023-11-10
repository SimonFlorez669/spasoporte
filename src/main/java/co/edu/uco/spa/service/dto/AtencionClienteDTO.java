package co.edu.uco.spa.service.dto;

import java.sql.Time;
import java.util.UUID;

public class AtencionClienteDTO {
	
	private UUID id;
	private String diasDeAtencion;
	private Time horario;
	private String plataformaComunicacion;
	
	
	
	
	
	public AtencionClienteDTO(final UUID id,final String diasDeAtencion, final Time horario,final String plataformaComunicacion) {
		
		
		
		
		
	}


	
	


	public final UUID getId() {
		return id;
	}




	public final String getDiasDeAtencion() {
		return diasDeAtencion;
	}




	public final Time getHorario() {
		return horario;
	}




	public final String getPlataformaComunicacion() {
		return plataformaComunicacion;
	}






	public final void setId(UUID id) {
		this.id = id;
	}






	public final void setDiasDeAtencion(final String diasDeAtencion) {
		this.diasDeAtencion = diasDeAtencion;
	}






	public final void setHorario(final Time horario) {
		this.horario = horario;
	}






	public final void setPlataformaComunicacion(final String plataformaComunicacion) {
		this.plataformaComunicacion = plataformaComunicacion;
	}
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
}
