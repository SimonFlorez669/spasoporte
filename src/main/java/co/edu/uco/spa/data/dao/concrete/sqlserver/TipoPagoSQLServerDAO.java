package co.edu.uco.spa.data.dao.concrete.sqlserver;

import java.sql.Connection;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import co.edu.uco.spa.data.dao.TipoPagoDAO;
import co.edu.uco.spa.data.entity.TipoPagoEntity;

public class TipoPagoSQLServerDAO extends SQLDAO implements TipoPagoDAO {

	public TipoPagoSQLServerDAO(Connection conexion) {
		super(conexion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void crear(TipoPagoEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificar(TipoPagoEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(UUID id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<TipoPagoEntity> consultarPorId(UUID id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<TipoPagoEntity> consultar(TipoPagoEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	

}
