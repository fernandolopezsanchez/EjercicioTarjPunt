package com.tarjeta.marshallers;

import org.springframework.stereotype.Component;

import com.tarjeta.dto.Usuario;

@Component
public class UsuarioMarshaller implements Marshall<Usuario, com.tarjeta.domain.Usuario>{


	@Override
	public com.tarjeta.domain.Usuario marshall(Usuario entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario unMarshall(com.tarjeta.domain.Usuario dto) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
