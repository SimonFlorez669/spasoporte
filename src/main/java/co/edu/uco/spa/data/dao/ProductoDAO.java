package co.edu.uco.spa.data.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.spa.data.entity.ProductoEntity;

public interface ProductoDAO {
	
	void crear ( ProductoEntity entity);
	
	void moficiar(ProductoEntity entity);
	
	void eliminar(UUID id);
	
	Optional<ProductoEntity>consultarPorId(UUID id);
	
	List<ProductoEntity>consultar(ProductoEntity entity);

}
