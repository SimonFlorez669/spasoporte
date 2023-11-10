package co.edu.uco.spa.data.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.spa.data.entity.CalificacionEntity;

public interface CalificacionDAO {
	
	void crear (CalificacionEntity entity);
	
	void modificar( CalificacionEntity entity);
	
	void eliminar(UUID id);
	
	Optional<CalificacionEntity>consultarPorId(UUID id);
	
	List<CalificacionEntity>consultar (CalificacionEntity entity);
	
	
	

}
