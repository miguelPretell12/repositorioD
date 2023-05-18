package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.model.Alumno;
import com.springboot.model.Asignatura;
import com.springboot.model.Nota;
import com.springboot.service.AlumnoService;
import com.springboot.service.AsignaturaService;
import com.springboot.service.NotaService;

@Controller
public class NotasController {
	@Autowired
	private AlumnoService servicealumno;
	@Autowired
	private AsignaturaService serviceasignatura;
	@Autowired
	private NotaService servicenota;
	
	 @GetMapping({"","/","home"})
	 public String index(Model modelo) {
		 List<Nota>lista = servicenota.listarTodos();
		 List<Asignatura>listaAsig = serviceasignatura.listarTodos();
		 List<Alumno>listaAlu = servicealumno.listarTodos();
		 modelo.addAttribute("nota", new Nota());
		 modelo.addAttribute("listanota",lista);
		 modelo.addAttribute("listaasig",listaAsig);
		 modelo.addAttribute("listaalu",listaAlu);
		 return "index";
	 }
	 
	 @PostMapping("/guardar")
	 public String guardar(@ModelAttribute Nota nota) {
		 servicenota.guardar(nota);
		 return "redirect:/";
	 }
	 
	 
	 @GetMapping("/buscar")
	 public String buscarNota(Model modelo) {
		 Alumno alu = new Alumno();
		 List<Nota>lista = servicenota.listarAlu(0, null);
		 modelo.addAttribute("listanota",lista);
		 modelo.addAttribute("alumno",alu);
		 return "listarNotaAlu";
	 }
	 
	 @PostMapping("/buscarNota")
	 public String buscarN(@RequestParam(name="alumno_id") int alumno_id, @RequestParam(name="apellido") String apellido, Model modelo) {
		 List<Nota>lista = servicenota.listarAlu(alumno_id, apellido);
		 Alumno alu = new Alumno();
		 modelo.addAttribute("listanota",lista);
		 modelo.addAttribute("alumno",alu);
		 return "listarNotaAlu";
	 }
}
