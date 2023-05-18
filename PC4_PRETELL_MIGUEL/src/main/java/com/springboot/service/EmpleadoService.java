package com.springboot.service;

import java.util.List;

import com.springboot.model.Empleado;

public interface EmpleadoService {
	public List<Empleado>listar();
	public void guardar(Empleado empleado);
	public List<Empleado>listarFiltro(String ape_empl, String nom_depa);
}
