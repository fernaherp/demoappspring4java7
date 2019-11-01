package com.dxc.demoappspring4java7.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "appuser")
public class ApplicationUser {
	
	@Id
	@Column(name = "iduser")
	private Long idUser;
	@Column(name = "username")
	private String username;

}
