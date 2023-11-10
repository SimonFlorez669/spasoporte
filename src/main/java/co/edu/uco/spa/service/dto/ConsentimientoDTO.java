package co.edu.uco.spa.service.dto;

import java.io.File;
import java.util.UUID;


public class ConsentimientoDTO {
	
	
	private UUID id;
	private int idConsentimiento;
	private File documento;
	
	
	
	public ConsentimientoDTO(final UUID id,final int idConsentimiento,final File documento) {
		setDocumento(documento);
		setId(id);
		setIdConsentimiento(idConsentimiento);
	}

	public static final ConsentimientoDTO crear(final UUID id, final int idConsentimiento, final File documento) {
		return new ConsentimientoDTO(id, idConsentimiento, documento);
	}


	public final UUID getId() {
		return id;
	}



	public final int getIdConsentimiento() {
		return idConsentimiento;
	}



	public final File getDocumento() {
		return documento;
	}



	public final void setId(final UUID id) {
		this.id = id;
	}



	public final void setIdConsentimiento(final int idConsentimiento) {
		this.idConsentimiento = idConsentimiento;
	}



	public final void setDocumento(final File documento) {
		this.documento = documento;
	}
	
	
	
	
	
	

	
	
	
	
}
