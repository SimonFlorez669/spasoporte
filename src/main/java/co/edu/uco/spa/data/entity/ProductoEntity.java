package co.edu.uco.spa.data.entity;

import java.util.UUID;

public class ProductoEntity {
	
	private UUID id;
	private int idTipoProducto;
	private String nombre;
	private int cantidadExistente;
	private int precioUnitario;
	private String unidadMedida;
	
	
	
	
	private ProductoEntity(final UUID id, final int idTipoProducto, final String nombre, final int cantidadExistente, final int precioUnitario,
			final String unidadMedida) {

		setId(id);
		setIdTipoProducto(idTipoProducto);
		setNombre(nombre);
		setCantidadExistente(cantidadExistente);
		setPrecioUnitario(precioUnitario);
		setUnidadMedida(unidadMedida);
	}
	
	
	public static final ProductoEntity crear(final UUID id, final int idTipoProducto, final String nombre, final int cantidadExistente, final int precioUnitario,
			final String unidadMedida) {
		return new ProductoEntity(id, idTipoProducto, nombre, cantidadExistente, precioUnitario, unidadMedida);
	}

	



	private final void setId(UUID id) {
		this.id = id;
	}




	private final void setIdTipoProducto(int idTipoProducto) {
		this.idTipoProducto = idTipoProducto;
	}




	private final void setNombre(String nombre) {
		this.nombre = nombre;
	}




	private final void setCantidadExistente(int cantidadExistente) {
		this.cantidadExistente = cantidadExistente;
	}




	private final void setPrecioUnitario(int precioUnitario) {
		this.precioUnitario = precioUnitario;
	}




	private final void setUnidadMedida(String unidadMedida) {
		this.unidadMedida = unidadMedida;
	}




	public final UUID getId() {
		return id;
	}




	public final int getIdTipoProducto() {
		return idTipoProducto;
	}




	public final String getNombre() {
		return nombre;
	}




	public final int getCantidadExistente() {
		return cantidadExistente;
	}




	public final int getPrecioUnitario() {
		return precioUnitario;
	}




	public final String getUnidadMedida() {
		return unidadMedida;
	}
	
	
	
	
	
	
	

}
