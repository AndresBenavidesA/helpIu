package com.iudigital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iudigital.model.Role;

@Repository
public interface IRoleRepository 
		extends JpaRepository<Role, Long>{

}
