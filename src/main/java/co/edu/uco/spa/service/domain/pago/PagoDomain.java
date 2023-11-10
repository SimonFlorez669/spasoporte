package co.edu.uco.spa.service.domain.pago;

import java.util.UUID;

import co.edu.uco.spa.service.domain.notificacion.NotificacionDomain;
import co.edu.uco.spa.service.domain.tipopago.TipoPagoDomain;





public class PagoDomain {
	
	private UUID id;
	private TipoPagoDomain tipoPago;
	private boolean pagoConfirmado;
	private int monto;
	private String estado;
	private NotificacionDomain notificacion;
	
	
	
	
	
	
	
	public PagoDomain(final UUID id,final TipoPagoDomain tipoPago,final boolean pagoConfirmado,final int monto,final String estado,
			final NotificacionDomain notificacion) {
		setEstado(estado);
		setId(id);
		setMonto(monto);
		setNotificacion(notificacion);
		setPagoConfirmado(pagoConfirmado);
		setTipoPago(null);
		
	}
	
	public static final PagoDomain crear (final UUID id, final TipoPagoDomain tipoPago,final boolean pagoConfirmado,final int monto,final String estado,
			final NotificacionDomain notificacion) {
		return new PagoDomain(id, tipoPago, pagoConfirmado, monto, estado, notificacion);
	}
	
	
	
	
	
	public final UUID getId() {
		return id;
	}
	public final TipoPagoDomain getTipoPago() {
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
	public final NotificacionDomain getNotificacion() {
		return notificacion;
	}
	
	
	
	
	
	public final PagoDomain setId(final UUID id) {
		this.id = id;
		return this;
	}
	public final PagoDomain setTipoPago(final TipoPagoDomain tipoPago) {
		this.tipoPago = tipoPago;
		return this;
	}
	
	
	public final PagoDomain setPagoConfirmado(final boolean pagoConfirmado) {
		this.pagoConfirmado = pagoConfirmado;
		return this;
	}
	
	
	public final PagoDomain setMonto(final int monto) {
		this.monto = monto;
		return this;
		
		
	}
	public final PagoDomain setEstado(final String estado) {
		this.estado = estado;
		return this;
	}
	public final PagoDomain setNotificacion(final NotificacionDomain notificacion) {
		this.notificacion = notificacion;
		return this;
	}
	
	
	
	
	

}
