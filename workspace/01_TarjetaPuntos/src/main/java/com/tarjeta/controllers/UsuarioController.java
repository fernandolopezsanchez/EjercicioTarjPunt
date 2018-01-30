package com.tarjeta.controllers;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.tarjeta.domain.Cliente;
import com.tarjeta.domain.Oferta;
import com.tarjeta.dto.Usuario;
import com.tarjeta.service.IClienteService;
import com.tarjeta.service.IOfertaService;
import com.tarjeta.service.IReservaService;
import com.tarjeta.service.IUsuarioService;

@Controller
@SessionAttributes("usuario")
public class UsuarioController {

	@Autowired
	private IUsuarioService usuarioService;

	@Autowired
	private IOfertaService ofertaService;

	@Autowired
	private IClienteService clienteService;
	
	@Autowired 
	private IReservaService reservaService;

	/*@Autowired 
	 * MessageSource messageSource;
	 */
	 

	// Refactorizar a ViewController
	@GetMapping("/bienvenida")
	public String bienvenida() {
		return "bienvenida";

	}

	// Creamos este objeto a nivel de Request, para rellenar los campos del
	// formulario de Login
	@ModelAttribute("usuario")
	public String iniciarLogin() {

		return "login";
	}

	@GetMapping("/login")
	public String login() {

		return "login";
	}

	/*
	 * @PostMapping("/login") public String procesarLogin(@ModelAttribute Login
	 * login, Map<String, Object> model, HttpSession session) {
	 * 
	 * //Si error //return "login" //Si existe Usuario usuario = null;//no incluir
	 * password objeto usuario xq va en la sesion, se hace capa Servicio dto
	 * //model.put("usuario", usuario); session.setAttribute("usuario", usuario);
	 * return "bienvenida";
	 * 
	 * }
	 */

	@RequestMapping(path = "/login", method = RequestMethod.POST)
	public String procesarLogin(@Valid @ModelAttribute Usuario usuario, HttpSession session) {

		// System.out.println(">>>>>>>>>>>>" + usuario.getLogin() + ">>" +
		// usuario.getPassword());

		String login = usuario.getLogin();

		com.tarjeta.domain.Usuario usuarioEntity = usuarioService.findUsuarioByLogin(login);

		if (usuarioEntity == null) {
			return "login";

		} else {
			usuario.setLogin(usuarioEntity.getLogin());
			usuario.setPassword(null);

			session.setAttribute("usuario", usuario);

		}

		return "bienvenida";

		/*
		 * if(login.isEmpty()){ return "registro"; }else { return "menu_usuario"; }
		 */

	}

	@GetMapping("/ofertas")
	public String ofertas(HttpSession session, Map<String, Object> model) {

		session.getAttribute("usuario");

		// Recupera las ofertas del back
		List<Oferta> ofertas = ofertaService.findOfertasbyFecha("fecha");

		model.put("ofertas", ofertas);

		return "ofertas";
	}

	@GetMapping("/puntos")
	public String puntos(HttpSession session, Map<String, Object> model) {

		Usuario usuario = (Usuario) session.getAttribute("usuario");

		// Recupera los puntos del back
		Cliente cliente = clienteService.findPuntoByCliente(usuario.getLogin());
		long puntos = cliente.getPuntos();

		model.put("puntos", puntos);

		return "puntos";
	}

	@GetMapping("/reservas")
	public String reservas(HttpSession session, Map<String, Object> model) {

		Usuario usuario = (Usuario) session.getAttribute("usuario");

		//Recupera las ofertas de back
		//reservaService.findReservasbyTarjeta(idTarjeta);
		
		List<com.tarjeta.domain.Reserva> reservas = null;

		model.put("reservas", reservas);

		return "reservas";
	}

	@ModelAttribute("usuario")
	public Usuario usuario() {
		return new Usuario();
	}

	@GetMapping("/registro")
	public String registro() {
		return "registro";

	}

}
