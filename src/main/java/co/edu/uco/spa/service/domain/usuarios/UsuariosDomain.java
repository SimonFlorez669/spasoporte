package co.edu.uco.spa.service.domain.usuarios;

import java.util.UUID;

import co.edu.uco.spa.service.domain.tipousuario.TipoUsuarioDomain;

public class UsuariosDomain {
	
	private UUID id;
	private TipoUsuarioDomain usuario;
	
	public UsuariosDomain(final UUID id, final TipoUsuarioDomain usuario) {
		setId(id);
		setUsuario(usuario);
	}

	public final UUID getId() {
		return id;
	}

	public final TipoUsuarioDomain getUsuario() {
		return usuario;
	}

	public final void setId(final UUID id) {
		this.id = id;
	}

	public final void setUsuario(final TipoUsuarioDomain usuario) {
		this.usuario = usuario;
	}
	
	
	
	
	

}
