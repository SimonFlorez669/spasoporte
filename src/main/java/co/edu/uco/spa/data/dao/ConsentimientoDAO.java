package co.edu.uco.spa.data.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.spa.data.entity.ConsentimientoEntity;

public interface ConsentimientoDAO {
	
	void crear(ConsentimientoEntity entity);

	
	void modificar(ConsentimientoEntity entity);
	
	
	void eliminar(UUID id);
	
	
	Optional<ConsentimientoEntity>consultarPorId(UUID id);
	
	List<ConsentimientoEntity>consultar(ConsentimientoEntity entity);
	
	

}
