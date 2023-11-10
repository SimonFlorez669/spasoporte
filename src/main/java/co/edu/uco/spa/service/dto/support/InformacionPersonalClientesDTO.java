package co.edu.uco.spa.service.dto.support;

import java.util.Date;


public class InformacionPersonalClientesDTO {
	
	
	
	private String nombre;
	private String apellido;
	private Date fechaNacimiento;
	
	public InformacionPersonalClientesDTO(final String nombre,final String apellido,final Date fechaNacimiento) {
		
		setApellido(apellido);
		setFechaNacimiento(fechaNacimiento);
		setNombre(nombre);
	}
	
	
	
	
	public static final InformacionPersonalClientesDTO crear (final String nombre, final String apellido, final Date fechaNacimiento) {
		return new InformacionPersonalClientesDTO(nombre, apellido, fechaNacimiento);
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

	public final void setNombre(final String nombre) {
		this.nombre = nombre;
	}

	public final void setApellido(final String apellido) {
		this.apellido = apellido;
	}

	public final void setFechaNacimiento(final Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
	
	
	
	
	
	
	
	

}
