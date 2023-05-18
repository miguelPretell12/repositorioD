package com.springboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.models.Obrero;

@Controller
public class ControllerObrero {
	@GetMapping("/frmobrero")
	public String abrir() {
		return "obrero";
	}
	
	@PostMapping("/procesar")
	public String procesar(Model modelo, Obrero obj) {
		modelo.addAttribute("a_nombre", obj.getNombre());
		modelo.addAttribute("a_tarifa", obj.getTarifa());
		modelo.addAttribute("a_horas", obj.getHoras());
		modelo.addAttribute("a_salariobruto", obj.SalarioBruto());
		modelo.addAttribute("a_descto",obj.Desct());
		return "obrero";
	}
}
