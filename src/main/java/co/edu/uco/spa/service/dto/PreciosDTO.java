package co.edu.uco.spa.service.dto;

import java.util.UUID;


public class PreciosDTO {
	
	
	private UUID Id;
	private int precios;
	
	
	
	public PreciosDTO( final UUID id,final int precios) {
		setId(id);
		setPrecios(precios);
		
	}
	
	
	
	public static final PreciosDTO crear(final UUID id, final int precios) {
		return new PreciosDTO(id, precios);
	}



	public final UUID getId() {
		return Id;
	}



	public final int getPrecios() {
		return precios;
	}



	public final void setId(final UUID id) {
		Id = id;
	}



	public final void setPrecios(final int precios) {
		this.precios = precios;
	}
	
	
	
	
	

}
