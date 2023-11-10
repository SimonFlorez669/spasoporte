package co.edu.uco.spa.service.dto.support;


public class NumeroTelefonoCompletoClientesDTO {
	
	private int numeroTelefono;
	private boolean numeroConfirmado;
	
	
	
	public NumeroTelefonoCompletoClientesDTO(final int numeroTelefono,final  boolean numeroConfirmado) {
		
		
		setNumeroConfirmado(numeroConfirmado);
		setNumeroTelefono(numeroTelefono);
	}
	
	
	
	
	public static final NumeroTelefonoCompletoClientesDTO crear(final int numeroTelefono, final boolean numeroConfirmado) {
		return new NumeroTelefonoCompletoClientesDTO (numeroTelefono, numeroConfirmado);
	}



	public final int getNumeroTelefono() {
		return numeroTelefono;
	}



	public final boolean isNumeroConfirmado() {
		return numeroConfirmado;
	}



	public final void setNumeroTelefono(int numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}



	public final void setNumeroConfirmado(boolean numeroConfirmado) {
		this.numeroConfirmado = numeroConfirmado;
	}
	

	
	
	
	
	
}
