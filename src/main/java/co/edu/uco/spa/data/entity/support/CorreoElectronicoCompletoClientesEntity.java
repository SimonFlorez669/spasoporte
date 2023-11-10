package co.edu.uco.spa.data.entity.support;

public  class CorreoElectronicoCompletoClientesEntity {
	private String correoElectronico;
	private boolean correoElectronicoConfirmado;
	
	
	
	private CorreoElectronicoCompletoClientesEntity(final String correoElectronico, final boolean correoElectronicoConfirmado) {

		setCorreoElectronico(correoElectronico);
		setCorreoElectronicoConfirmado(correoElectronicoConfirmado);
		
	}
	
	public static final CorreoElectronicoCompletoClientesEntity crear(final String correoElectronico, final boolean correoElectronicoConfirmado) {
		return new CorreoElectronicoCompletoClientesEntity(correoElectronico, correoElectronicoConfirmado);
	}



	private final void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}



	private final void setCorreoElectronicoConfirmado(boolean correoElectronicoConfirmado) {
		this.correoElectronicoConfirmado = correoElectronicoConfirmado;
	}



	public final String getCorreoElectronico() {
		return correoElectronico;
	}



	public final boolean isCorreoElectronicoConfirmado() {
		return correoElectronicoConfirmado;
	}
	
	
	

	
	
}