package co.edu.uco.spa.data.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.spa.data.entity.InventarioEntity;

public interface InventarioDAO {
	
	void crear(InventarioEntity entity);
	
	void modificar(InventarioEntity entity);
	
	void eiminar(UUID id);
	
	Optional<InventarioEntity>consultarPorId(UUID id);
	
	List<InventarioEntity>consultar(InventarioEntity entity);

}
