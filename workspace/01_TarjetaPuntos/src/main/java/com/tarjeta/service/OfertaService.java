package com.tarjeta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tarjeta.domain.Oferta;
import com.tarjeta.persistence.OfertaDao;


public class OfertaService implements IOfertaService{
	
	@Autowired
	private OfertaDao ofertarDao;

	@Override
	public List<Oferta> findOfertasbyFecha(String Fecha) {
		// TODO Auto-generated method stub
		return null;
	}

}
