package co.edu.uco.spa.data.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.spa.data.entity.DireccionEntity;

public interface DireccionDAO {
	
	void crear(DireccionEntity entity);
	
	void modificar(DireccionEntity entity);
	
	void eliminar(UUID id);
	
	Optional<DireccionEntity>consultarPorId(UUID id);
	
	List<DireccionEntity>consultar(DireccionEntity entity);

}
