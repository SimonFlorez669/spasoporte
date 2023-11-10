package co.edu.uco.spa.data.dao.concrete.sqlserver;

import java.sql.Connection;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.spa.data.dao.TipoUsuarioDAO;
import co.edu.uco.spa.data.entity.TipoUsuarioEntity;

public class TipoUsuarioSQLServerDAO  extends SQLDAO implements TipoUsuarioDAO{

	public TipoUsuarioSQLServerDAO(Connection conexion) {
		super(conexion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void crear(TipoUsuarioEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificar(TipoUsuarioEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(UUID id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<TipoUsuarioEntity> consultarPorId(UUID id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<TipoUsuarioEntity> consultar(TipoUsuarioEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
