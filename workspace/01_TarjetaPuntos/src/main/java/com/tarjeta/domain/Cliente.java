package com.tarjeta.domain;

public class Cliente extends Usuario{
	
	private int idCliente; //PK
	private int idUsuario; //FK
	private long puntos;
	private String apellidos;
	
	
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public long getPuntos() {
		return puntos;
	}
	public void setPuntos(long puntos) {
		this.puntos = puntos;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	

}
