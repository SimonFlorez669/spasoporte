package co.edu.uco.spa.service.facade.concrete.notificacion;

import co.edu.uco.spa.crosscutting.excepcion.SpaExcepcion;
import co.edu.uco.spa.data.dao.daofactory.DAOFactory;
import co.edu.uco.spa.data.dao.daofactory.TipoDAOFactory;
import co.edu.uco.spa.service.businesslogic.validator.concrete.tipoidentificacion.RegistrarTipoIdentificacionValidator;
import co.edu.uco.spa.service.bussineslogic.concrete.tipoidentificacion.RegistrarTipoIdentificacionUseCase;
import co.edu.uco.spa.service.domain.notificacion.NotificacionDomain;
import co.edu.uco.spa.service.domain.tipoidentificacion.TipoIdentificacionDomain;
import co.edu.uco.spa.service.facade.Facade;

public class RegistrarNotificacionFacade implements Facade<NotificacionDomain>{

	@Override
	public void execute(NotificacionDomain dto) {
		final TipoIdentificacionDomain domain = null; //Desde el dto con u
		RegistrarTipoIdentificacionValidator.ejecutar(domain);


		DAOFactory daoFactory = DAOFactory.obtenerDAOFactory(TipoDAOFactory.SQLSERVER);



		try {
			daoFactory.iniciarTransaccion();
			var UseCase = new RegistrarTipoIdentificacionUseCase(daoFactory);
			UseCase.execute(domain);
			
			
			
			
			

			daoFactory.confirmarTransaccion();
		}catch (final SpaExcepcion excepcion) {
			daoFactory.cancelarTransaccion();
			throw excepcion;
		}catch (final Exception excepcion) {
			daoFactory.cancelarTransaccion();
			
			var mensajeUsuario = "";
			var mensajeTecnico = "";
			throw SpaExcepcion.crear(excepcion, mensajeUsuario, mensajeTecnico);
		}finally {
			
			daoFactory.cerrarConexion();
		}{		
	} 		
}
		
	}
	
	
	
	

}