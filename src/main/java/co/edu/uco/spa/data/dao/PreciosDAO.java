package co.edu.uco.spa.data.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.spa.data.entity.PreciosEntity;

public interface PreciosDAO {
	
	
	void crear(PreciosEntity entity);
	
	void modificar(PreciosEntity entity);
	
	void eliminar(UUID id);
	
	
	Optional<PreciosEntity>consultarPorId(UUID id);

	List<PreciosEntity>consultar(PreciosEntity entity);
	

}
