package co.edu.uco.spa.data.dao.concrete.sqlserver;

import java.sql.Connection;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.spa.data.dao.PagosDAO;
import co.edu.uco.spa.data.entity.PagoEntity;

public class PagosSQLServerDAO extends SQLDAO implements PagosDAO {

	protected PagosSQLServerDAO(Connection conexion) {
		super(conexion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void crear(PagoEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificiar(PagoEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(UUID id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<PagoEntity> consultarPorId(UUID id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<PagoEntity> consultar(PagoEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
