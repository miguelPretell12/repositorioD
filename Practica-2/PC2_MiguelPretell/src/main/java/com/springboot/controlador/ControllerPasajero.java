package com.springboot.controlador;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.dao.PasajeroDaoImp;
import com.springboot.modelo.Pasajero;

@Controller
public class ControllerPasajero {
	@Autowired
	private PasajeroDaoImp dao;
	
	@GetMapping("/")
	public String listar(Model modelo) {
		List<Pasajero>lista = dao.findAll();
		modelo.addAttribute("pasajero",lista);
		return "index";
	}
	
	@GetMapping("/nuevo")
	public String nuevo(Model modelo) {
		Pasajero psj = new Pasajero();
		modelo.addAttribute("pasajero",psj);
		return "guardar";
	}
	
	@PostMapping("/guardar")
	public String guardar(@ModelAttribute("atributo") Pasajero psj) {
		dao.save(psj);
		return "redirect:/";
	}
	
	@GetMapping("/borrar/{id}")
	public String borrar(@PathVariable("id") int id) {
		dao.delete(id);
		return "redirect:/";
	}
	
}
