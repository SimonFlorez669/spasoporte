package co.edu.uco.spa.data.entity;

import java.util.UUID;

public class TipoPagoEntity {
	
	private UUID id;
	private String tipoPago;
	
	
	
	private TipoPagoEntity( final UUID id,final String tipoPago) {
		setId(id);
		setTipoPago(tipoPago);
		
	}
	
	public static final TipoPagoEntity crear(final UUID id,final String tipoPago) {
		return new TipoPagoEntity(id, tipoPago);
	}



	private final void setId(UUID id) {
		this.id = id;
	}



	private final void setTipoPago(String tipoPago) {
		this.tipoPago = tipoPago;
	}



	public final UUID getId() {
		return id;
	}



	public final String getTipoPago() {
		return tipoPago;
	}
	
	
	
	
	
	
	
	

}
