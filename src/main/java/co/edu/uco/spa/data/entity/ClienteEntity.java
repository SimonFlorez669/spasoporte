package co.edu.uco.spa.data.entity;

import java.util.Date;
import java.util.UUID;

import co.edu.uco.spa.data.entity.support.CorreoElectronicoCompletoClientesEntity;
import co.edu.uco.spa.data.entity.support.IdentificacionCompletaClientesEntity;
import co.edu.uco.spa.data.entity.support.InformacionPersonalClientesEntity;
import co.edu.uco.spa.data.entity.support.NumeroTelefonoCompletoClientesEntity;

@SuppressWarnings("unused")
public class ClienteEntity {
	
	
	private UUID id;
	private TipoUsuarioEntity tipousuario;
	private CorreoElectronicoCompletoClientesEntity correoElectronico;
	private NumeroTelefonoCompletoClientesEntity numeroTelefonico;
	private IdentificacionCompletaClientesEntity identificacionCliente;
	
	private DireccionEntity direccion;
	private InformacionPersonalClientesEntity informacionPersonal;


	private ClienteEntity(final UUID id, final TipoUsuarioEntity tipousuario, final CorreoElectronicoCompletoClientesEntity correoElectronico,
			final DireccionEntity direccion, final NumeroTelefonoCompletoClientesEntity numeroTelefonico,
			final IdentificacionCompletaClientesEntity identificacionCliente, final InformacionPersonalClientesEntity informacionPersonal) {
		
		setId(id);
		setTipousuario(tipousuario);
		setCorreoElectronico(correoElectronico);
		setDireccion(direccion);
		setNumeroTelefonico(numeroTelefonico);
		setIdentificacionCliente(identificacionCliente);
		setInformacionPersonal(informacionPersonal);
	
		
	}

	public static final ClienteEntity crear(final UUID id, final TipoUsuarioEntity tipousuario, final CorreoElectronicoCompletoClientesEntity correoElectronico,
			final DireccionEntity direccion, final NumeroTelefonoCompletoClientesEntity numeroTelefonico,
			final IdentificacionCompletaClientesEntity identificacionCliente, final InformacionPersonalClientesEntity informacionPersonal) {
		return new ClienteEntity(id, tipousuario, correoElectronico, direccion, numeroTelefonico, identificacionCliente, informacionPersonal);
	}

	private final void setId(UUID id) {
		this.id = id;
	}


	private final void setTipousuario(TipoUsuarioEntity tipousuario) {
		this.tipousuario = tipousuario;
	}


	private final void setCorreoElectronico(CorreoElectronicoCompletoClientesEntity correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	private final void setDireccion(DireccionEntity direccion) {
		this.direccion = direccion;
	}


	private final void setNumeroTelefonico(NumeroTelefonoCompletoClientesEntity numeroTelefonico) {
		this.numeroTelefonico = numeroTelefonico;
	}


	private final void setIdentificacionCliente(IdentificacionCompletaClientesEntity identificacionCliente) {
		this.identificacionCliente = identificacionCliente;
	}



	private final void setInformacionPersonal(InformacionPersonalClientesEntity informacionPersonal) {
		this.informacionPersonal = informacionPersonal;
	}

	public final UUID getId() {
		return id;
	}


	public final TipoUsuarioEntity getTipousuario() {
		return tipousuario;
	}


	public final CorreoElectronicoCompletoClientesEntity getCorreoElectronico() {
		return correoElectronico;
	}

	public final DireccionEntity getDireccion() {
		return direccion;
	}


	public final NumeroTelefonoCompletoClientesEntity getNumeroTelefonico() {
		return numeroTelefonico;
	}



	public final IdentificacionCompletaClientesEntity getIdentificacionCliente() {
		return identificacionCliente;
	}

	public final InformacionPersonalClientesEntity getInformacionPersonal() {
		return informacionPersonal;
	}
	
	


	
	
	
	

	
	

	
}


