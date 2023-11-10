package co.edu.uco.spa.data.entity;

import java.io.File;
import java.util.UUID;

public class ConsentimientoEntity {
	
	private UUID id;
	private int idConsentimiento;
	private File documento;
	
	
	
	
	private ConsentimientoEntity(final UUID id, final int idConsentimiento, final File documento) {
		
		setId(id);
		setIdConsentimiento(idConsentimiento);
		setDocumento(documento);
	}
	
	public static final ConsentimientoEntity crear(final UUID id, final int idConsentimiento, final File documento) {
		return new ConsentimientoEntity(id, idConsentimiento, documento);
	}




	private final void setId(UUID id) {
		this.id = id;
	}




	private final void setIdConsentimiento(int idConsentimiento) {
		this.idConsentimiento = idConsentimiento;
	}




	private final void setDocumento(File documento) {
		this.documento = documento;
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
	
	
	

	
	
}
