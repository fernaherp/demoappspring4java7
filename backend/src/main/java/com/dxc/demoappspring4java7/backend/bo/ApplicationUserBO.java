package com.dxc.demoappspring4java7.backend.bo;

import lombok.Data;

@Data
public class ApplicationUserBO {
	
	private Long idUser;
	private String username;
	private String token;

}
