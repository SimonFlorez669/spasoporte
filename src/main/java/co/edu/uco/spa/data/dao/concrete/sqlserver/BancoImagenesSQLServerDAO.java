package co.edu.uco.spa.data.dao.concrete.sqlserver;

import java.sql.Connection;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.spa.data.dao.BancoImagenesDAO;
import co.edu.uco.spa.data.entity.BancoImagenesEntity;

public class BancoImagenesSQLServerDAO extends SQLDAO implements BancoImagenesDAO {

	public BancoImagenesSQLServerDAO(Connection conexion) {
		super(conexion);
		// TODO Auto-generated constructor stub
	
	}

	@Override
	public void crear(BancoImagenesEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificar(BancoImagenesEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(UUID id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<BancoImagenesEntity> consultarPorId(UUID id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<BancoImagenesEntity> consultar(BancoImagenesEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	

}
