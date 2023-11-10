package co.edu.uco.spa.data.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.spa.data.entity.TipoProductoEntity;

public interface TipoProductoDAO {
	
	
	void crear(TipoProductoEntity entity);
	
	void modificar(TipoProductoEntity entity);
	
	void eliminar(UUID id);
	
	Optional<TipoProductoEntity>consultarPorId(UUID id);
	
	List<TipoProductoEntity>consultar(TipoProductoEntity entity);
	
	

}
