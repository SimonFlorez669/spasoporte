package co.edu.uco.spa.data.dao.concrete.sqlserver;

import java.sql.Connection;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.spa.data.dao.UsuariosDAO;
import co.edu.uco.spa.data.entity.UsuariosEntity;

public class UsuariosSQLServerDAO extends SQLDAO implements UsuariosDAO{

	public UsuariosSQLServerDAO(Connection conexion) {
		super(conexion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void crear(UsuariosEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificar(UsuariosEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(UUID id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<UsuariosEntity> consultarPorId(UUID id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<UsuariosEntity> consultar(UsuariosEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	

}
