package co.edu.uco.spa.data.entity;

import java.util.UUID;

import co.edu.uco.spa.data.entity.support.InformacionBasicaServicioEntity;

public class ServicioEntity {
	private UUID id;
	private TipoServicioEntity tipoServicio;
	private RestriccionServicioEntity restriccionServicio;
	private InformacionBasicaServicioEntity informacionBasicaServicio;




	private ServicioEntity(final UUID id, final TipoServicioEntity tipoServicio, final InformacionBasicaServicioEntity informacionBasicaServicio,
		final RestriccionServicioEntity restriccionServicio) {
	
		setId(id);
		setTipoServicio(tipoServicio);
		setInformacionBasicaServicio(informacionBasicaServicio);
		setRestriccionServicio(restriccionServicio);
	
	}
	
	public static final ServicioEntity crear (final UUID id, final TipoServicioEntity tipoServicio, final InformacionBasicaServicioEntity informacionBasicaServicio,
		final RestriccionServicioEntity restriccionServicio) {
		return new ServicioEntity(id, tipoServicio, informacionBasicaServicio,  restriccionServicio);
	}




	private final void setId(UUID id) {
		this.id = id;
	}


	private final void setInformacionBasicaServicio(InformacionBasicaServicioEntity informacionBasicaServicio) {
		this.informacionBasicaServicio = informacionBasicaServicio;
	}

	private final void setTipoServicio(TipoServicioEntity tipoServicio) {
		this.tipoServicio = tipoServicio;
	}


	private final void setRestriccionServicio(RestriccionServicioEntity restriccionServicio) {
		this.restriccionServicio = restriccionServicio;
	}


	public final UUID getId() {
		return id;
	}

	public final TipoServicioEntity getTipoServicio() {
		return tipoServicio;
	}


	public final RestriccionServicioEntity getRestriccionServicio() {
		return restriccionServicio;
	}

	public final InformacionBasicaServicioEntity getInformacionBasicaServicio() {
		return informacionBasicaServicio;
	}


	
	
	

	
	
	
}
