package com.sporty.shoes.store.repository;

import org.springframework.data.repository.CrudRepository;

import com.sporty.shoes.store.domain.security.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {
	
	Role findByName(String name);

}
