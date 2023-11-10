package co.edu.uco.spa.service.domain.producto;

import java.util.UUID;


public class ProductoDomain {
	
	
	private UUID id;
	private int idTipoProducto;
	private String nombre;
	private int cantidadExistente;
	private int precioUnitario;
	private String unidadMedida;
	
	
	
	
	public ProductoDomain(final UUID id,final  int idTipoProducto,final  String nombre,final int cantidadExistente,final int precioUnitario,
			String unidadMedida) {
		setCantidadExistente(cantidadExistente);
		setId(id);
		setIdTipoProducto(idTipoProducto);
		setNombre(nombre);
		setPrecioUnitario(precioUnitario);
		setUnidadMedida(unidadMedida);
	}
	
	
	
	public static final ProductoDomain crear(final UUID id, final int idTipoProducto, final String nombre, final int cantidadExistente, final int precioUnitario,
			final String unidadMedida) {
		return new ProductoDomain(id, idTipoProducto, nombre, cantidadExistente, precioUnitario, unidadMedida);
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
	
	
	
	public final ProductoDomain setId(final UUID id) {
		this.id = id;
		return this;
	}
	
	public final ProductoDomain setIdTipoProducto(final int idTipoProducto) {
		this.idTipoProducto = idTipoProducto;
		return this;
	}
	
	public final ProductoDomain setNombre(final String nombre) {
		this.nombre = nombre;
		return this;
	}
	
	public final ProductoDomain setCantidadExistente(final int cantidadExistente) {
		this.cantidadExistente = cantidadExistente;
		return this;
	}
	
	public final ProductoDomain setPrecioUnitario(final int precioUnitario) {
		this.precioUnitario = precioUnitario;
		return this;
	}
	
	
	public final ProductoDomain setUnidadMedida(final String unidadMedida) {
		this.unidadMedida = unidadMedida;
		return this;
		
	}
	
	
	
	
	
	

}
