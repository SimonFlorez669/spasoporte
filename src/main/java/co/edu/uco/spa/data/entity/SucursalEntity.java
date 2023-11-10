package co.edu.uco.spa.data.entity;

import java.util.UUID;

import co.edu.uco.spa.data.entity.support.UbicacionSucursalEntity;

public class SucursalEntity {
	
	private UUID id;
	private String nombre;
	private int telefono;
	private int numeroEmpleados;
	private ClienteEntity encargadoSucursal;
	private ServicioEntity servicio;
	private UbicacionSucursalEntity ubicacionSucursal;



	private SucursalEntity(final UUID id,final String nombre,final int telefono,final int numeroEmpleados,
		final	ClienteEntity encargadoSucursal,final ServicioEntity servicio,final UbicacionSucursalEntity ubicacionSucursal ) {
		setId(id);
		setNombre(nombre);
		setTelefono(telefono);
		setNumeroEmpleados(numeroEmpleados);
		setEncargadoSucursal(encargadoSucursal);
		setServicio(servicio);
		setUbicacionSucursal(ubicacionSucursal);
		
	}

	
	public static final SucursalEntity crear(final UUID id,final String nombre,final int telefono,final int numeroEmpleados,
		final	ClienteEntity encargadoSucursal,final ServicioEntity servicio,final UbicacionSucursalEntity ubicacionSucursal) {
		
		return new SucursalEntity(id, nombre, telefono, numeroEmpleados, encargadoSucursal, servicio, ubicacionSucursal );
	}


	private final void setId(UUID id) {
		this.id = id;
	}



	private final void setNombre(String nombre) {
		this.nombre = nombre;
	}


	private final void setTelefono(int telefono) {
		this.telefono = telefono;
	}



	private final void setNumeroEmpleados(int numeroEmpleados) {
		this.numeroEmpleados = numeroEmpleados;
	}



	private final void setEncargadoSucursal(ClienteEntity encargadoSucursal) {
		this.encargadoSucursal = encargadoSucursal;
	}



	private final void setServicio(ServicioEntity servicio) {
		this.servicio = servicio;
	}

	

	private final void setUbicacionSucursal(UbicacionSucursalEntity ubicacionSucursal) {
		this.ubicacionSucursal = ubicacionSucursal;
	}


	public final UUID getId() {
		return id;
	}



	public final String getNombre() {
		return nombre;
	}



	public final int getTelefono() {
		return telefono;
	}



	public final int getNumeroEmpleados() {
		return numeroEmpleados;
	}



	public final ClienteEntity getEncargadoSucursal() {
		return encargadoSucursal;
	}



	public final ServicioEntity getServicio() {
		return servicio;
	}


	public final UbicacionSucursalEntity getUbicacionSucursal() {
		return ubicacionSucursal;
	}


	
	
	

}
