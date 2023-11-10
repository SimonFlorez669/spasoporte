package co.edu.uco.spa.data.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.spa.data.entity.PagoEntity;

public interface PagosDAO {
	
	
	void crear(PagoEntity entity);
	
	void modificiar(PagoEntity entity);
	
	void eliminar(UUID id);
	
	
	Optional<PagoEntity>consultarPorId(UUID id);
	
	
	List<PagoEntity>consultar(PagoEntity entity);
	
	

}
