package com.springboot.dao;

import java.util.List;

import com.springboot.modelo.Libro;

public interface ILibroDao {
	//listar los datos registrados
	public List<Libro>findAll();
	//Guardar los datos a la base de datos
	public int save(Libro libro);
	
	//Buscar por ID en la base de datos
	public Libro findByTitulo(String titulo);
}
