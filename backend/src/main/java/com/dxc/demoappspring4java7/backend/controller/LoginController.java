package com.dxc.demoappspring4java7.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.demoappspring4java7.backend.bo.ApplicationUserBO;
import com.dxc.demoappspring4java7.backend.bo.LoginRequest;
import com.dxc.demoappspring4java7.backend.service.LoginService;

@RestController
public class LoginController {
	
	@Autowired
	LoginService service;
	
	
	@PostMapping(path = "/login")
	public ApplicationUserBO login( @RequestBody LoginRequest loginRequest ) {
		return service.login(loginRequest.getUsername());
	}

}
