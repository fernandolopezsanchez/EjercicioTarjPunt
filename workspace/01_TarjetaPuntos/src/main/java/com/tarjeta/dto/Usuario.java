package com.tarjeta.dto;

public class Usuario {
	
	private String login;
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
