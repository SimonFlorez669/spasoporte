package co.edu.uco.spa.data.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.spa.data.entity.RestriccionServicioEntity;

public interface RestriccionServicioDAO {
	
	
	void crear (RestriccionServicioEntity entity);
	
	void modificar ( RestriccionServicioEntity entity);
	
	
	void eliminar( UUID id);
	
	Optional<RestriccionServicioEntity>consultarPorId(UUID id);
	
	List<RestriccionServicioEntity>consultar(RestriccionServicioEntity entity);

}
