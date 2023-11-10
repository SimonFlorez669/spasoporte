package co.edu.uco.spa.data.dao.concrete.sqlserver;

import java.sql.Connection;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.spa.data.dao.ProductoDAO;
import co.edu.uco.spa.data.entity.ProductoEntity;

public class ProductoSQLServerDAO extends SQLDAO implements ProductoDAO {

	public ProductoSQLServerDAO(Connection conexion) {
		super(conexion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void crear(ProductoEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moficiar(ProductoEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(UUID id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<ProductoEntity> consultarPorId(UUID id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<ProductoEntity> consultar(ProductoEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
