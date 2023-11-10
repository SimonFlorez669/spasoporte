package co.edu.uco.spa.data.entity;


import java.util.UUID;

import co.edu.uco.spa.data.entity.support.TiempoOfertaOfertaEntity;

public class OfertaEntity {

	private UUID id;
	private ServicioEntity idServicio;
	private String descripcion;
	private TiempoOfertaOfertaEntity tiempoOferta;
	private int descuento;
	private BancoImagenesEntity bancoImagenes;
	private ServicioEntity servicio;
	
	
	private OfertaEntity(final UUID id, final ServicioEntity idServicio, final String descripcion, final TiempoOfertaOfertaEntity tiempoOferta, final int descuento,
			final BancoImagenesEntity bancoImagenes, final ServicioEntity servicio) {
		setId(id);
		setIdServicio(idServicio);
		setDescripcion(descripcion);
		setTiempoOferta(tiempoOferta);
		setDescuento(descuento);
		setBancoImagenes(bancoImagenes);
		setServicio(servicio);
		
	}
	
	public static final OfertaEntity crear(final UUID id, final ServicioEntity idServicio, final String descripcion, final TiempoOfertaOfertaEntity tiempoOferta, final int descuento,
			final BancoImagenesEntity bancoImagenes, final ServicioEntity servicio) {
		return new OfertaEntity(id, idServicio, descripcion, tiempoOferta, descuento, bancoImagenes, servicio);
	}


	private final void setId(UUID id) {
		this.id = id;
	}


	private final void setIdServicio(ServicioEntity idServicio) {
		this.idServicio = idServicio;
	}


	private final void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}




	private final void setTiempoOferta(TiempoOfertaOfertaEntity tiempoOferta) {
		this.tiempoOferta = tiempoOferta;
	}

	private final void setDescuento(int descuento) {
		this.descuento = descuento;
	}


	private final void setBancoImagenes(BancoImagenesEntity bancoImagenes) {
		this.bancoImagenes = bancoImagenes;
	}


	private final void setServicio(final ServicioEntity servicio) {
		this.servicio = servicio;
	}


	public final UUID getId() {
		return id;
	}


	public final ServicioEntity getIdServicio() {
		return idServicio;
	}


	public final String getDescripcion() {
		return descripcion;
	}


	public final TiempoOfertaOfertaEntity getTiempoOferta() {
		return tiempoOferta;
	}

	public final int getDescuento() {
		return descuento;
	}


	public final BancoImagenesEntity getBancoImagenes() {
		return bancoImagenes;
	}


	public final ServicioEntity getServicio() {
		return servicio;
	}
	
	
	
	
	
	
	
	
}
