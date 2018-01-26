package com.tarjeta.service;

import java.util.List;

import com.tarjeta.domain.Oferta;

public interface IOfertaService {
	
	public abstract List<Oferta> findOfertasbyFecha(String Fecha);

}
