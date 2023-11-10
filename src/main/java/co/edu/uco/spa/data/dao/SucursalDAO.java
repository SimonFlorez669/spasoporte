package co.edu.uco.spa.data.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.spa.data.entity.SucursalEntity;

public interface SucursalDAO {
	
	void crear(SucursalEntity entity);
	
	void modificar(SucursalEntity entity);
	
	void eliminar (UUID id);
	
	Optional<SucursalEntity>consultarPorId(UUID id);
	
	List<SucursalEntity>consultar(SucursalEntity entity);

}
