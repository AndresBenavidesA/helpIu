package com.iudigital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iudigital.model.Delito;

public interface IDelitoRepository 
		extends JpaRepository<Delito, Long> {

}
