package co.edu.uco.spa.service.dto;

import java.util.UUID;

import co.edu.uco.spa.data.entity.UsuariosEntity;

public class TipoUsuarioDTO {
	
	
	
	
	private UUID id;
	private String tipo;
	private UsuariosEntity usuario;
	
	
	
	public TipoUsuarioDTO(final UUID id, final String tipo, final UsuariosEntity usuario) {
	setId(id);
	setTipo(tipo);
	setUsuario(usuario);
	}
	
	
	
	
	public TipoUsuarioDTO crear(final UUID id,final String tipo,final UsuariosEntity usuario) {
		return new TipoUsuarioDTO(id, tipo, usuario);
	}



	public UUID getId() {
		return id;
	}



	public String getTipo() {
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



	public final  void setUsuario(final UsuariosEntity usuario) {
		this.usuario = usuario;
	}
	
	
	
	
	
	
	
	
	
	

}
