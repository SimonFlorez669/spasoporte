package co.edu.uco.spa.service.domain.tipousuario;

import java.util.UUID;

public class TipoUsuarioDomain {
	
	private UUID id;
	private String tipoUsuario;
	
	
	
	public TipoUsuarioDomain(final UUID id,final String tipoUsuario) {
		setId(id);
		setTipoUsuario(tipoUsuario);
	}



	public final UUID getId() {
		return id;
	}



	public final String getTipoUsuario() {
		return tipoUsuario;
	}



	public final void setId(final UUID id) {
		this.id = id;
	}



	public final void setTipoUsuario(final String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	
	
	
	
	
	
	
	

}
