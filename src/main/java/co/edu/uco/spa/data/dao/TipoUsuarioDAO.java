package co.edu.uco.spa.data.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.spa.data.entity.TipoUsuarioEntity;

public interface TipoUsuarioDAO {
	
	
	void crear(TipoUsuarioEntity entity);
	
	void modificar(TipoUsuarioEntity entity);
	
	void eliminar(UUID id);
	
	
	Optional<TipoUsuarioEntity>consultarPorId(UUID id);
	
	List<TipoUsuarioEntity>consultar(TipoUsuarioEntity entity);

}
