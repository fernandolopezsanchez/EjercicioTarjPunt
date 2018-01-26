package com.tarjeta.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.tarjeta.domain.Operador;
import com.tarjeta.persistence.OperadorDao;


public class OperadorService implements IOperadorService{

	@Autowired
	private OperadorDao operadorDao;
	
	@Override
	public void insertOperador(Operador operador) {
		// TODO Auto-generated method stub
		
	}

}
