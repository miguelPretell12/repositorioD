package com.springboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.models.Alumno;

@Controller
public class ControllerStudent {
	@GetMapping("/frmStudent")
	public String openForm() {
		return "alumno";
	}
	
	@PostMapping("/process")
	public String procesar(Model modelo, Alumno alu) {
		modelo.addAttribute("a_codigo", alu.getCodigo());
		modelo.addAttribute("a_nombre", alu.getNombre());
		modelo.addAttribute("a_nota1",alu.getNota1());
		modelo.addAttribute("a_nota2",alu.getNota2());
		modelo.addAttribute("a_nota3",alu.getNota3());
		modelo.addAttribute("a_promedio",alu.Average());
		modelo.addAttribute("a_condicion", alu.Condition());
		return "index";
	}
}
