package co.edu.uco.spa.data.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.spa.data.entity.UsuariosEntity;

public interface UsuariosDAO {
	
	
	void crear(UsuariosEntity entity);
	
	void modificar(UsuariosEntity entity);
	
	void eliminar(UUID id);
	
	Optional<UsuariosEntity>consultarPorId(UUID id);
	
	List<UsuariosEntity>consultar(UsuariosEntity entity);

}
