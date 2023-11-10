package co.edu.uco.spa.service.dto;

import java.util.UUID;


public class TipoProductoDTO {
	
	
	

	private UUID id;
	private String tipoProducto;
	
	
	
	public TipoProductoDTO(final UUID id,final String tipoProducto) {
	 setId(id);
	 setTipoProducto(tipoProducto);
	}
	
	public static final TipoProductoDTO crear(final UUID id, final String tipoProducto) {
		return new TipoProductoDTO(id, tipoProducto);
	}



	public final UUID getId() {
		return id;
	}



	public final String getTipoProducto() {
		return tipoProducto;
	}



	public final void setId(final UUID id) {
		this.id = id;
	}



	public final void setTipoProducto(final String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}
	
	
	
	
	
	
	
	
	
	
	

}
