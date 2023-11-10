package co.edu.uco.spa.data.dao.concrete.sqlserver;

import java.sql.Connection;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.spa.data.dao.NotificacionDAO;
import co.edu.uco.spa.data.entity.NotificacionEntity;

public class NotificacionSQLSeverDAO extends SQLDAO implements NotificacionDAO{

	public NotificacionSQLSeverDAO(Connection conexion) {
		super(conexion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void crear(NotificacionEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificar(NotificacionEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(UUID id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<NotificacionEntity> consultarPorId(UUID id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<NotificacionEntity> consultaar(NotificacionEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
