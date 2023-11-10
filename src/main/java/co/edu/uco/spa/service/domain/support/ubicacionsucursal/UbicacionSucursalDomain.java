package co.edu.uco.spa.service.domain.support.ubicacionsucursal;


public class UbicacionSucursalDomain {
	
	private String direccion;
	private String pais;
	private String departamento;
	private String ubicacion;
	
	
	
	
	
	
	
	
	public UbicacionSucursalDomain(final String direccion,final  String pais,final String departamento,final String ubicacion) {
		
		
		setDepartamento(departamento);
		setDireccion(direccion);
		setPais(pais);
		setUbicacion(ubicacion);
		
	}




	public static final UbicacionSucursalDomain crear (final String direccion,final String pais,final String departamento,final String ubicacion) {
		return new UbicacionSucursalDomain(direccion, pais, departamento, ubicacion);
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


	
	


	public final UbicacionSucursalDomain setDireccion(final String direccion) {
		this.direccion = direccion;
		return this;
	}




	public final UbicacionSucursalDomain setPais(final String pais) {
		this.pais = pais;
		return this;
	}




	public final UbicacionSucursalDomain setDepartamento(final String departamento) {
		this.departamento = departamento;
		return this;
	}




	public final UbicacionSucursalDomain setUbicacion(final String ubicacion) {
		this.ubicacion = ubicacion;
		return this;
	}
	
	
	
	

}
