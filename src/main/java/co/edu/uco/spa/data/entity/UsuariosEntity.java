package co.edu.uco.spa.data.entity;

import java.util.UUID;

public class UsuariosEntity {

	
	
	private UUID id;
	private String tipoUsuario;
	
	
	
	
	public UsuariosEntity(final UUID id, final String tipoUsuario) {
		setId(id);
		setTipoUsuario(tipoUsuario);
	}

	
	public UsuariosEntity crear(final UUID id,final String usuario) {
		return new UsuariosEntity(id, usuario);
	}



	public UUID getId() {
		return id;
	}




	public String getTipoUsuario() {
		return tipoUsuario;
	}




	public final void setId(final UUID id) {
		this.id = id;
	}




	public final void setTipoUsuario(final String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
