package com.iudigital.service.impl;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iudigital.Dto.DelitoDto;
import com.iudigital.model.Delito;
import com.iudigital.repository.IDelitoRepository;
import com.iudigital.service.IDelitoService;
import com.iudigital.util.Helper;

@Service
public class DelitoServiceImpl implements IDelitoService {

	@Autowired
	private IDelitoRepository delitoRepository;
	
	
	@Transactional(readOnly = true)
	@Override
	public List<DelitoDto> findAll() {
		List<Delito> delitos = delitoRepository.findAll();
		List<DelitoDto> delitosDto = 
				Helper.convertListDelitoDto(delitos);
		return delitosDto;
	}
	
	@Override
	public DelitoDto findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DelitoDto save(DelitoDto delitoDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	
}
