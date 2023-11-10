package co.edu.uco.spa.service.domain.equipotrabajo;

import java.io.File;
import java.util.UUID;

public class EquipoTrabajoDomain {

	
private UUID id;
private String NombreEmpleado;
private String Cargo;
private String titulos;
private String Descripcion;
private File foto;





public static final  EquipoTrabajoDomain crear(final UUID id, final String NombreEmpleado, final String Cargo,final String titulos, final String descripcion, final File foto) {
	return new EquipoTrabajoDomain(id, NombreEmpleado, Cargo,descripcion,titulos,foto);
}






public EquipoTrabajoDomain(final UUID id,final String nombreEmpleado,final String cargo,final String titulos,final String descripcion,
		final File foto) {
	setCargo(cargo);
	setDescripcion(descripcion);
	setFoto(foto);
	setId(id);
	setNombreEmpleado(nombreEmpleado);
	setTitulos(titulos);
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


public final EquipoTrabajoDomain setId(final UUID id) {
	
	this.id = id;
	return this;
}
public final EquipoTrabajoDomain setNombreEmpleado(final String nombreEmpleado) {
	NombreEmpleado = nombreEmpleado;
	return this;
}
public final EquipoTrabajoDomain  setCargo(final String cargo) {
	Cargo = cargo;
	return this;
}
public final EquipoTrabajoDomain setTitulos(final String titulos) {
	this.titulos = titulos;
	return this;
}
public final EquipoTrabajoDomain setDescripcion(final String descripcion) {
	Descripcion = descripcion;
	return this;
}
public final EquipoTrabajoDomain setFoto(final File foto) {
	this.foto = foto;
	return this;
}







}
