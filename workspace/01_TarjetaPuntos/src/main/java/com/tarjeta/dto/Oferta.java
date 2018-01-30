package com.tarjeta.dto;

public class Oferta {
	
	private String fechaIni;
	private String fechaFin;
	private String coste;
	

	public Oferta(String fechaIni, String fechaFin, String coste) {
		super();
		this.fechaIni = fechaIni;
		this.fechaFin = fechaFin;
		this.coste = coste;
	}
	
	public Oferta() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getFechaIni() {
		return fechaIni;
	}
	public void setFechaIni(String fechaIni) {
		this.fechaIni = fechaIni;
	}
	public String getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}
	public String getCoste() {
		return coste;
	}
	public void setCoste(String coste) {
		this.coste = coste;
	}
	
	

}
