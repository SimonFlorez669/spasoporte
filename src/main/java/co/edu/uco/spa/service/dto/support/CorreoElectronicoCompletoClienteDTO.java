package co.edu.uco.spa.service.dto.support;

import co.edu.uco.spa.service.domain.support.CorreoElectronicoCompletoClientesDomain;

public class CorreoElectronicoCompletoClienteDTO {
	
	
	private String correoElectronico;
	private boolean correoElectronicoConfirmado;
	
	
	
	

	public CorreoElectronicoCompletoClienteDTO(final String correoElectronico,final boolean correoElectronicoConfirmado) {
	setCorreoElectronico(correoElectronico);
	setCorreoElectronicoConfirmado(correoElectronicoConfirmado);
		
		
	}



	public final String getCorreoElectronico() {
		return correoElectronico;
	}



	public final boolean isCorreoElectronicoConfirmado() {
		return correoElectronicoConfirmado;
	}



	public final CorreoElectronicoCompletoClienteDTO setCorreoElectronico(final String correoElectronico) {
		this.correoElectronico = correoElectronico;
		return this;
	}



	public final  CorreoElectronicoCompletoClienteDTO setCorreoElectronicoConfirmado(final boolean correoElectronicoConfirmado) {
		this.correoElectronicoConfirmado = correoElectronicoConfirmado;
		return this;
	}
	
	
	
	

}
