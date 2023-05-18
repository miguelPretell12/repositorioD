package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsuarioController {
	@GetMapping({"/","/login"})
	public String login() {
		return "autenticar";
	}
	
	@GetMapping("/menu")
	public String menu() {
		return "menu";
	}
}
