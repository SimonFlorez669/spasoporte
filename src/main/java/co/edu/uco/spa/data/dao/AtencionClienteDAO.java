package co.edu.uco.spa.data.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.spa.data.entity.AtencionClienteEntity;

public interface AtencionClienteDAO {
	
	
	
	
	void crear (AtencionClienteEntity entity);
	
	void modificar ( AtencionClienteEntity entity);
	
	void eliminar(UUID id);
	
	Optional<AtencionClienteEntity>consultarPorId(UUID id);
	
	List<AtencionClienteEntity>consultar(AtencionClienteEntity entity);
	
	
	
	

}
