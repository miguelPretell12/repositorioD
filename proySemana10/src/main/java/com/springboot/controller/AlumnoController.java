package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.model.Alumno;
import com.springboot.service.AlumnoService;

@Controller
public class AlumnoController {
	@Autowired
	private AlumnoService service;

	@GetMapping("/")
	public String listar(Model modelo) {
		List<Alumno>lista = service.listarTodos();
		modelo.addAttribute("lista_alumno", lista);
		return "index";
	}
	
	@GetMapping("/new")
	public String nuevo(Model modelo) {
		modelo.addAttribute("alumno", new Alumno());
		return "nuevo";
	}
	
	@PostMapping("/guardar")
	public String guardar(@ModelAttribute Alumno alumno) {
		service.guardar(alumno);
		return "redirect:/";
	}
}
