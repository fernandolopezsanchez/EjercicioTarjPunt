package com.tarjeta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tarjeta.domain.Reserva;
import com.tarjeta.persistence.ReservaDao;

@Service
public class ReservaService implements IReservaService {
	
	@Autowired
	private ReservaDao reservaDao;

	@Override
	public List<Reserva> findReservasbyTarjeta(int idTarjeta) {
		
		return null;
	}

}
