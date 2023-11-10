package co.edu.uco.spa.data.dao.concrete.sqlserver;

import java.sql.Connection;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.spa.data.dao.TipoServicioDAO;
import co.edu.uco.spa.data.entity.TipoServicioEntity;

public class TipoServicioSQLServerDAO extends SQLDAO implements TipoServicioDAO{

	public TipoServicioSQLServerDAO(Connection conexion) {
		super(conexion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void crear(TipoServicioEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modoficar(TipoServicioEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(UUID id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<TipoServicioEntity> consultarPorId(UUID id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<TipoServicioEntity> consultar(TipoServicioEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
