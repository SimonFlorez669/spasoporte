package co.edu.uco.spa.service.domain.tipoidentificacion;

import java.util.UUID;


public class TipoIdentificacionDomain {
	
	private UUID id;
	private String nombre;
	private String notacion;
	
	
	
	
	public TipoIdentificacionDomain(final UUID id,final String nombre,final String notacion) {
		setId(id);
		setNombre(nombre);
		setNotacion(notacion);
	}
	
	public static final TipoIdentificacionDomain crear(final UUID id, final String nombre,final String notacion) {
		return new TipoIdentificacionDomain (id, nombre, notacion);
	}
	
	
	
	public final UUID getId() {
		return id;
	}
	public final String getNombre() {
		return nombre;
	}
	public final String getNotacion() {
		return notacion;
	}
	
	
	
	public final TipoIdentificacionDomain setId(final UUID id) {
		this.id = id;
		return this;
	}
	
	
	
	public final TipoIdentificacionDomain setNombre(final String nombre) {
		this.nombre = nombre;
		return this;
	}
	
	
	public final TipoIdentificacionDomain setNotacion(final String notacion) {
		this.notacion = notacion;
		return this;
	}

	public String getCodigo() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object isEstado() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	

}
