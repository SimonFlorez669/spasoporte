package co.edu.uco.spa.data.dao.concrete.sqlserver;

import java.sql.Connection;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.spa.data.dao.InventarioDAO;
import co.edu.uco.spa.data.entity.InventarioEntity;

public class InventarioSQLServerDAO extends SQLDAO implements InventarioDAO{

	public InventarioSQLServerDAO(Connection conexion) {
		super(conexion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void crear(InventarioEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificar(InventarioEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eiminar(UUID id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<InventarioEntity> consultarPorId(UUID id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<InventarioEntity> consultar(InventarioEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
