package co.edu.uco.spa.data.dao.concrete.sqlserver;

import java.sql.Connection;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.spa.data.dao.RestriccionServicioDAO;
import co.edu.uco.spa.data.entity.RestriccionServicioEntity;

public class RestriccionServicioSQLServerDAO extends SQLDAO implements RestriccionServicioDAO {

	public RestriccionServicioSQLServerDAO(Connection conexion) {
		super(conexion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void crear(RestriccionServicioEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificar(RestriccionServicioEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(UUID id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<RestriccionServicioEntity> consultarPorId(UUID id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<RestriccionServicioEntity> consultar(RestriccionServicioEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
