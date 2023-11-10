package co.edu.uco.spa.service.domain.oferta;

import java.util.UUID;

import co.edu.uco.spa.service.domain.bancoimagenes.BancoImagenesDomain;
import co.edu.uco.spa.service.domain.servicio.ServicioDomain;
import co.edu.uco.spa.service.domain.support.tiempooferta.TiempoOfertaDomain;



public class OfertaDomain {
	
	private UUID id;
	private ServicioDomain idServicio;
	private String descripcion;
	private TiempoOfertaDomain tiempoOferta;
	private int descuento;
	private BancoImagenesDomain bancoImagenes;
	private ServicioDomain servicio;
	
	
	
	
	
	
	
	
	
	public OfertaDomain(final UUID id,final ServicioDomain idServicio, final String descripcion, final TiempoOfertaDomain tiempoOferta,
			final int descuento,final  BancoImagenesDomain bancoImagenes, final ServicioDomain servicio) {
		setBancoImagenes(bancoImagenes);
		setDescripcion(descripcion);
		setDescuento(descuento);
		setId(id);
		setServicio(null);
		setTiempoOferta(null);
		setIdServicio(null);
	}
	
	
	
	
	
	
	public final UUID getId() {
		return id;
	}
	public final ServicioDomain getIdServicio() {
		return idServicio;
	}
	public final String getDescripcion() {
		return descripcion;
	}
	public final TiempoOfertaDomain getTiempoOferta() {
		return tiempoOferta;
	}
	public final int getDescuento() {
		return descuento;
	}
	public final BancoImagenesDomain getBancoImagenes() {
		return bancoImagenes;
	}
	public final ServicioDomain getServicio() {
		return servicio;
	}
	

	
	public final OfertaDomain setId(final UUID id) {
		this.id = id;
		return this;
		
	}
	
	
	
	
	public final OfertaDomain setIdServicio(final ServicioDomain idServicio) {
		this.idServicio = idServicio;
		return this;
	}
	
	
	public final OfertaDomain setDescripcion(final String descripcion) {
		this.descripcion = descripcion;
		return this;
	}
	public final OfertaDomain setTiempoOferta(TiempoOfertaDomain tiempoOferta) {
		this.tiempoOferta = tiempoOferta;
		return this;
	}
	public final  OfertaDomain setDescuento(final int descuento) {
		this.descuento = descuento;
		return this;
	}
	public final OfertaDomain setBancoImagenes(final BancoImagenesDomain bancoImagenes) {
		this.bancoImagenes = bancoImagenes;
		return this;
		
	}
	public final OfertaDomain setServicio(final ServicioDomain servicio) {
		this.servicio = servicio;
		return this;
	}
	
	
	
	
	
	
	
	

}
