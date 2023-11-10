package co.edu.uco.spa.data.dao.concrete.sqlserver;

import java.sql.Connection;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.spa.data.dao.ClienteDAO;
import co.edu.uco.spa.data.entity.ClienteEntity;

public class ClienteSQLServerDAO  extends SQLDAO implements ClienteDAO{
	
	

	public ClienteSQLServerDAO(Connection conexion) {
		super(conexion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void crear(ClienteEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificar(ClienteEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(UUID id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<ClienteEntity> consultarPorId(UUID id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<ClienteEntity> consultar(ClienteEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
