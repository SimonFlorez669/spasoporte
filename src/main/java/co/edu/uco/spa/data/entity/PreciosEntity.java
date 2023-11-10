package co.edu.uco.spa.data.entity;

import java.util.UUID;

public class PreciosEntity {

	private UUID Id;
	private int precios;
	
	private PreciosEntity(final UUID id, final int precios) {
		
		setId(id);
		setPrecios(precios);
	}

	public static final PreciosEntity crear(final UUID id, final int precios) {
		return new PreciosEntity(id, precios);
	}
	
	
	
	private final void setId(UUID id) {
		this.Id = id;
	}

	private final void setPrecios(int precios) {
		this.precios = precios;
	}

	public final UUID getId() {
		return Id;
	}

	public final int getPrecios() {
		return precios;
	}
	
	
	
	
	
	
	
	
	
	
	
}
