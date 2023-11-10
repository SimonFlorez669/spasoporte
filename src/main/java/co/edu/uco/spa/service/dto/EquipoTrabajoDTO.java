package co.edu.uco.spa.service.dto;

import java.io.File;
import java.util.UUID;


public class EquipoTrabajoDTO {
	
	private UUID id;
	private String NombreEmpleado;
	private String Cargo;
	private String titulos;
	private String Descripcion;
	private File foto;
	
	
	
	public EquipoTrabajoDTO(final UUID id, final String nombreEmpleado,final String cargo,final String titulos,final String descripcion,
			final File foto) {
		
		setCargo(cargo);
		setDescripcion(descripcion);
		setFoto(foto);
		setId(id);
		setNombreEmpleado(nombreEmpleado);
		setTitulos(titulos);
		
	}
	
	
	
	public static final  EquipoTrabajoDTO crear(final UUID id, final String NombreEmpleado, final String Cargo,final String titulos, final String descripcion, final File foto) {
		return new EquipoTrabajoDTO(id, NombreEmpleado, Cargo,descripcion,titulos,foto);
	}



	public final UUID getId() {
		return id;
	}



	public final String getNombreEmpleado() {
		return NombreEmpleado;
	}



	public final String getCargo() {
		return Cargo;
	}



	public final String getTitulos() {
		return titulos;
	}



	public final String getDescripcion() {
		return Descripcion;
	}



	public final File getFoto() {
		return foto;
	}


	
	

	public final void setId(final UUID id) {
		this.id = id;
	}



	public final void setNombreEmpleado(final String nombreEmpleado) {
		NombreEmpleado = nombreEmpleado;
	}



	public final void setCargo(final String cargo) {
		Cargo = cargo;
	}



	public final void setTitulos(final String titulos) {
		this.titulos = titulos;
	}



	public final void setDescripcion(final String descripcion) {
		Descripcion = descripcion;
	}



	public final void setFoto(final File foto) {
		this.foto = foto;
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
