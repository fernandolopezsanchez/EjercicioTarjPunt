package com.tarjeta.service;

import java.util.List;

import com.tarjeta.domain.Reserva;

public interface IReservaService {

	public abstract List<Reserva> findReservasbyTarjeta(int idTarjeta);

}