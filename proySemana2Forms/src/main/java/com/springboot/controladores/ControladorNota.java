package com.springboot.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.modelo.Nota;

@Controller
public class ControladorNota {
	
	@GetMapping("/notas")
	public String notaForm() {
		return "regNotas";
	}
	
	@PostMapping("/SendNota")
	public String notaSend(Model modelo, Nota nt) {
		modelo.addAttribute("n_nombre",nt.getNombre());
		modelo.addAttribute("n_nota1", nt.getNota1());
		modelo.addAttribute("n_nota2", nt.getNota2());
		modelo.addAttribute("n_nota3", nt.getNota3());
		modelo.addAttribute("n_promedio", nt.promedioNota());
		return "regNotas";
	}
}
