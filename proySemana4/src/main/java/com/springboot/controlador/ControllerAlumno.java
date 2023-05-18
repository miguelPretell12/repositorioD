package com.springboot.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.dao.AlumnoDaoImp;
import com.springboot.modelo.Alumno;

@Controller
public class ControllerAlumno {
	@Autowired
	private AlumnoDaoImp dao;
	
	@GetMapping("/listar")
	public String listar(Model modelo) {
		List<Alumno>lista = dao.findAll();
		modelo.addAttribute("listaalumnos",lista);
		return "listadoalumno";
	}
	
	@GetMapping("/nuevo")
	public String nuevo(Model modelo) {
		Alumno alu = new Alumno();
		modelo.addAttribute("alumno", alu);
		return "guardaralumno";
	}
	
	@PostMapping("/guardar")
	public String guardar(@ModelAttribute("atributo") Alumno alu) {
		dao.save(alu);
		return "redirect:/listar";
	}
	
	@GetMapping("/borrar/{id}")
	public String borrar(@PathVariable("id") int id) {
		dao.delete(id);
		return "redirect:/listar";
	}
	
	@GetMapping("/editar/{id}")
	public String editar(@PathVariable("id") int id, Model modelo) {
		Alumno alu = dao.findById(id);
		modelo.addAttribute("alumno", alu);
		return "editaralumno";
	}
	
	@PostMapping("/actualizar")
	public String actualizar(@ModelAttribute("alumno") Alumno alu) {
		dao.update(alu);
		return "redirect:/listar";
	}
}
