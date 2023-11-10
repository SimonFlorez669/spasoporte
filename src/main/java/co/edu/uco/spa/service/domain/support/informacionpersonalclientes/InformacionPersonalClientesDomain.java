package co.edu.uco.spa.service.domain.support.informacionpersonalclientes;

import java.util.Date;


public class InformacionPersonalClientesDomain {
	
	private String nombre;
	private String apellido;
	private Date fechaNacimiento;
	
	
	
	public InformacionPersonalClientesDomain(final String nombre,final  String apellido,final Date fechaNacimiento) {
		setApellido(apellido);
		setNombre(nombre);
		setFechaNacimiento(fechaNacimiento);
	}
	
	
	
	public static final InformacionPersonalClientesDomain crear (final String nombre, final String apellido, final Date fechaNacimiento) {
		return new InformacionPersonalClientesDomain(nombre, apellido, fechaNacimiento);
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

	
	
	public final  InformacionPersonalClientesDomain  setNombre(final String nombre) {
		this.nombre = nombre;
		return this;
	}
	
	

	public final InformacionPersonalClientesDomain setApellido(final String apellido) {
		this.apellido = apellido;
		return this;
	}
	
	
	

	public final InformacionPersonalClientesDomain setFechaNacimiento(final Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
		return this;
	
	}
	
	
	
	
	
	
	
	
	
	
	

}
