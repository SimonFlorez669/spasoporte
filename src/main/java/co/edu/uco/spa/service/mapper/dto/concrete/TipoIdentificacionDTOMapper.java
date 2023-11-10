package co.edu.uco.spa.service.mapper.dto.concrete;

import co.edu.uco.spa.service.domain.tipoidentificacion.TipoIdentificacionDomain;
import co.edu.uco.spa.service.dto.TipoIdentificacionDTO;
import co.edu.uco.spa.service.mapper.dto.DTOMapper;

public class TipoIdentificacionDTOMapper implements DTOMapper<TipoIdentificacionDTO, TipoIdentificacionDomain> {

	
	private static final DTOMapper<TipoIdentificacionDTO, TipoIdentificacionDomain> instancia = new TipoIdentificacionDTOMapper();

	@Override
	public TipoIdentificacionDomain toDomain(TipoIdentificacionDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TipoIdentificacionDTO toDTO(TipoIdentificacionDomain domain) {
		// TODO Auto-generated method stub
		return null;
	}
	public static final TipoIdentificacionDomain convertToDomain(final TipoIdentificacionDTO dto) {
		return instancia.toDomain(dto);
	}
	public static final TipoIdentificacionDTO convertToDTO(final TipoIdentificacionDomain domain) {
		return instancia.toDTO(domain);
	}	

	
	
	
	
	
	
	
}
