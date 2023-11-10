package co.edu.uco.spa.service.domain.acercanosotros;

import java.util.UUID;

import co.edu.uco.spa.service.domain.equipotrabajo.EquipoTrabajoDomain;





public class AcercaNosotrosDomain {
	
	
	
	private UUID id;
	private String mision;
	private String vision;
	private String ubicacion;
	private String redesSociales;
	private String certificado;
	private EquipoTrabajoDomain equipoTrabajo;
	
	
	
	
	
	
	
	public AcercaNosotrosDomain(final UUID id,final String mision,final String vision,final String ubicacion,final String redesSociales,
		final	String certificado, final EquipoTrabajoDomain equipoTrabajo ) {
		
		setCertificado(certificado);
		setEquipoTrabajo(null);
		setId(id);
		setMision(mision);
		setRedesSociales(redesSociales);
		setUbicacion(ubicacion);
		setVision(vision);
	}
	
	
	
	public static final AcercaNosotrosDomain crear(final UUID id,final String mision,final String vision,final String ubicacion, final String redesSociales,
			final String certificado,final EquipoTrabajoDomain equipoTrabajo) {
		return new AcercaNosotrosDomain(id, mision, vision, ubicacion, redesSociales, certificado, equipoTrabajo);
	}


	
	
	
	public final UUID getId() {
		return id;
	}



	public final EquipoTrabajoDomain getEquipoTrabajo() {
		return equipoTrabajo;
	}



	public final String getMision() {
		return mision;
	}
	public final String getVision() {
		return vision;
	}
	public final String getUbicacion() {
		return ubicacion;
	}
	public final String getRedesSociales() {
		return redesSociales;
	}
	public final String getCertificado() {
		return certificado;
	}
	
	
	
	
	public final AcercaNosotrosDomain setId(final UUID id) {
		this.id = id;
		return this;
	}
	
	
	public final AcercaNosotrosDomain setMision(final String mision) {
		this.mision = mision;
		return this;
	}
	public final AcercaNosotrosDomain setVision(final String vision) {
		this.vision = vision;
		return this;
		
	}
	public final AcercaNosotrosDomain setUbicacion(final String ubicacion) {
		this.ubicacion = ubicacion;
		return this;
	}
	
	
	public final  AcercaNosotrosDomain setRedesSociales(final String redesSociales) {
		this.redesSociales = redesSociales;
		return this;
	}
	public final AcercaNosotrosDomain setCertificado(final String certificado) {
		this.certificado = certificado;
		return this;
	}



	public final AcercaNosotrosDomain setEquipoTrabajo(final EquipoTrabajoDomain equipoTrabajo) {
		this.equipoTrabajo = equipoTrabajo;
		return this;
	}
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	

	

}
