package co.edu.uco.spa.data.dao.concrete.sqlserver;

import java.sql.Connection;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.spa.data.dao.ConsentimientoDAO;
import co.edu.uco.spa.data.entity.ConsentimientoEntity;

public class ConsentimientoSQLServerDAO extends SQLDAO implements ConsentimientoDAO {

	public ConsentimientoSQLServerDAO(Connection conexion) {
		super(conexion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void crear(ConsentimientoEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificar(ConsentimientoEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(UUID id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<ConsentimientoEntity> consultarPorId(UUID id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<ConsentimientoEntity> consultar(ConsentimientoEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	

}
