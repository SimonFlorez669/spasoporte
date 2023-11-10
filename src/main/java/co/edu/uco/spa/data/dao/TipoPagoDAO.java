package co.edu.uco.spa.data.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.spa.data.entity.TipoPagoEntity;

public interface TipoPagoDAO {
	
	void crear (TipoPagoEntity entity);
	
	void modificar (TipoPagoEntity entity);
	
	void eliminar(UUID id);
	
	
	Optional<TipoPagoEntity>consultarPorId(UUID id);
	
	
	List<TipoPagoEntity>consultar(TipoPagoEntity entity);
	
	
	

}
