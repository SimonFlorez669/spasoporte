package co.edu.uco.spa.data.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.spa.data.entity.ServicioEntity;
import co.edu.uco.spa.data.entity.TipoServicioEntity;

public interface ServicioDAO {
	
	
	void crear(ServicioEntity entity);
	
	void modificar(TipoServicioEntity entity);
	
	void eliminar(UUID id);
	
	
	Optional<ServicioEntity>consultarPorId(UUID id);
	
	List<ServicioEntity>consultar(ServicioEntity entity);
	

}
