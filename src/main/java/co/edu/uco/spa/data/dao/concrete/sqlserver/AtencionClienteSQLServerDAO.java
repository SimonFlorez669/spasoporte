package co.edu.uco.spa.data.dao.concrete.sqlserver;

import java.sql.Connection;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.spa.data.dao.AtencionClienteDAO;
import co.edu.uco.spa.data.entity.AtencionClienteEntity;

public class AtencionClienteSQLServerDAO extends SQLDAO implements AtencionClienteDAO {
	
	public AtencionClienteSQLServerDAO(Connection conexion) {
		super(conexion);
	}

	public void crear(AtencionClienteEntity entity) {
		// TODO Auto-generated method stub
		
	}

	public void modificar(AtencionClienteEntity entity) {
		// TODO Auto-generated method stub
		
	}

	public void eliminar(UUID id) {
		// TODO Auto-generated method stub
		
	}

	public Optional<AtencionClienteEntity> consultarPorId(UUID id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	
	public List<AtencionClienteEntity> consultar(AtencionClienteEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
