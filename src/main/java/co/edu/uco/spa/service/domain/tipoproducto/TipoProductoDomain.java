package co.edu.uco.spa.service.domain.tipoproducto;

import java.util.UUID;


public class TipoProductoDomain {
	
	private UUID id;
	private String tipoProducto;
	
	
	
	public TipoProductoDomain(final UUID id, final String tipoProducto) {
		setId(id);
		setTipoProducto(tipoProducto);
	}
	
	
	public static final TipoProductoDomain crear(final UUID id, final String tipoProducto) {
		return new TipoProductoDomain(id, tipoProducto);
	}
	
	
	public final UUID getId() {
		return id;
	}
	public final String getTipoProducto() {
		return tipoProducto;
	}
	
	
	public final TipoProductoDomain setId(final UUID id) {
		this.id = id;
		return this;
	}
	public final TipoProductoDomain setTipoProducto(final String tipoProducto) {
		this.tipoProducto = tipoProducto;
		return this;
	}

	
	
	
	
}
