package com.iudigital.service;

import java.util.List;

import com.iudigital.Dto.CasoDto;
import com.iudigital.exception.RestException;

public interface ICasoService {

	// consulta todos los casos
		List<CasoDto> findAll() throws RestException ;
		
		// crear un caso
		CasoDto save(CasoDto caso) throws RestException ;
		
		// inactivar el caso
		Boolean visible(Boolean visible, Long id);
		
		// consultar caso por Id
		CasoDto findById(Long id) throws RestException ;
}
