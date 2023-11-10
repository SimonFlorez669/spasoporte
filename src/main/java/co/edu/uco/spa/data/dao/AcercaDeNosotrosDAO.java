package co.edu.uco.spa.data.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.spa.data.entity.AcercaDeNosotrosEntity;



public interface AcercaDeNosotrosDAO {


	void crear ( AcercaDeNosotrosEntity  entity);
	
	void  modificar ( AcercaDeNosotrosEntity entity);
	
	
	void eliminar( UUID id);
	
	
	Optional<AcercaDeNosotrosEntity>consultarPorId(UUID id);
	
	List<AcercaDeNosotrosEntity> consultar(AcercaDeNosotrosEntity entity);
	
	
	
}
