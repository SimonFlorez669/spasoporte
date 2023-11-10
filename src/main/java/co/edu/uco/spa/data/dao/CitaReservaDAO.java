package co.edu.uco.spa.data.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.spa.data.entity.CitaReservaEntity;

public interface CitaReservaDAO {
	
	
	void crear(CitaReservaEntity entity);
	
	void modificar(CitaReservaEntity entity);
	
	void eliminar(UUID id);
	
	Optional<CitaReservaEntity>consultarPorId(UUID id);
	
	List<CitaReservaEntity>consultar(CitaReservaEntity entity);
	
	
	

}
