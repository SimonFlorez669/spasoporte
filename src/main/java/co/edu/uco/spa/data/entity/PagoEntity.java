package co.edu.uco.spa.data.entity;

import java.util.UUID;

public class PagoEntity {
	
	private UUID id;
	private TipoPagoEntity tipoPago;
	private boolean pagoConfirmado;
	private int monto;
	private String estado;
	private NotificacionEntity notificacion;
	
	
	
	
	private PagoEntity(final UUID id, final TipoPagoEntity tipoPago,final boolean pagoConfirmado,final int monto,final String estado,
			final NotificacionEntity notificacion) {
		setId(id);
		setTipoPago(tipoPago);
		setPagoConfirmado(pagoConfirmado);
		setMonto(monto);
		setEstado(estado);
		setNotificacion(notificacion);
		
	}
	
	public static final PagoEntity crear (final UUID id, final TipoPagoEntity tipoPago,final boolean pagoConfirmado,final int monto,final String estado,
			final NotificacionEntity notificacion) {
		return new PagoEntity(id, tipoPago, pagoConfirmado, monto, estado, notificacion);
	}




	private final void setId(UUID id) {
		this.id = id;
	}




	private final void setTipoPago(TipoPagoEntity tipoPago) {
		this.tipoPago = tipoPago;
	}




	private final void setPagoConfirmado(boolean pagoConfirmado) {
		this.pagoConfirmado = pagoConfirmado;
	}




	private final void setMonto(int monto) {
		this.monto = monto;
	}




	private final void setEstado(String estado) {
		this.estado = estado;
	}




	private final void setNotificacion(NotificacionEntity notificacion) {
		this.notificacion = notificacion;
	}




	public final UUID getId() {
		return id;
	}




	public final TipoPagoEntity getTipoPago() {
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




	public final NotificacionEntity getNotificacion() {
		return notificacion;
	}
	
	
	
	
	
	

}
