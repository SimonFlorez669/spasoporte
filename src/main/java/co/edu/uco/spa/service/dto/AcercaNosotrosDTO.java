package co.edu.uco.spa.service.dto;

import java.util.UUID;

import co.edu.uco.spa.data.entity.AcercaDeNosotrosEntity;
import co.edu.uco.spa.data.entity.EquipoTrabajoEntity;


public class AcercaNosotrosDTO {

	private UUID id;
	private String mision;
	private String vision;
	private String ubicacion;
	private String redesSociales;
	private String certificado;
	private EquipoTrabajoDTO equipoTrabajo;
	
	
	
	public AcercaNosotrosDTO(final UUID id,final String mision,final String vision,final String ubicacion,final String redesSociales,
			final String certificado,final EquipoTrabajoDTO equipoTrabajo) {
		
		setCertificado(certificado);
		setEquipoTrabajo(equipoTrabajo);
		setId(id);
		setMision(mision);
		setRedesSociales(redesSociales);
		setUbicacion(ubicacion);
		setVision(vision);
		
		
	}
	
	
	
	
	
	public static final AcercaNosotrosDTO crear(final UUID id,final String mision,final String vision,final String ubicacion, final String redesSociales,
			final String certificado,final EquipoTrabajoDTO equipoTrabajo) {
		return new AcercaNosotrosDTO(id, mision, vision, ubicacion, redesSociales, certificado, equipoTrabajo);
	}



	public final UUID getId() {
		return id;
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



	public final EquipoTrabajoDTO getEquipoTrabajo() {
		return equipoTrabajo;
	}



	public final void setId(final UUID id) {
		this.id = id;
	}



	public final void setMision(final String mision) {
		this.mision = mision;
	}



	public final void setVision(final String vision) {
		this.vision = vision;
	}



	public final void setUbicacion(final String ubicacion) {
		this.ubicacion = ubicacion;
	}



	public final void setRedesSociales(final String redesSociales) {
		this.redesSociales = redesSociales;
	}



	public final void setCertificado(final String certificado) {
		this.certificado = certificado;
	}



	public final void setEquipoTrabajo(final EquipoTrabajoDTO equipoTrabajo) {
		this.equipoTrabajo = equipoTrabajo;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
