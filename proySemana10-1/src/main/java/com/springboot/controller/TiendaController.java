package com.springboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.model.Producto;
import com.springboot.service.ProductoService;

@Controller
public class TiendaController {
	@Autowired
	private ProductoService service;
	
	@GetMapping({"/","/home",""})
	public String index(Model modelo) {
		List<Producto> lista = service.listarProducto();
		modelo.addAttribute("lista_producto",lista);
		return "index";
	}
	
	@GetMapping("/new")
	public String nuevo(Model md) {
		md.addAttribute("producto", new Producto());
		return "guardar";
	}
	
	@PostMapping("/guardar")
	public String guardar(@ModelAttribute Producto producto) {
		service.save(producto);
		
		return "redirect:/";
	}
	@GetMapping("/editar/{id}")
	public String editar(@PathVariable int id, Model modelo) {
		Optional<Producto>lista = service.buscarId(id);
		modelo.addAttribute("producto",lista);
		return "actualizar";
	}
	
	@PostMapping("/editar")
	public String edit(@ModelAttribute Producto producto) {
		service.update(producto);
		return "redirect:/";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam Integer idpro) {
		service.delete(idpro);
		return "redirect:/";
	}
}
