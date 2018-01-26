package com.tarjeta.service;

import com.tarjeta.domain.Usuario;

public interface IUsuarioService {
	
	public abstract void insertUsuario(Usuario usuario);	
	
	public Usuario findUsuarioByLogin(String login);

}
