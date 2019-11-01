package com.dxc.demoappspring4java7.model.repository;

import org.springframework.data.repository.CrudRepository;

import com.dxc.demoappspring4java7.model.entity.ApplicationUser;

public interface ApplicationUserRepository extends CrudRepository<ApplicationUser, Long> {
	
	public ApplicationUser findByUsername( String username );

}
