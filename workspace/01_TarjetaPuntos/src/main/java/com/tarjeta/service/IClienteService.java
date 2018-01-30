package com.tarjeta.service;

import com.tarjeta.domain.Cliente;

public interface IClienteService {

	public abstract void insertCliente(Cliente cliente);
	
	public Cliente findPuntoByCliente(String login);
	
}
