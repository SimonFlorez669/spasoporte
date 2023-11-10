package co.edu.uco.spa.data.dao.concrete.sqlserver;

import java.sql.Connection;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.spa.data.dao.SucursalDAO;
import co.edu.uco.spa.data.entity.SucursalEntity;

public class SucursalSQLServerDAO extends SQLDAO implements SucursalDAO {

	public SucursalSQLServerDAO(Connection conexion) {
		super(conexion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void crear(SucursalEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificar(SucursalEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(UUID id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<SucursalEntity> consultarPorId(UUID id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<SucursalEntity> consultar(SucursalEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
