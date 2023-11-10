package co.edu.uco.spa.data.entity.support;

public class NumeroTelefonoCompletoClientesEntity {
	private int numeroTelefono;
	private boolean numeroConfirmado;
	
	
	
	private NumeroTelefonoCompletoClientesEntity(final int numeroTelefono, final boolean numeroConfirmado) {
		setNumeroTelefono(numeroTelefono);
		setNumeroConfirmado(numeroConfirmado);
	}
	
	public static final NumeroTelefonoCompletoClientesEntity crear(final int numeroTelefono, final boolean numeroConfirmado) {
		return new NumeroTelefonoCompletoClientesEntity(numeroTelefono, numeroConfirmado);
	}



	public final int getNumeroTelefono() {
		return numeroTelefono;
	}



	public final boolean isNumeroConfirmado() {
		return numeroConfirmado;
	}
	
	
	private final NumeroTelefonoCompletoClientesEntity setNumeroTelefono(final int numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
		return this;
	}



	private final NumeroTelefonoCompletoClientesEntity setNumeroConfirmado(final boolean numeroConfirmado) {
		this.numeroConfirmado = numeroConfirmado;
		return this;
	}

	
	
	


	
}