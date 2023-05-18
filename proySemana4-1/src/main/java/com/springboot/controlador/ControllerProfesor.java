package com.springboot.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.dao.ProfesorDaoImp;
import com.springboot.modelo.Profesor;


@Controller
public class ControllerProfesor {
	@Autowired
	private ProfesorDaoImp dao;
		
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/listar")
	public String listar(Model modelo) {
		List<Profesor>lista = dao.findAll();
		modelo.addAttribute("listaprof",lista);
		return "listarprofesor";
	}
	
	@GetMapping("/nuevo") 
	public String crear(Model modelo ) {
		Profesor alu = new Profesor();
		modelo.addAttribute("profesor", alu);
		return "registroprofesor";
	}
	
	
	@PostMapping("/guardar")
	public String guardar(@ModelAttribute("atributo") Profesor alu) {
		dao.save(alu);
		return "redirect:/listar";
	}
	
	@GetMapping("/borrar/{id}")
	public String borrar(@PathVariable("id") int id) {
		dao.delete(id);
		return "redirect:/listar";
	}
}
