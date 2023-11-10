package co.edu.uco.spa.service.dto.support;

public class UbicacionSucursalDTO {
	
	private String direccion;
	private String pais;
	private String departamento;
	private String ubicacion;
	
	
	
	public UbicacionSucursalDTO(final String direccion,final String pais,final String departamento, final String ubicacion) {
		setDepartamento(departamento);
		setDireccion(direccion);
		setPais(pais);
		setUbicacion(ubicacion);
		
		
		
		
		
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



	public final void setDireccion(final String direccion) {
		this.direccion = direccion;
	}



	public final void setPais(final String pais) {
		this.pais = pais;
	}



	public final void setDepartamento(final String departamento) {
		this.departamento = departamento;
	}



	public final void setUbicacion(final String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	
	
	
	
	
	
	
	
	

}
