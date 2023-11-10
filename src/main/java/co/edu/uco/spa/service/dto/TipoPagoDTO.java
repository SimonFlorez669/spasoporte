package co.edu.uco.spa.service.dto;

import java.util.UUID;


public class TipoPagoDTO {
	
	
	

	private UUID id;
	private String tipoPago;
	
	
	
	public TipoPagoDTO(final UUID id,final String tipoPago) {
	
	}
	
	public static final TipoPagoDTO crear(final UUID id,final String tipoPago) {
		return new TipoPagoDTO(id, tipoPago);
	}



	public final UUID getId() {
		return id;
	}



	public final String getTipoPago() {
		return tipoPago;
	}



	public final void setId(final UUID id) {
		this.id = id;
	}



	public final void setTipoPago(final String tipoPago) {
		this.tipoPago = tipoPago;
	}
	
	
	
	
	
	
	
	
	
	

}
