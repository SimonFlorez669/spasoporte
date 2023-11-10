package co.edu.uco.spa.data.entity;

import java.util.UUID;

public class TipoUsuarioEntity {
	
	private UUID id;
	private String tipo;
	private UsuariosEntity usuario;
	
	
	
	public TipoUsuarioEntity(final  UUID id, final String tipo,final UsuariosEntity usuario) {
		setId(id);
		setTipo(tipo);
		setUsuario(usuario);
		
	}
	
	public TipoUsuarioEntity crear(final UUID id,final String tipo,final UsuariosEntity usuario) {
		return new TipoUsuarioEntity(id, tipo, usuario);
	}
	



	public final UUID getId() {
		return id;
	}



	public final String getTipo() {
		return tipo;
	}



	public final UsuariosEntity getUsuario() {
		return usuario;
	}



	public final void setId(final UUID id) {
		this.id = id;
	}



	public final void setTipo(final String tipo) {
		this.tipo = tipo;
	}



	public final void setUsuario(final UsuariosEntity usuario) {
		this.usuario = usuario;
	}
	
	
	
	
	
	

}
