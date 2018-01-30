package com.tarjeta.dto;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;


public class Usuario {
	
	
	@NotEmpty//(message="{notempty.login.nombre}")	
	private String login;
	@Length(min=8)
	private String password;
	
	
	public Usuario(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}
	
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	


}
