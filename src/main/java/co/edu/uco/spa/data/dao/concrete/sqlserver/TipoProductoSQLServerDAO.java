package co.edu.uco.spa.data.dao.concrete.sqlserver;

import java.sql.Connection;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.spa.data.dao.TipoProductoDAO;
import co.edu.uco.spa.data.entity.TipoProductoEntity;

public class TipoProductoSQLServerDAO extends SQLDAO implements TipoProductoDAO {

	public TipoProductoSQLServerDAO(Connection conexion) {
		super(conexion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void crear(TipoProductoEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificar(TipoProductoEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(UUID id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<TipoProductoEntity> consultarPorId(UUID id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<TipoProductoEntity> consultar(TipoProductoEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
