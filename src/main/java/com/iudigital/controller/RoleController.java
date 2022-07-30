package com.iudigital.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iudigital.model.Role;
import com.iudigital.service.IRoleService;

@RestController
@RequestMapping("/roles")
public class RoleController {

	private IRoleService roleService;
	
	@GetMapping
	public ResponseEntity<List<Role>> index(){
		List<Role> roles =roleService.getAll();
		return ResponseEntity.ok().body(roles);
		
	}
}
