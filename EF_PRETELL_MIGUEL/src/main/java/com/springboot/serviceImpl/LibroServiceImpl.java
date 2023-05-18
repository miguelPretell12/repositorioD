package com.springboot.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.model.Libro;
import com.springboot.repository.LibroRepository;
import com.springboot.service.LibroService;

@Service
public class LibroServiceImpl implements LibroService{
	@Autowired
	private LibroRepository repository;

	@Override
	public List<Libro> listar() {
		return repository.findAll();
	}

	@Override
	public void guardar(Libro libro) {
		repository.save(libro);
	}

	@Override
	public List<Libro> listarFiltro(String cat_nombre, String aut_pais) {
		return repository.listarProcedure(cat_nombre, aut_pais);
	}
}
