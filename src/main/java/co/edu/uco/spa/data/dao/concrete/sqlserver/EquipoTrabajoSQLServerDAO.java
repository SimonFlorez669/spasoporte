package co.edu.uco.spa.data.dao.concrete.sqlserver;

import java.sql.Connection;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.spa.data.dao.EquipoTrabajoDAO;
import co.edu.uco.spa.data.entity.EquipoTrabajoEntity;

public class EquipoTrabajoSQLServerDAO extends SQLDAO implements EquipoTrabajoDAO{

	public EquipoTrabajoSQLServerDAO(Connection conexion) {
		super(conexion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void crear(EquipoTrabajoEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificar(EquipoTrabajoEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(UUID id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<EquipoTrabajoEntity> consultarPorId(UUID id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<EquipoTrabajoEntity> consultar(EquipoTrabajoEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	

}
