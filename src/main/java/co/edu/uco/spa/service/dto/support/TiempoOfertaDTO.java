package co.edu.uco.spa.service.dto.support;

import java.util.Date;

public class TiempoOfertaDTO {
	
	
	private Date desde;
	private Date hasta;
	
	
	
	public TiempoOfertaDTO(final Date desde,final Date hasta) {
		setDesde(desde);
		setHasta(hasta);
	}



	public final Date getDesde() {
		return desde;
	}



	public final Date getHasta() {
		return hasta;
	}



	public final void setDesde(final Date desde) {
		this.desde = desde;
	}



	public final void setHasta(final Date hasta) {
		this.hasta = hasta;
	}
	
	
	
	
	
	
	
	

}
