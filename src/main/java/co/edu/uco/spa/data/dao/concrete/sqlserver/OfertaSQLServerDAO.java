package co.edu.uco.spa.data.dao.concrete.sqlserver;

import java.sql.Connection;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.spa.data.dao.OfertaDAO;
import co.edu.uco.spa.data.entity.OfertaEntity;

public class OfertaSQLServerDAO extends SQLDAO implements OfertaDAO {

	public OfertaSQLServerDAO(Connection conexion) {
		super(conexion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void crear(OfertaEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificar(OfertaEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(UUID id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<OfertaEntity> consultarPorId(UUID id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<OfertaEntity> consultar(OfertaEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
