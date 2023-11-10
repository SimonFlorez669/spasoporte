package co.edu.uco.spa.data.entity;

import java.util.UUID;

public class InventarioEntity {

	private UUID id;
	private ProductoEntity nombreProducto;
	private ProductoEntity cantidad;
	private TipoProductoEntity tipoProducto;
	private SucursalEntity sucursal;
	
	
	
	
	private InventarioEntity(final UUID id,final ProductoEntity nombreProducto, final ProductoEntity cantidad, final TipoProductoEntity tipoProducto,
			final SucursalEntity sucursal) {
		setId(id);
		setNombreProducto(nombreProducto);
		setCantidad(cantidad);
		setSucursal(sucursal);
		setTipoProducto(tipoProducto);
	}
	
	public static final InventarioEntity crear(final UUID id,final ProductoEntity nombreProducto, final ProductoEntity cantidad, final TipoProductoEntity tipoProducto,
			final SucursalEntity sucursal) {
		return new InventarioEntity(id, nombreProducto, cantidad, tipoProducto, sucursal);
	}




	private final void setId(UUID id) {
		this.id = id;
	}




	private final void setNombreProducto(ProductoEntity nombreProducto) {
		this.nombreProducto = nombreProducto;
	}




	private final void setCantidad(ProductoEntity cantidad) {
		this.cantidad = cantidad;
	}




	private final void setTipoProducto(TipoProductoEntity tipoProducto) {
		this.tipoProducto = tipoProducto;
	}




	private final void setSucursal(SucursalEntity sucursal) {
		this.sucursal = sucursal;
	}




	public final UUID getId() {
		return id;
	}




	public final ProductoEntity getNombreProducto() {
		return nombreProducto;
	}




	public final ProductoEntity getCantidad() {
		return cantidad;
	}




	public final TipoProductoEntity getTipoProducto() {
		return tipoProducto;
	}




	public final SucursalEntity getSucursal() {
		return sucursal;
	}
	
	
	
	
}
