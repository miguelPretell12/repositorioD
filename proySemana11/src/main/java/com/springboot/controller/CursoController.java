package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.model.Categoria;
import com.springboot.model.Curso;
import com.springboot.service.CategoriaService;
import com.springboot.service.CursoService;

@Controller
public class CursoController {
	@Autowired
	private CategoriaService servicecategoria;
	@Autowired
	private CursoService servicecurso;
	
	@GetMapping({"","/"})
	public String index(Model modelo) {
		List<Curso>lista = servicecurso.listarTodos(); 
		modelo.addAttribute("listacurso",lista);
		return "index";
	}
	
	@GetMapping("/nuevo")
	public String nuevo(Model modelo) {
		List<Categoria>lista = servicecategoria.listarTodos();
		modelo.addAttribute("curso", new Curso());
		modelo.addAttribute("listacategoria",lista);
		return "nuevoCurso";
	}
	
	@PostMapping("/guardar")
	public String guardar(@ModelAttribute Curso curso) {
		servicecurso.guardar(curso);
		return "redirect:/";
	}
}
