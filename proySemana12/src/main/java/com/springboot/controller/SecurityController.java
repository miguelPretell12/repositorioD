package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {
	@GetMapping({"/","/login"})
	public String iniciar() {
		return "iniciar";
	}
	
	@GetMapping("/index")
	public String index() {
		return "index";
	}
}
