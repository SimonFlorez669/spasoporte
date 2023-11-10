package co.edu.uco.spa.service.domain.notificacion;

import java.util.UUID;


public class NotificacionDomain {
	
	private UUID id;
	private String notificacion;
	
	
	
	
	public NotificacionDomain(final UUID id,final String notificacion) {

            setId(id);
            setNotificacion(notificacion);
	}
	
	public static final NotificacionDomain crear(final UUID id, final String notificacion) {
		return new NotificacionDomain(id, notificacion);
	}
	
	public final UUID getId() {
		return id;
	}
	public final String getNotificacion() {
		return notificacion;
	}
	
	
	
	public final NotificacionDomain setId(final UUID id) {
		this.id = id;
		return this;
	}
	public final NotificacionDomain setNotificacion(String notificacion) {
		this.notificacion = notificacion;
		return this;
	}
	
	
	
	
	

}
