package com.tarjeta.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.tarjeta.domain.Cliente;
import com.tarjeta.persistence.ClienteDao;
import com.tarjeta.persistence.UsuarioDao;

public class ClienteService implements IClienteService{

	
	@Autowired
	private ClienteDao clienteDao;
	
	
	@Override
	public void insertCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cliente findPuntoByCliente(String login) {
		// TODO Auto-generated method stub
		return null;
		
	}

}
