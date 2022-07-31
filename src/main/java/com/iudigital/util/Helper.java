package com.iudigital.util;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.iudigital.Dto.CasoDto;
import com.iudigital.Dto.DelitoDto;
import com.iudigital.model.Caso;
import com.iudigital.model.Delito;

@Component
public interface Helper {

	public static DelitoDto convertDelitoToDelitoDto(Delito delito) {
		DelitoDto delitoDto = new DelitoDto();
		BeanUtils.copyProperties(delito, delitoDto);
		return delitoDto;
	}
	
	public static Delito convertDelitoDtoToDelito(DelitoDto delitoDto) {
		Delito delito = new Delito();
		BeanUtils.copyProperties(delitoDto, delito);
		return delito;
	}
	
	public static List<DelitoDto> convertListDelitoDto(
			List<Delito> delitos){
		return delitos
				.stream()
				.map(d -> {
					return convertDelitoToDelitoDto(d);
				})
				.collect(Collectors.toList());
	}
	
	public static CasoDto convertCasoToCasoDto(Caso caso) {
		CasoDto casoDto = new CasoDto();
		BeanUtils.copyProperties(caso, casoDto);
		return casoDto;
	}
	
	public static Caso convertCasoDtoToCaso(CasoDto casoDto) {
		Caso caso = new Caso();
		BeanUtils.copyProperties(casoDto, caso);
		return caso;
	}
	
	
	public static List<CasoDto> convertListCasoDto(
			List<Caso> casos){
		return casos
				.stream()
				.map(c -> {
					return convertCasoToCasoDto(c);
				})
				.collect(Collectors.toList());
	}
	
}
