package co.edu.uco.spa.data.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.spa.data.entity.EquipoTrabajoEntity;

public interface EquipoTrabajoDAO {
	
	void crear( EquipoTrabajoEntity entity);
	
	void modificar(EquipoTrabajoEntity entity);
	
	void eliminar(UUID id);
	
	Optional<EquipoTrabajoEntity>consultarPorId(UUID id);
	
	List<EquipoTrabajoEntity>consultar(EquipoTrabajoEntity entity);

}
