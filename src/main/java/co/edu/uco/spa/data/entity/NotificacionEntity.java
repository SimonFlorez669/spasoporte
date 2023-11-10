package co.edu.uco.spa.data.entity;

import java.util.UUID;

public class NotificacionEntity {
	
	private UUID id;
	private String notificacion;
	
	
	private NotificacionEntity(final UUID id, final String notificacion) {
		
		setId(id);
		setNotificacion(notificacion);
	}
	
	public static final NotificacionEntity crear(final UUID id, final String notificacion) {
		return new NotificacionEntity(id, notificacion);
	}


	private final void setId(UUID id) {
		this.id = id;
	}


	private final void setNotificacion(String notificacion) {
		this.notificacion = notificacion;
	}


	public final UUID getId() {
		return id;
	}


	public final String getNotificacion() {
		return notificacion;
	}
	
	
	
	
	
	

}
