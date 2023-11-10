package co.edu.uco.spa.service.domain.support.tiempooferta;

import java.util.Date;


public class TiempoOfertaDomain {
	
	private Date desde;
	private Date hasta;
	
	
	public TiempoOfertaDomain(final Date desde,final Date hasta) {
		setDesde(desde);
		setHasta(hasta);
	}
	
	
	
	public static final TiempoOfertaDomain crear(final Date desde,final Date hasta) {
		return new TiempoOfertaDomain(desde, hasta);
	}
	
	
	
	
	public final Date getDesde() {
		return desde;
	}
	public final Date getHasta() {
		return hasta;
	}
	
	
	
	
	public final TiempoOfertaDomain setDesde(final Date desde) {
		this.desde = desde;
		return this;
	}
	
	
	
	public final TiempoOfertaDomain setHasta( final Date hasta) {
		this.hasta = hasta;
		return this;
	}
	
	
	
	
	

}
