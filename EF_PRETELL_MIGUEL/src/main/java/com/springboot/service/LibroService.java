package com.springboot.service;

import java.util.List;

import com.springboot.model.Libro;

public interface LibroService {
	public List<Libro> listar();
	public void guardar(Libro libro);
	public List<Libro>listarFiltro(String cat_nombre, String aut_pais);
}
