package com.springboot.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.model.Categoria;
import com.springboot.repository.CategoriaRepository;
import com.springboot.service.CategoriaService;

@Service
public class CategoriaServiceImpl implements CategoriaService{
	@Autowired
	private CategoriaRepository repository;
	
	@Override
	public List<Categoria> listarTodos() {
		return repository.findAll();
	}

}
