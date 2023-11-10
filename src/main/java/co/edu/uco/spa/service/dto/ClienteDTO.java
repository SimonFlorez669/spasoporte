package co.edu.uco.spa.service.dto;

import java.util.UUID;

import co.edu.uco.spa.service.domain.support.CorreoElectronicoCompletoClientesDomain;
import co.edu.uco.spa.service.domain.support.InformacionPersonalClientesDomain;
import co.edu.uco.spa.service.domain.support.NumeroTelefonoCompletoClientesDomain;
import co.edu.uco.spa.service.dto.support.CorreoElectronicoCompletoClienteDTO;
import co.edu.uco.spa.service.dto.support.IdentificacionCompletaClientesDTO;
import co.edu.uco.spa.service.dto.support.InformacionPersonalClientesDTO;
import co.edu.uco.spa.service.dto.support.NumeroTelefonoCompletoClientesDTO;




public class ClienteDTO {
	
	

	
	private UUID id;
	
	private TipoUsuarioDTO tipousuario;
	
	private CorreoElectronicoCompletoClienteDTO correoElectronico;
	
	private NumeroTelefonoCompletoClientesDTO numeroTelefonico;
	private IdentificacionCompletaClientesDTO identificacionCliente;
	private DireccionDTO direccion;
	private InformacionPersonalClientesDomain informacionPersonal;
	
	
	
	
	public ClienteDTO(final UUID id, final TipoUsuarioDTO tipousuario,final  CorreoElectronicoCompletoClienteDTO correoElectronico,
			final NumeroTelefonoCompletoClientesDTO numeroTelefonico,
			final IdentificacionCompletaClientesDTO identificacionCliente,final  DireccionDTO direccion,
			final InformacionPersonalClientesDTO informacionPersonal) {
		
		
		
		setCorreoElectronico(correoElectronico);
		setDireccion(direccion);
		setId(id);
		setInformacionPersonal(getInformacionPersonal());
		setIdentificacionCliente(identificacionCliente);
		setNumeroTelefonico(numeroTelefonico);
		setTipousuario(tipousuario);
	}




	public final UUID getId() {
		return id;
	}




	public final TipoUsuarioDTO getTipousuario() {
		return tipousuario;
	}




	public final CorreoElectronicoCompletoClienteDTO getCorreoElectronico() {
		return correoElectronico;
	}




	public final NumeroTelefonoCompletoClientesDTO getNumeroTelefonico() {
		return numeroTelefonico;
	}




	public final IdentificacionCompletaClientesDTO getIdentificacionCliente() {
		return identificacionCliente;
	}




	public final DireccionDTO getDireccion() {
		return direccion;
	}




	public final InformacionPersonalClientesDomain getInformacionPersonal() {
		return informacionPersonal;
	}




	public final void setId(final UUID id) {
		this.id = id;
	}




	public final void setTipousuario(final TipoUsuarioDTO tipousuario) {
		this.tipousuario = tipousuario;
	}




	public final void setCorreoElectronico(final CorreoElectronicoCompletoClienteDTO correoElectronico) {
		this.correoElectronico = correoElectronico;
	}




	public final void setNumeroTelefonico(final NumeroTelefonoCompletoClientesDTO numeroTelefonico) {
		this.numeroTelefonico = numeroTelefonico;
	}




	public final void setIdentificacionCliente(final IdentificacionCompletaClientesDTO identificacionCliente) {
		this.identificacionCliente = identificacionCliente;
	}




	public final void setDireccion(final DireccionDTO direccion) {
		this.direccion = direccion;
	}




	public final void setInformacionPersonal(final InformacionPersonalClientesDomain informacionPersonal) {
		this.informacionPersonal = informacionPersonal;
	}




		
	
		
		
	

	
	
	
	
	

}
