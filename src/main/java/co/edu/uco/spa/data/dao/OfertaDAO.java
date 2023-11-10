package co.edu.uco.spa.data.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.spa.data.entity.OfertaEntity;

public interface OfertaDAO {

	
	
	void crear(OfertaEntity entity);
	
	void modificar(OfertaEntity entity);
	
	void eliminar(UUID id);
	
	Optional<OfertaEntity>consultarPorId(UUID id);
	
	List<OfertaEntity>consultar(OfertaEntity entity);
	
	
}
