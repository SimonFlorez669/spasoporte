package co.edu.uco.spa.service.domain.support.correoelectronicocompletoclientesdomain;


public class CorreoElectronicoCompletoClientesDomain {
	
	private String correoElectronico;
	private boolean correoElectronicoConfirmado;
	
	
	
	
	
	public CorreoElectronicoCompletoClientesDomain(final String correoElectronico,final  boolean correoElectronicoConfirmado) {
		setCorreoElectronico(correoElectronico);
		setCorreoElectronicoConfirmado(correoElectronicoConfirmado);
	}
	
	
	
	
	public static final CorreoElectronicoCompletoClientesDomain crear(final String correoElectronico, final boolean correoElectronicoConfirmado) {
		return new CorreoElectronicoCompletoClientesDomain(correoElectronico, correoElectronicoConfirmado);
	}
	
	
	
	public final String getCorreoElectronico() {
		return correoElectronico;
	}
	public final boolean isCorreoElectronicoConfirmado() {
		return correoElectronicoConfirmado;
	}
	
	
	
	public final CorreoElectronicoCompletoClientesDomain setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
		return this;
	}
	public final CorreoElectronicoCompletoClientesDomain setCorreoElectronicoConfirmado(boolean correoElectronicoConfirmado) {
		this.correoElectronicoConfirmado = correoElectronicoConfirmado;
		return this;
	}
	
	
	
	

}
