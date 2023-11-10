package co.edu.uco.spa.data.entity.support;

import java.util.Date;

public class TiempoOfertaOfertaEntity {
	private Date desde;
	private Date hasta;
	
	
	
	private TiempoOfertaOfertaEntity(final Date desde,final Date hasta) {
		setDesde(desde);
		setHasta(hasta);
	}
	
	public static final TiempoOfertaOfertaEntity crear(final Date desde,final Date hasta) {
		return new TiempoOfertaOfertaEntity(desde, hasta);
	}



	private final void setDesde(Date desde) {
		this.desde = desde;
	}



	private final void setHasta(Date hasta) {
		this.hasta = hasta;
	}



	public final Date getDesde() {
		return desde;
	}



	public final Date getHasta() {
		return hasta;
	}

	
	
	
	
}