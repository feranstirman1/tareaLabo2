package com.uca.capas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.uca.capas.domain.Usuario;

@Controller
public class MainController {
	
	@GetMapping("/login")
	public String enviarUser(Usuario usuario) {
		return "Login";
	}
	
	@PostMapping("/validacion")
	public String procesarUser(Usuario usuario) {
		/*
		 * username: admin
		 * password: root
		 * */
		if(usuario.getUsername().equals("admin") && usuario.getPassword().equals("root")) {
			return "MostrarMensajeV";
		}else {
			return "MostrarMensajeF";
		}
	}

}
