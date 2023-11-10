package co.edu.uco.spa.service.domain.clientes;

import java.util.UUID;


import co.edu.uco.spa.service.domain.direccion.DireccionDomain;
import co.edu.uco.spa.service.domain.support.correoelectronicocompletoclientesdomain.CorreoElectronicoCompletoClientesDomain;
import co.edu.uco.spa.service.domain.support.identificacioncompletaclientes.IdentificacionCompletaClientesDomain;
import co.edu.uco.spa.service.domain.support.informacionpersonalclientes.InformacionPersonalClientesDomain;
import co.edu.uco.spa.service.domain.support.numerotelefonocompletoclientes.NumeroTelefonoCompletoClientesDomain;
import co.edu.uco.spa.service.domain.tipousuario.TipoUsuarioDomain;


public class ClientesDomain {
	private UUID id;
	private TipoUsuarioDomain tipousuario;
	private CorreoElectronicoCompletoClientesDomain correoElectronico;
	private NumeroTelefonoCompletoClientesDomain numeroTelefonico;
	private IdentificacionCompletaClientesDomain identificacionCliente;
	private DireccionDomain direccion;
	private InformacionPersonalClientesDomain informacionPersonal;
	
	
	
	
	
	
	
	
	public ClientesDomain(final UUID id, final TipoUsuarioDomain tipousuario,
			final CorreoElectronicoCompletoClientesDomain correoElectronico,
			final NumeroTelefonoCompletoClientesDomain numeroTelefonico,
			final IdentificacionCompletaClientesDomain identificacionCliente,final  DireccionDomain direccion,
			final InformacionPersonalClientesDomain informacionPersonal) {
		
		setCorreoElectronico(correoElectronico);
		setDireccion(direccion);
		setId(id);
		setIdentificacionCliente(identificacionCliente);
		setInformacionPersonal(informacionPersonal);
		setNumeroTelefonico(numeroTelefonico);
		setTipousuario(tipousuario);
		
		
	}






	public static final ClientesDomain crear(final UUID id, final TipoUsuarioDomain tipousuario, final CorreoElectronicoCompletoClientesDomain correoelectronico, final NumeroTelefonoCompletoClientesDomain numeroTelefonico,IdentificacionCompletaClientesDomain identificacionCliente,final DireccionDomain direccion, final InformacionPersonalClientesDomain informacionPersonal) {
		return new ClientesDomain(id, tipousuario, correoelectronico, numeroTelefonico, identificacionCliente, direccion, informacionPersonal);
	}
	
	
	

	public final UUID getId() {
		return id;
	}
	
	public final TipoUsuarioDomain getTipousuario() {
		return tipousuario;
	}
	
	public final CorreoElectronicoCompletoClientesDomain getCorreoElectronico() {
		return correoElectronico;
	}
	
	public final NumeroTelefonoCompletoClientesDomain getNumeroTelefonico() {
		return numeroTelefonico;
	}
	
	public final IdentificacionCompletaClientesDomain getIdentificacionCliente() {
		return identificacionCliente;
	}
	
	public final DireccionDomain getDireccion() {
		return direccion;
	}
	
	public final InformacionPersonalClientesDomain getInformacionPersonal() {
		return informacionPersonal;
	}

	
	
	public final ClientesDomain setId(final UUID id) {
		this.id = id;
		return this;
	}

	
	public final ClientesDomain setTipousuario(final TipoUsuarioDomain tipousuario) {
		this.tipousuario = tipousuario;
		return this;
	}
	

	public final ClientesDomain setCorreoElectronico(final CorreoElectronicoCompletoClientesDomain correoElectronico) {
		this.correoElectronico = correoElectronico;
		return this;
	}
	
	

	public final ClientesDomain setNumeroTelefonico(final NumeroTelefonoCompletoClientesDomain numeroTelefonico) {
		this.numeroTelefonico = numeroTelefonico;
		return this;
	}
	

	public final ClientesDomain setIdentificacionCliente(final IdentificacionCompletaClientesDomain identificacionCliente) {
		this.identificacionCliente = identificacionCliente;
		return this;
	}
	

	public final ClientesDomain setDireccion(final DireccionDomain direccion) {
		this.direccion = direccion;
		return this;
	}

	public final ClientesDomain setInformacionPersonal(final InformacionPersonalClientesDomain informacionPersonal) {
		this.informacionPersonal = informacionPersonal;
		return this;
	}
	
	
	
	
	

}
