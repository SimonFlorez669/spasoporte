package co.edu.uco.spa.data.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.spa.data.entity.BancoImagenesEntity;

public interface BancoImagenesDAO {
	
	void crear(BancoImagenesEntity entity);
	
	
	void modificar(BancoImagenesEntity entity);
	
	void eliminar(UUID id);
	
	Optional<BancoImagenesEntity>consultarPorId(UUID id);
	
	List<BancoImagenesEntity>consultar(BancoImagenesEntity entity);

}
