package co.edu.uco.spa.service.domain.atencioncliente;

import java.sql.Time;
import java.util.UUID;

public class AtencionClienteDomain {
	

	private UUID id;
	private String diasDeAtencion;
	private Time horario;
	private String plataformaComunicacion;
	
	
	
	
	
	
	public AtencionClienteDomain(final UUID id,final String diasDeAtencion,final Time horario,final String plataformaComunicacion) {
		setDiasDeAtencion(diasDeAtencion);
		setHorario(horario);
		setId(id);
		setPlataformaComunicacion(plataformaComunicacion);
	}
	
	
	public static final AtencionClienteDomain crear(final UUID id, final String diasDeAtencion, final Time horario, final String plataformaComunicacion) {
		return new AtencionClienteDomain(id, diasDeAtencion, horario, plataformaComunicacion);
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
	
	
	
	public final AtencionClienteDomain setDiasDeAtencion(final String diasDeAtencion) {
		this.diasDeAtencion = diasDeAtencion;
		return this;
	}
	public final AtencionClienteDomain setHorario(Time horario) {
		this.horario = horario;
		return this;
	}
	
	
	public final   AtencionClienteDomain   setPlataformaComunicacion(String plataformaComunicacion) {
		this.plataformaComunicacion = plataformaComunicacion;
		return this;
	}
	
	
	
	
	
	
	

}
