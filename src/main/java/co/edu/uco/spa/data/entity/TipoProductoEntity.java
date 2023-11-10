package co.edu.uco.spa.data.entity;

import java.util.UUID;

public class TipoProductoEntity {

	private UUID id;
	private String tipoProducto;
	
	
	
	private TipoProductoEntity( final UUID id, final String tipoProducto) {
		setId(id);
		setTipoProducto(tipoProducto);
	}

	
	public static final TipoProductoEntity crear(final UUID id, final String tipoProducto) {
		return new TipoProductoEntity(id, tipoProducto);
	}


	private final void setId(UUID id) {
		this.id = id;
	}



	private final void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}



	public final UUID getId() {
		return id;
	}



	public final String getTipoProducto() {
		return tipoProducto;
	}
	
	
	
	
	
}

