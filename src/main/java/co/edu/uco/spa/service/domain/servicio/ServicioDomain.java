package co.edu.uco.spa.service.domain.servicio;

import java.util.UUID;

import co.edu.uco.spa.service.domain.restriccionservicio.RestriccionServicioDomain;
import co.edu.uco.spa.service.domain.support.informacionbasicaservicio.InformacionBasicaServicioDomain;
import co.edu.uco.spa.service.domain.tiposervicio.TipoServicioDomain;



public class ServicioDomain {
	
	private UUID id;
	private TipoServicioDomain tipoServicio;
	private RestriccionServicioDomain restriccionServicio;
	private InformacionBasicaServicioDomain informacionBasicaServicio;
	
	
	
	
	
	
	
	public ServicioDomain(final UUID id, final TipoServicioDomain tipoServicio, final RestriccionServicioDomain restriccionServicio,
			final InformacionBasicaServicioDomain informacionBasicaServicio) {
		setId(id);
		setInformacionBasicaServicio(informacionBasicaServicio);
		setRestriccionServicio(restriccionServicio);
		setTipoServicio(null);
	}
	
	
	
	public static final ServicioDomain crear (final UUID id, final TipoServicioDomain tipoServicio, final InformacionBasicaServicioDomain informacionBasicaServicio,
			final RestriccionServicioDomain restriccionServicio) {
			return new ServicioDomain(id, tipoServicio, restriccionServicio,  informacionBasicaServicio);
		}
	
	
	
	
	public final UUID getId() {
		return id;
	}
	public final TipoServicioDomain getTipoServicio() {
		return tipoServicio;
	}
	public final RestriccionServicioDomain getRestriccionServicio() {
		return restriccionServicio;
	}
	public final InformacionBasicaServicioDomain getInformacionBasicaServicio() {
		return informacionBasicaServicio;
	}
	
	
	
	
	public final ServicioDomain setId(final UUID id) {
		this.id = id;
		return this;
	}
	public final ServicioDomain setTipoServicio(final TipoServicioDomain tipoServicio) {
		this.tipoServicio = tipoServicio;
		return this;
	}
	public final ServicioDomain setRestriccionServicio(final RestriccionServicioDomain restriccionServicio) {
		this.restriccionServicio = restriccionServicio;
		return this;
	}
	public final ServicioDomain setInformacionBasicaServicio(final InformacionBasicaServicioDomain informacionBasicaServicio) {
		this.informacionBasicaServicio = informacionBasicaServicio;
		return this;
	}
	
	
	
	
	
	


}
