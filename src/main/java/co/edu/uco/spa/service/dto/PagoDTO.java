package co.edu.uco.spa.service.dto;

import java.util.UUID;



public class PagoDTO {
	
	private UUID id;
	private TipoPagoDTO tipoPago;
	private boolean pagoConfirmado;
	private int monto;
	private String estado;
	private NotificacionDTO notificacion;
	
	
	
	public PagoDTO(final UUID id,final TipoPagoDTO tipoPago,final boolean pagoConfirmado, final int monto,final String estado,
			final NotificacionDTO notificacion) {
		
		setEstado(estado);
		setId(id);
		setMonto(monto);
		setNotificacion(notificacion);
		setPagoConfirmado(pagoConfirmado);
		setTipoPago(tipoPago);
		
		
	}



	public final UUID getId() {
		return id;
	}



	public final TipoPagoDTO getTipoPago() {
		return tipoPago;
	}



	public final boolean isPagoConfirmado() {
		return pagoConfirmado;
	}



	public final int getMonto() {
		return monto;
	}



	public final String getEstado() {
		return estado;
	}



	public final NotificacionDTO getNotificacion() {
		return notificacion;
	}



	public final void setId(final UUID id) {
		this.id = id;
	}



	public final void setTipoPago(final TipoPagoDTO tipoPago) {
		this.tipoPago = tipoPago;
	}



	public final void setPagoConfirmado(final boolean pagoConfirmado) {
		this.pagoConfirmado = pagoConfirmado;
	}



	public final void setMonto(final int monto) {
		this.monto = monto;
	}



	public final void setEstado(final String estado) {
		this.estado = estado;
	}



	public final void setNotificacion(final NotificacionDTO notificacion) {
		this.notificacion = notificacion;
	}

	
	
	
	
	
	
	
}
