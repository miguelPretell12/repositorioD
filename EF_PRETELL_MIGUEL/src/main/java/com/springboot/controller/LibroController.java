package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.model.Autor;
import com.springboot.model.Categoria;
import com.springboot.model.Libro;
import com.springboot.service.AutorService;
import com.springboot.service.CategoriaService;
import com.springboot.service.LibroService;

@Controller
public class LibroController {
	@Autowired
	private CategoriaService catservice;
	
	@Autowired
	private AutorService autservice;
	
	@Autowired
	private LibroService libservice;
	
	
	@GetMapping({"","/","/index"})
	public String index(Model modelo) {
		List<Categoria>listarcat = catservice.listar();
		List<Autor>listaraut = autservice.listar();
		List<Libro>listlib = libservice.listar();
		modelo.addAttribute("listarcat",listarcat);
		modelo.addAttribute("listaraut", listaraut);
		modelo.addAttribute("listlib", listlib);
		modelo.addAttribute("libro", new Libro());
		modelo.addAttribute("alerta","");
		return "index";
	}
	
	@PostMapping("/guardar")
	public String guardar(@ModelAttribute Libro libro,Model modelo) {
		libservice.guardar(libro);
		List<Categoria>listarcat = catservice.listar();
		List<Autor>listaraut = autservice.listar();
		List<Libro>listlib = libservice.listar();
		modelo.addAttribute("listarcat",listarcat);
		modelo.addAttribute("listaraut", listaraut);
		modelo.addAttribute("listlib", listlib);
		modelo.addAttribute("alerta","Registro Exitoso");
		return "index";
	}
	
	@GetMapping("/filtro")
	public String filtro(Model modelo) {
		List<Libro>listarFiltro = libservice.listarFiltro(null, null);
		modelo.addAttribute("libro", new Libro());
		modelo.addAttribute("filtrolist", listarFiltro);
		return "filtro";
	}
	
	@PostMapping("/buscarLibro")
	 public String buscarN(@RequestParam(name="categoria") String categoria, @RequestParam(name="autor") String autor, Model modelo) {
		 List<Libro>lista = libservice.listarFiltro( categoria, autor);
		 Libro lib = new Libro();
		 modelo.addAttribute("filtrolist",lista);
		 modelo.addAttribute("libro",lib);
		 return "filtro";
	 }
}
