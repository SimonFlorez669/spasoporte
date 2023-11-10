package co.edu.uco.spa.service.domain.precios;

import java.util.UUID;


public class PreciosDomain {
	private UUID Id;
	private int precios;
	
	
	
	
	public PreciosDomain(final UUID id,final  int precios) {
		setId(id);
		setPrecios(precios);
	}
	
	
	public static final PreciosDomain crear(final UUID id, final int precios) {
		return new PreciosDomain(id, precios);
	}
	
	
	
	public final UUID getId() {
		return Id;
	}
	public final int getPrecios() {
		return precios;
	}

	
	
	public final PreciosDomain setId(final UUID id) {
		Id = id;
		return this;
	}
	public final PreciosDomain setPrecios(final int precios) {
		this.precios = precios;
		return this;
	}
	
	
	

}
