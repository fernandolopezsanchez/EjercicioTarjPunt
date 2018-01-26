package com.tarjeta.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.tarjeta.service.IClienteService;
import com.tarjeta.service.IOfertaService;
import com.tarjeta.service.IOperadorService;
import com.tarjeta.service.IReservaService;
import com.tarjeta.service.IUsuarioService;

@Controller
public class Controlador {
	
	@Autowired
	private IUsuarioService usuarioService;
	
	@Autowired
	private IClienteService clienteService;
	
	@Autowired
	private IOperadorService operadorService;
	
	@Autowired
	private IReservaService reservaService;
	
	@Autowired
	private IOfertaService ofertaService;
	

	
	
	
	

}
