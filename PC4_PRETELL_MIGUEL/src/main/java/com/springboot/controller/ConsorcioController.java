package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springboot.model.Departamento;
import com.springboot.model.Empleado;
import com.springboot.service.DepartamentoService;
import com.springboot.service.EmpleadoService;

@Controller
public class ConsorcioController {
	@Autowired
	private EmpleadoService serviceEmpleado;
	
	@Autowired
	private DepartamentoService serviceDepartamento;
	
	@GetMapping({"","/","/index"})
	public String index(Model modelo) {
		List<Empleado>listar = serviceEmpleado.listar();
		List<Departamento>listarDep = serviceDepartamento.listar();
		modelo.addAttribute("listadep",listarDep);
		modelo.addAttribute("listaEmpleado", listar);
		modelo.addAttribute("empleado", new Empleado());
		return "index";
	}
	
	@PostMapping("/guardar")
	public String save(@ModelAttribute Empleado empleado) {
		serviceEmpleado.guardar(empleado);
		return "redirect:/";
	}
	
	@GetMapping("/filtro")
	public String filtro(Model modelo) {
		List<Empleado>listarFiltro = serviceEmpleado.listarFiltro(null, null);
		modelo.addAttribute("empleado", new Empleado());
		modelo.addAttribute("filtro", listarFiltro);
		return "listarFiltro";
	}
	
	@PostMapping("/buscarNota")
	 public String buscarN(@RequestParam(name="departamento") String departamento, @RequestParam(name="apellido") String apellido, Model modelo) {
		 List<Empleado>lista = serviceEmpleado.listarFiltro( apellido, departamento);
		 Empleado emp = new Empleado();
		 modelo.addAttribute("text",departamento);
		 modelo.addAttribute("filtro",lista);
		 modelo.addAttribute("empleado",emp);
		 return "listarFiltro";
	 }
}
