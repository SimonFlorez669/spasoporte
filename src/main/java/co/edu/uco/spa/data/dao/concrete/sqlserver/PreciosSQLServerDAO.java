package co.edu.uco.spa.data.dao.concrete.sqlserver;

import java.sql.Connection;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.spa.data.dao.PreciosDAO;
import co.edu.uco.spa.data.entity.PreciosEntity;

public class PreciosSQLServerDAO extends SQLDAO implements PreciosDAO{

	public PreciosSQLServerDAO(Connection conexion) {
		super(conexion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void crear(PreciosEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificar(PreciosEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(UUID id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<PreciosEntity> consultarPorId(UUID id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<PreciosEntity> consultar(PreciosEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
