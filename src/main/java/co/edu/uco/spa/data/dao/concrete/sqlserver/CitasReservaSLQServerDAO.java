package co.edu.uco.spa.data.dao.concrete.sqlserver;

import java.sql.Connection;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.spa.data.dao.CitaReservaDAO;
import co.edu.uco.spa.data.entity.CitaReservaEntity;

public class CitasReservaSLQServerDAO extends SQLDAO implements CitaReservaDAO {

	public CitasReservaSLQServerDAO(Connection conexion) {
		super(conexion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void crear(CitaReservaEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificar(CitaReservaEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(UUID id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<CitaReservaEntity> consultarPorId(UUID id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<CitaReservaEntity> consultar(CitaReservaEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}
	

	
	
	
}
