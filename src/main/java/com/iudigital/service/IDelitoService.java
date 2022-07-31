package com.iudigital.service;

import java.util.List;

import com.iudigital.Dto.DelitoDto;

public interface IDelitoService {

	List<DelitoDto> findAll();
	
	DelitoDto findById(Long id);
	
	DelitoDto save(DelitoDto delitoDto);
	
	void delete(Long id);
}
