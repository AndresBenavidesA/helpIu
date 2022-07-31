package com.iudigital.service;

import java.util.List;

import com.iudigital.model.Usuario;

public interface IUsuarioService {

	List<Usuario> findAll();
	
	Usuario findByid(Long id);
	
	Usuario save(Usuario usuario);
	
	Usuario findByUsername(String username);
}
