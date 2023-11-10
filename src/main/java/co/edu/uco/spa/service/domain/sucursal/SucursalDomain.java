package co.edu.uco.spa.service.domain.sucursal;

import java.util.UUID;

import co.edu.uco.spa.service.domain.clientes.ClientesDomain;
import co.edu.uco.spa.service.domain.servicio.ServicioDomain;
import co.edu.uco.spa.service.domain.support.ubicacionsucursal.UbicacionSucursalDomain;



public class SucursalDomain {
	
	private UUID id;
	private String nombre;
	private int telefono;
	private int numeroEmpleados;
	private ClientesDomain encargadoSucursal;
	private ServicioDomain servicio;
	private UbicacionSucursalDomain ubicacionSucursal;
	
	
	
	
	
	public SucursalDomain(final UUID id,final String nombre,final int telefono,final int numeroEmpleados,final ClientesDomain encargadoSucursal,
			final ServicioDomain servicio,final UbicacionSucursalDomain ubicacionSucursal) {
		setEncargadoSucursal(encargadoSucursal);
		setId(id);
		setNombre(nombre);
		setNumeroEmpleados(numeroEmpleados);
		setServicio(servicio);
		setTelefono(telefono);
		setUbicacionSucursal(ubicacionSucursal);
	}
	
	
	
	public static final SucursalDomain crear(final UUID id,final String nombre,final int telefono,final int numeroEmpleados,
			final	ClientesDomain encargadoSucursal,final ServicioDomain servicio,final UbicacionSucursalDomain ubicacionSucursal) {
			
			return new SucursalDomain(id, nombre, telefono, numeroEmpleados, encargadoSucursal, servicio, ubicacionSucursal );
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
	public final ClientesDomain getEncargadoSucursal() {
		return encargadoSucursal;
	}
	public final ServicioDomain getServicio() {
		return servicio;
	}
	public final UbicacionSucursalDomain getUbicacionSucursal() {
		return ubicacionSucursal;
	}
	
	
	
	public final SucursalDomain setId(final UUID id) {
		this.id = id;
		return this;
	}
	
	
	public final SucursalDomain setNombre(final String nombre) {
		this.nombre = nombre;
		return this;
	}
	
	public final  SucursalDomain setTelefono(final int telefono) {
		this.telefono = telefono;
		return this;
	}
	
	
	public final SucursalDomain setNumeroEmpleados(final int numeroEmpleados) {
		this.numeroEmpleados = numeroEmpleados;
		return this;
	}
	
	
	public final SucursalDomain setEncargadoSucursal(final ClientesDomain encargadoSucursal) {
		this.encargadoSucursal = encargadoSucursal;
		return this;
	}
	
	
	public final SucursalDomain setServicio(final ServicioDomain servicio) {
		this.servicio = servicio;
		return this;
	}
	
	
	public final SucursalDomain setUbicacionSucursal(final UbicacionSucursalDomain ubicacionSucursal) {
		this.ubicacionSucursal = ubicacionSucursal;
		return this;
	}
	
	

	
	
	
}
