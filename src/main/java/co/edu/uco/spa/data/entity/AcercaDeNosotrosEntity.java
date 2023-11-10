package co.edu.uco.spa.data.entity;

import java.util.UUID;

public class AcercaDeNosotrosEntity {
	private UUID id;
	private String mision;
	private String vision;
	private String ubicacion;
	private String redesSociales;
	private String certificado;
	private EquipoTrabajoEntity equipoTrabajo;

	private AcercaDeNosotrosEntity( final UUID id,final String mision,final String vision,final String ubicacion, final String redesSociales,
			final String certificado,final EquipoTrabajoEntity equipoTrabajo) {
		setId(id);
		setMision(mision);
		setVision(vision);
		setUbicacion(ubicacion);
		setRedesSociales(redesSociales);
		setCertificado(certificado);
		setEquipoTrabajo(equipoTrabajo);
		
	}
	
	
	public static final AcercaDeNosotrosEntity crear(final UUID id,final String mision,final String vision,final String ubicacion, final String redesSociales,
			final String certificado,final EquipoTrabajoEntity equipoTrabajo) {
		return new AcercaDeNosotrosEntity(id, mision, vision, ubicacion, redesSociales, certificado, equipoTrabajo);
	}

	private final void setId(UUID id) {
		this.id = id;
	}

	private final void setMision(String mision) {
		this.mision = mision;
	}

	private final void setVision(String vision) {
		this.vision = vision;
	}

	private final void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	private final void setRedesSociales(String redesSociales) {
		this.redesSociales = redesSociales;
	}

	private final void setCertificado(String certificado) {
		this.certificado = certificado;
	}

	private final void setEquipoTrabajo(EquipoTrabajoEntity equipoTrabajo) {
		this.equipoTrabajo = equipoTrabajo;
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

	public final EquipoTrabajoEntity getEquipoTrabajo() {
		return equipoTrabajo;
	}
	
	
	
	
	
	

}
