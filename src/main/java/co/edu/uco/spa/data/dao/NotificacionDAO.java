package co.edu.uco.spa.data.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.spa.data.entity.NotificacionEntity;

public interface NotificacionDAO {

	
	void crear(NotificacionEntity entity);
	
	void modificar(NotificacionEntity entity);
	
	void eliminar(UUID id);
	
	
	Optional<NotificacionEntity>consultarPorId(UUID id);
	
	List<NotificacionEntity>consultaar(NotificacionEntity entity);
}
