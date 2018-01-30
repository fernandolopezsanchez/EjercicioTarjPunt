package com.tarjeta.controllers;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.util.WebUtils;

import com.tarjeta.service.IOfertaService;

@Controller
@RequestMapping("/ofertas")
public class OfertasController {
	
	/*@Autowired
	private IOfertaService ofertaService;*/
	
	
	public String mostrarOfertas(HttpServletRequest request) {
		
		boolean ofertas = WebUtils.hasSubmitParameter(request, "ofertas");
		
		if(ofertas) {
			
			return "ofertas";
		} else {
		
		return null;
		}
	}

}
