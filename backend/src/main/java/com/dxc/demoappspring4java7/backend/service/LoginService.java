package com.dxc.demoappspring4java7.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dxc.demoappspring4java7.backend.bo.ApplicationUserBO;
import com.dxc.demoappspring4java7.model.entity.ApplicationUser;
import com.dxc.demoappspring4java7.model.repository.ApplicationUserRepository;

@Component
public class LoginService {
	
	@Autowired
	ApplicationUserRepository userRepository;
	
	public ApplicationUserBO login( String username ) {
		ApplicationUserBO result = null;
		
		ApplicationUser applicationUser = userRepository.findByUsername(username);
		
		if (applicationUser != null) {
			result = new ApplicationUserBO();
			result.setIdUser(applicationUser.getIdUser());
			result.setUsername(applicationUser.getUsername());
			result.setToken("oiuyfghhjkljhtrfdcgvhj4567890");
		}
		
		return result;
	}

}
