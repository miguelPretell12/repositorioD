package com.springboot.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.dao.LibroDaoImp;
import com.springboot.modelo.Libro;

@Controller
public class LibroControlador {
	@Autowired 
	private LibroDaoImp dao;
	
	@GetMapping("/buscar")
	public String buscar(Model model) {
		Libro lib = new Libro();
		model.addAttribute("libro", lib);
		return "buscarlibros";
	}
	
	@GetMapping("/buscarlib")
	public String buscarlib(@RequestParam(name="titulo") String titulo, Model model ) {
		Libro lib = dao.findByTitulo(titulo);
		model.addAttribute("libro",lib);
		return "buscarlibros";
	}
	
	
	@GetMapping({"/","","/index"})
	public String index(Model model) {
		Libro lib = new Libro();
		
		List<Libro>libro= dao.findAll();
		model.addAttribute("libro", lib);
		model.addAttribute("listarlibro",libro);
		return "guardarlibro";
	}
	
	@PostMapping("/guardar")
	public String guardar(@ModelAttribute("libro") Libro lib) {
		dao.save(lib);
		return "redirect:/";
	}

	
}
