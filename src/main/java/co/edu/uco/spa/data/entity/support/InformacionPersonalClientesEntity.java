package co.edu.uco.spa.data.entity.support;

import java.util.Date;

public class InformacionPersonalClientesEntity {
	private String nombre;
	private String apellido;
	private Date fechaNacimiento;
	
	
	private InformacionPersonalClientesEntity( final String nombre, final String apellido, final Date fechaNacimiento) {
		
		setNombre(nombre);
		setApellido(apellido);
		setFechaNacimiento(fechaNacimiento);
		
	}
	
	public static final InformacionPersonalClientesEntity crear (final String nombre, final String apellido, final Date fechaNacimiento) {
		return new InformacionPersonalClientesEntity(nombre, apellido, fechaNacimiento);
	}


	private final void setNombre(String nombre) {
		this.nombre = nombre;
	}


	private final void setApellido(String apellido) {
		this.apellido = apellido;
	}


	private final void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public final String getNombre() {
		return nombre;
	}


	public final String getApellido() {
		return apellido;
	}


	public final Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	
	
	
	
	

	
	
}