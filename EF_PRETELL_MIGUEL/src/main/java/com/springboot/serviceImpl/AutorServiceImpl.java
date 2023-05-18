package com.springboot.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.model.Autor;
import com.springboot.repository.AutorRepository;
import com.springboot.service.AutorService;

@Service
public class AutorServiceImpl implements AutorService{

	@Autowired
	private AutorRepository repository;
	
	@Override
	public List<Autor> listar() {
		return repository.findAll();
	}

}
