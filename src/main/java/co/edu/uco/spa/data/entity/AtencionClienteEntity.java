package co.edu.uco.spa.data.entity;

import java.sql.Time;
import java.util.UUID;

public class AtencionClienteEntity {
	
	private UUID id;
	private String diasDeAtencion;
	private Time horario;
	private String plataformaComunicacion;
	
	
	private AtencionClienteEntity( final UUID id, final String diasDeAtencion, final Time horario, final String plataformaComunicacion) {
		super();
		setId(id);
		setDiasDeAtencion(diasDeAtencion);
		setHorario(horario);
		setPlataformaComunicacion(plataformaComunicacion);
	}
	
	public static final AtencionClienteEntity crear(final UUID id, final String diasDeAtencion, final Time horario, final String plataformaComunicacion) {
		return new AtencionClienteEntity(id, diasDeAtencion, horario, plataformaComunicacion);
	}
	
	private final void setId(UUID id) {
		this.id = id;
	}
	private final void setDiasDeAtencion(String diasDeAtencion) {
		this.diasDeAtencion = diasDeAtencion;
	}
	private final void setHorario(Time horario) {
		this.horario = horario;
	}
	private final void setPlataformaComunicacion(String plataformaComunicacion) {
		this.plataformaComunicacion = plataformaComunicacion;
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
	
	
	
	
	
}
