package co.edu.uco.spa.service.domain.inventario;

import java.util.UUID;

import co.edu.uco.spa.service.domain.producto.ProductoDomain;
import co.edu.uco.spa.service.domain.sucursal.SucursalDomain;
import co.edu.uco.spa.service.domain.tipoproducto.TipoProductoDomain;





public class InventarioDomain {
	private UUID id;
	private ProductoDomain nombreProducto;
	private ProductoDomain cantidad;
	private TipoProductoDomain tipoProducto;
	private SucursalDomain sucursal;
	
	
	
	
	
	
	
	public InventarioDomain(final UUID id,final  ProductoDomain nombreProducto,final ProductoDomain cantidad,
			final TipoProductoDomain tipoProducto, final SucursalDomain sucursal) {
		setCantidad(null);
		setId(id);
		setNombreProducto(null);
		setSucursal(null);
		setTipoProducto(null);
	}
	
	
	public static final InventarioDomain crear(final UUID id,final ProductoDomain nombreProducto, final ProductoDomain cantidad, final TipoProductoDomain tipoProducto,
			final SucursalDomain sucursal) {
		return new InventarioDomain(id, nombreProducto, cantidad, tipoProducto, sucursal);
	}
	
	
	
	
	public final UUID getId() {
		return id;
	}
	public final ProductoDomain getNombreProducto() {
		return nombreProducto;
	}
	public final ProductoDomain getCantidad() {
		return cantidad;
	}
	public final TipoProductoDomain getTipoProducto() {
		return tipoProducto;
	}
	public final SucursalDomain getSucursal() {
		return sucursal;
	}
	
	
	
	public final void setId(UUID id) {
		this.id = id;
	}
	public final InventarioDomain setNombreProducto(final ProductoDomain nombreProducto) {
		this.nombreProducto = nombreProducto;
		return this;
	}
	public final InventarioDomain setCantidad(final ProductoDomain cantidad) {
		this.cantidad = cantidad;
		return this;
	}
	public final InventarioDomain setTipoProducto(final TipoProductoDomain tipoProducto) {
		this.tipoProducto = tipoProducto;
		return this;
	}
	public final InventarioDomain setSucursal(final SucursalDomain sucursal) {
		this.sucursal = sucursal;
		return this;
	}
	
	
	
	
	
	

}
