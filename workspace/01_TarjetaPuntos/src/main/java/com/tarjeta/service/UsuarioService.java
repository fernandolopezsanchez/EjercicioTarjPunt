package com.tarjeta.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tarjeta.domain.Usuario;
import com.tarjeta.persistence.UsuarioDao;

@Service
public class UsuarioService implements IUsuarioService{
	
	@Autowired
	private UsuarioDao usuarioDao;


	@Override
	public void insertUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}
	

	@Override
	public Usuario findUsuarioByLogin(String login) {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
