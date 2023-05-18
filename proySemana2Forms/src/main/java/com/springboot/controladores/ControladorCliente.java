package com.springboot.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.modelo.Cliente;

@Controller
public class ControladorCliente {
	
	//URL: ABRIR LA PAGINA
	@GetMapping("/index")
	public String index() {
		return "index";
	}
	@GetMapping("/registro")
	public String register() {
		return "regclientes";
	}
	
	//URL: PARA ENVIAR DATOS AL CLIENTE
	@PostMapping("/enviar")
	public String enviar(Model modelo, Cliente cli) {
		modelo.addAttribute("a_nombre", cli.getNombre());
		modelo.addAttribute("a_apellido", cli.getApellido());
		modelo.addAttribute("a_correo", cli.getCorreo());
		modelo.addAttribute("a_telefono", cli.getTelefono());
		return "regclientes";
	}
	
	
}
