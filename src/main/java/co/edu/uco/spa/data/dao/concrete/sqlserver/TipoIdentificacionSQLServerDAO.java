package co.edu.uco.spa.data.dao.concrete.sqlserver;

import java.sql.Connection;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.spa.data.dao.TipoIdentificacionDAO;
import co.edu.uco.spa.data.entity.TipoIdentificacionEntity;

public class TipoIdentificacionSQLServerDAO extends SQLDAO implements TipoIdentificacionDAO{

	public TipoIdentificacionSQLServerDAO(Connection conexion) {
		super(conexion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void crear(TipoIdentificacionEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificar(TipoIdentificacionEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(UUID id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<TipoIdentificacionEntity> consultarPorId(UUID id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<TipoIdentificacionEntity> consultar(TipoIdentificacionEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
