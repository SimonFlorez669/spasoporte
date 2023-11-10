package co.edu.uco.spa.service.domain.support.numerotelefonocompletoclientes;


public class NumeroTelefonoCompletoClientesDomain {
	
	private int numeroTelefono;
	private boolean numeroConfirmado;
	
	
	
	
	
	public NumeroTelefonoCompletoClientesDomain(final int numeroTelefono,final boolean numeroConfirmado) {
		setNumeroConfirmado(numeroConfirmado);
		setNumeroTelefono(numeroTelefono);
	}
	
	public static final NumeroTelefonoCompletoClientesDomain crear(final int numeroTelefono, final boolean numeroConfirmado) {
		return new NumeroTelefonoCompletoClientesDomain (numeroTelefono, numeroConfirmado);
	}
	
	
	
	public final int getNumeroTelefono() {
		return numeroTelefono;
	}
	public final boolean isNumeroConfirmado() {
		return numeroConfirmado;
	}
	
	
	
	
	public final NumeroTelefonoCompletoClientesDomain setNumeroTelefono(final int numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
		return this;
	}
	
	
	
	public final NumeroTelefonoCompletoClientesDomain setNumeroConfirmado(final boolean numeroConfirmado) {
		this.numeroConfirmado = numeroConfirmado;
		return this;
	}
	
	
	

}
