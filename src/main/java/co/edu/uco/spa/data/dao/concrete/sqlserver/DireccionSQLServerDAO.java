package co.edu.uco.spa.data.dao.concrete.sqlserver;

import java.sql.Connection;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.spa.data.dao.DireccionDAO;
import co.edu.uco.spa.data.entity.DireccionEntity;

public class DireccionSQLServerDAO extends SQLDAO implements DireccionDAO{

	public DireccionSQLServerDAO(Connection conexion) {
		super(conexion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void crear(DireccionEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificar(DireccionEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(UUID id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<DireccionEntity> consultarPorId(UUID id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<DireccionEntity> consultar(DireccionEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	

}
