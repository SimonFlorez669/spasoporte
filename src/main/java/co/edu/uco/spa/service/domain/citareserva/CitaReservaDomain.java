package co.edu.uco.spa.service.domain.citareserva;

import java.util.UUID;

import co.edu.uco.spa.service.domain.clientes.ClientesDomain;
import co.edu.uco.spa.service.domain.notificacion.NotificacionDomain;
import co.edu.uco.spa.service.domain.pago.PagoDomain;
import co.edu.uco.spa.service.domain.sucursal.SucursalDomain;

public class CitaReservaDomain {
	
	private UUID id;
	private int codigoCita;
	private ClientesDomain cliente;
	private PagoDomain pago;
	private SucursalDomain sucursal;
	private NotificacionDomain notificacion;
	
	
	
	public CitaReservaDomain(final UUID id,final  int codigoCita,final ClientesDomain cliente,final PagoDomain pago,final SucursalDomain sucursal,
			final NotificacionDomain notificacion) {
		
	}
	
	public static final CitaReservaDomain crear(final UUID id,final int codigoCita, final ClientesDomain cliente, final PagoDomain pago, final SucursalDomain sucursal, final NotificacionDomain notificacion) {
		return new CitaReservaDomain(id,codigoCita, cliente , pago,sucursal,notificacion);
	}



	public final UUID getId() {
		return id;
	}



	public final int getCodigoCita() {
		return codigoCita;
	}



	public final ClientesDomain getCliente() {
		return cliente;
	}



	public final PagoDomain getPago() {
		return pago;
	}



	public final SucursalDomain getSucursal() {
		return sucursal;
	}



	public final NotificacionDomain getNotificacion() {
		return notificacion;
	}



	public final void setId(final UUID id) {
		this.id = id;
	}



	public final void setCodigoCita(final int codigoCita) {
		this.codigoCita = codigoCita;
	}



	public final void setCliente(final ClientesDomain cliente) {
		this.cliente = cliente;
	}



	public final void setPago(final PagoDomain pago) {
		this.pago = pago;
	}



	public final void setSucursal(final SucursalDomain sucursal) {
		this.sucursal = sucursal;
	}



	public final void setNotificacion(final NotificacionDomain notificacion) {
		this.notificacion = notificacion;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
