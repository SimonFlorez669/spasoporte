package co.edu.uco.spa.data.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.spa.data.entity.TipoServicioEntity;

public interface TipoServicioDAO {

	
	void crear(TipoServicioEntity entity);
	
	void modoficar(TipoServicioEntity entity);
	
	void eliminar(UUID id);
	
	Optional<TipoServicioEntity>consultarPorId(UUID id);
	
	List<TipoServicioEntity>consultar(TipoServicioEntity entity);
	
}
