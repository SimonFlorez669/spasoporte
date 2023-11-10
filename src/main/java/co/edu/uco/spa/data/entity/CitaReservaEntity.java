package co.edu.uco.spa.data.entity;

import java.util.UUID;

import co.edu.uco.spa.service.domain.citareserva.CitaReservaDomain;
import co.edu.uco.spa.service.domain.clientes.ClientesDomain;
import co.edu.uco.spa.service.domain.notificacion.NotificacionDomain;
import co.edu.uco.spa.service.domain.pago.PagoDomain;
import co.edu.uco.spa.service.domain.sucursal.SucursalDomain;



public final class CitaReservaEntity {
	private UUID id;
	private int codigoCita;
	private ClienteEntity cliente;
	private PagoEntity pago;
	private SucursalEntity sucursal;
	private NotificacionEntity notificacion;
	
	
	
	public CitaReservaEntity(final UUID id,final int codigoCita,final  ClienteEntity cliente,final PagoEntity pago, final SucursalEntity sucursal,
			final NotificacionEntity notificacion) {
		setCliente(cliente);
		setCodigoCita(codigoCita);
		setId(id);
		setNotificacion(notificacion);
		setPago(pago);
		setSucursal(sucursal);
		
	}
	
	
	public static final CitaReservaEntity crear(final UUID id,final int codigoCita, final ClientesDomain cliente, final PagoDomain pago, final SucursalDomain sucursal, final NotificacionDomain notificacion) {
		return new CitaReservaEntity(id,codigoCita, cliente , pago,sucursal,notificacion);
	}



	public UUID getId() {
		return id;
	}



	public int getCodigoCita() {
		return codigoCita;
	}



	public ClienteEntity getCliente() {
		return cliente;
	}



	public PagoEntity getPago() {
		return pago;
	}



	public SucursalEntity getSucursal() {
		return sucursal;
	}



	public NotificacionEntity getNotificacion() {
		return notificacion;
	}



	public final void setId(final UUID id) {
		this.id = id;
	}



	public final void setCodigoCita(final int codigoCita) {
		this.codigoCita = codigoCita;
	}



	public final void setCliente(final ClienteEntity cliente) {
		this.cliente = cliente;
	}



	public final  void setPago(final PagoEntity pago) {
		this.pago = pago;
	}



	public final void setSucursal(final SucursalEntity sucursal) {
		this.sucursal = sucursal;
	}



	public final  void setNotificacion(final NotificacionEntity notificacion) {
		this.notificacion = notificacion;
	}
	
	
	

	
	
	
	
	
	
}
