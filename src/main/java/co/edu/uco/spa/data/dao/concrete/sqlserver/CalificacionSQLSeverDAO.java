package co.edu.uco.spa.data.dao.concrete.sqlserver;

import java.sql.Connection;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.spa.data.dao.CalificacionDAO;
import co.edu.uco.spa.data.entity.CalificacionEntity;

public class CalificacionSQLSeverDAO extends SQLDAO implements CalificacionDAO {

	public CalificacionSQLSeverDAO(Connection conexion) {
		super(conexion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void crear(CalificacionEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificar(CalificacionEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(UUID id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<CalificacionEntity> consultarPorId(UUID id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<CalificacionEntity> consultar(CalificacionEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
