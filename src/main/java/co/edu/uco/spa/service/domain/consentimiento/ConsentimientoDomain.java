package co.edu.uco.spa.service.domain.consentimiento;

import java.io.File;
import java.util.UUID;


public class ConsentimientoDomain {
	
	private UUID id;
	private int idConsentimiento;
	private File documento;
	
	
	
	
	
	
	
	public ConsentimientoDomain(final UUID id, final int idConsentimiento,final File documento) {
		setDocumento(documento);
		setId(id);
		setIdConsentimiento(idConsentimiento);
	}
	
	
	public static final ConsentimientoDomain crear(final UUID id, final int idConsentimiento, final File documento) {
		return new ConsentimientoDomain(id, idConsentimiento, documento);
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
	
	
	
	public final ConsentimientoDomain setId(final UUID id) {
		this.id = id;
		return this;
	}
	
	
	public final ConsentimientoDomain setIdConsentimiento(final int idConsentimiento) {
		this.idConsentimiento = idConsentimiento;
		return this;
	}
	
	
	public final ConsentimientoDomain setDocumento(final File documento) {
		this.documento = documento;
		return this;
	}
	
	
	
	

}
