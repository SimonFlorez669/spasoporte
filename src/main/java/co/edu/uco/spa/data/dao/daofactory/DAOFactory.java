package co.edu.uco.spa.data.dao.daofactory;

import co.edu.uco.spa.data.dao.AcercaDeNosotrosDAO;
import co.edu.uco.spa.data.dao.AtencionClienteDAO;
import co.edu.uco.spa.data.dao.BancoImagenesDAO;
import co.edu.uco.spa.data.dao.CalificacionDAO;
import co.edu.uco.spa.data.dao.CitaReservaDAO;
import co.edu.uco.spa.data.dao.ClienteDAO;
import co.edu.uco.spa.data.dao.ConsentimientoDAO;
import co.edu.uco.spa.data.dao.DireccionDAO;
import co.edu.uco.spa.data.dao.EquipoTrabajoDAO;
import co.edu.uco.spa.data.dao.InventarioDAO;
import co.edu.uco.spa.data.dao.NotificacionDAO;
import co.edu.uco.spa.data.dao.OfertaDAO;
import co.edu.uco.spa.data.dao.PagosDAO;
import co.edu.uco.spa.data.dao.PreciosDAO;
import co.edu.uco.spa.data.dao.ProductoDAO;
import co.edu.uco.spa.data.dao.RestriccionServicioDAO;
import co.edu.uco.spa.data.dao.ServicioDAO;
import co.edu.uco.spa.data.dao.SucursalDAO;
import co.edu.uco.spa.data.dao.TipoIdentificacionDAO;
import co.edu.uco.spa.data.dao.TipoImagenDAO;
import co.edu.uco.spa.data.dao.TipoPagoDAO;
import co.edu.uco.spa.data.dao.TipoProductoDAO;
import co.edu.uco.spa.data.dao.TipoServicioDAO;
import co.edu.uco.spa.data.dao.TipoUsuarioDAO;
import co.edu.uco.spa.data.dao.UsuariosDAO;
import co.edu.uco.spa.data.dao.daofactory.concrete.SQLServerDAOFactory;


public abstract class DAOFactory {
	
	
	
	
	
	
	public static final DAOFactory obtenerDAOFactory (final TipoDAOFactory factoria) {
		switch (factoria) {
		case SQLSERVER:{
			return new SQLServerDAOFactory(); 
		}
		case POSTGRESQL:{
			throw new RuntimeException("Factoria no soportada"); 
		}
		case MYSQL:{
			throw new RuntimeException("Factoria no soportada"); 
		}
		case ORACLE:{
			throw new RuntimeException("Factoria no soportada"); 
		}
		default:
			throw new  RuntimeException("Factoria no soportada");
		}
	}
	
protected abstract void abirConexion();
	
	public abstract void cerrarConexion();
	
	public abstract void iniciarTransaccion();
	
	public abstract void confirmarTransaccion();
	
	public abstract void cancelarTransaccion();
	
	public abstract ClienteDAO  obtenerClienteDAO();
	public abstract AtencionClienteDAO obtenerAtencionClienteDAO();
	public abstract BancoImagenesDAO obtenerBancoImagenesDAO();
	public abstract CalificacionDAO obtenerCalificacionDAO();
	public abstract CitaReservaDAO obtenerCitaReservaDAO();
	public abstract ClienteDAO obtenerClientesDAO();
	public abstract ConsentimientoDAO obtenerConsentimientoDAO();
	public abstract DireccionDAO obtenerDireccionDAO();
	public abstract EquipoTrabajoDAO obtenerEquipoTrabajoDAO();
	public abstract InventarioDAO obtenerInventarioDAO();
	public abstract NotificacionDAO obtenerNotificacionDAO();
	public abstract OfertaDAO obtenerOfertaDAO();
	public abstract PagosDAO obtenerPagoDAO();
	public abstract PreciosDAO obtenerPreciosDAO();
	public abstract ProductoDAO obtenerProductoDAO();
	public abstract RestriccionServicioDAO obtenerRestriccionServicioDAO();
	public abstract ServicioDAO obtenerServicioDAO();
	public abstract SucursalDAO obtenerSucursalDAO();
	public abstract TipoIdentificacionDAO obtenerTipoIdentificacionDAO();
	public abstract TipoImagenDAO obtenerTipoImagenDAO();
	public abstract TipoPagoDAO obtenerTipoPagoDAO();
	public abstract TipoProductoDAO obtenerTipoProductoDAO();
	public abstract TipoServicioDAO obtenerTipoServicioDAO();
	public abstract TipoUsuarioDAO obtenerTipoUsuarioDAO();
	public abstract UsuariosDAO obtenerUsuariosDAO();

	protected void abrirConexion() {
		// TODO Auto-generated method stub
		
	}

	


	
	
	
	
	
	

}
