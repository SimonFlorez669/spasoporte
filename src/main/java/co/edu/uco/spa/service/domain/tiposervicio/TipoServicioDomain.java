package co.edu.uco.spa.service.domain.tiposervicio;

import java.util.UUID;


public class TipoServicioDomain {
	
	private UUID id;
	private String tipoServicio;
	
	
	
	
	
	public TipoServicioDomain(final UUID id,final String tipoServicio) {
		setId(id);
		setTipoServicio(tipoServicio);
		
	}
	public static final TipoServicioDomain crear (final UUID id, final String tipoServicio) {
		return new TipoServicioDomain(id, tipoServicio);
	}
	
	
	
	public final UUID getId() {
		return id;
	}
	public final String getTipoServicio() {
		return tipoServicio;
	}
	
	
	public final TipoServicioDomain setId(final UUID id) {
		this.id = id;
		return this;
	
	}
	public final TipoServicioDomain setTipoServicio(final String tipoServicio) {
		this.tipoServicio = tipoServicio;
		return this;
	}
	
	
	
	

}
