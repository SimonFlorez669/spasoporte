package co.edu.uco.spa.data.entity.support;

public class UbicacionSucursalEntity {
	private String direccion;
	private String pais;
	private String departamento;
	private String ubicacion;
	
	
	private UbicacionSucursalEntity(final String direccion,final String pais,final String departamento,final String ubicacion) {
		setDireccion(direccion);
		setPais(pais);
		setDepartamento(departamento);
		setUbicacion(ubicacion);
		
	}
	
	public static final UbicacionSucursalEntity crear (final String direccion,final String pais,final String departamento,final String ubicacion) {
		return new UbicacionSucursalEntity(direccion, pais, departamento, ubicacion);
	}


	private final void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	private final void setPais(String pais) {
		this.pais = pais;
	}


	private final void setDepartamento(String departamento) {
		this.departamento = departamento;
	}


	private final void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}


	public final String getDireccion() {
		return direccion;
	}


	public final String getPais() {
		return pais;
	}


	public final String getDepartamento() {
		return departamento;
	}


	public final String getUbicacion() {
		return ubicacion;
	}
	
	
	

	
	
}