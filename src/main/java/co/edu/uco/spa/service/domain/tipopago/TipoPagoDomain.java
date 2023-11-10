package co.edu.uco.spa.service.domain.tipopago;

import java.util.UUID;


public class TipoPagoDomain {
	
	private UUID id;
	private String tipoPago;
	
	
	
	
	public TipoPagoDomain(final UUID id,final String tipoPago) {
		setId(id);
		setTipoPago(tipoPago);
		
	}
	
	public static final TipoPagoDomain crear(final UUID id,final String tipoPago) {
		return new TipoPagoDomain(id, tipoPago);
	}
	
	
	
	public final UUID getId() {
		return id;
	}
	public final String getTipoPago() {
		return tipoPago;
	}
	
	
	public final TipoPagoDomain setId(final UUID id) {
		this.id = id;
		return this;
	}
	
	public final TipoPagoDomain setTipoPago(final String tipoPago) {
		this.tipoPago = tipoPago;
		return this;
	}
	
	
	
	

}
