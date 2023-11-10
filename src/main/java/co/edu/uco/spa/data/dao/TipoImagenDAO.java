package co.edu.uco.spa.data.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.spa.data.entity.TipoIdentificacionEntity;

public interface TipoImagenDAO {
	
	void crear(TipoIdentificacionEntity entity);
	
	void modificar(TipoIdentificacionEntity entity);
	
	void eliminar(UUID id);
	
	Optional<TipoIdentificacionEntity>consultarPorId(UUID id);
	
	List<TipoIdentificacionEntity>consultar(TipoIdentificacionEntity entity);

}
