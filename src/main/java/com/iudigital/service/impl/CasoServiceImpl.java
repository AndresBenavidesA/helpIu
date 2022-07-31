package com.iudigital.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iudigital.Dto.CasoDto;
import com.iudigital.exception.ErrorDto;
import com.iudigital.exception.NotFoundException;
import com.iudigital.exception.RestException;
import com.iudigital.model.Caso;
import com.iudigital.repository.ICasoRepository;
import com.iudigital.service.ICasoService;
import com.iudigital.util.ConstUtil;
import com.iudigital.util.Helper;

@Service
@Transactional
public class CasoServiceImpl implements ICasoService{

	@Autowired
	private ICasoRepository casoRepository;

	@Override
	public List<CasoDto> findAll() throws RestException {
		List<Caso> casos = casoRepository.findAll();
		return Helper.convertListCasoDto(casos);
	}

	@Override
	public CasoDto save(CasoDto casoDto) throws RestException {
		Caso caso = Helper.convertCasoDtoToCaso(casoDto);
		caso = casoRepository.save(caso);
		return Helper.convertCasoToCasoDto(caso);
	}

	@Override
	public Boolean visible(Boolean visible, Long id) {
		return casoRepository.setVisible(visible, id);
	}

	@Override
	public CasoDto findById(Long id) throws RestException {
		Optional<Caso> casoOpt = casoRepository.findById(id);
		if(!casoOpt.isPresent()) {
			throw new NotFoundException(
				ErrorDto.getErrorDto(
						HttpStatus.NOT_FOUND.getReasonPhrase(), 
						ConstUtil.MESSAGE_NOT_FOUND, 
						HttpStatus.NOT_FOUND.value())
			);
		}
		return Helper.convertCasoToCasoDto(casoOpt.get());
	}

}