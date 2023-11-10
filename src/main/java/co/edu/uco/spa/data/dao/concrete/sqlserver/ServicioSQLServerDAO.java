package co.edu.uco.spa.data.dao.concrete.sqlserver;

import java.sql.Connection;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.spa.data.dao.ServicioDAO;
import co.edu.uco.spa.data.entity.ServicioEntity;
import co.edu.uco.spa.data.entity.TipoServicioEntity;

public class ServicioSQLServerDAO extends SQLDAO implements ServicioDAO{

	public ServicioSQLServerDAO(Connection conexion) {
		super(conexion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void crear(ServicioEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificar(TipoServicioEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(UUID id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<ServicioEntity> consultarPorId(UUID id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<ServicioEntity> consultar(ServicioEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
