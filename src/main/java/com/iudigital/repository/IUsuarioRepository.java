package com.iudigital.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.iudigital.model.Usuario;


@Repository
public interface IUsuarioRepository 
	extends CrudRepository<Usuario, Long> {

	Usuario findByUsername(String username);
}
