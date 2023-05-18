package com.springboot.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.model.Curso;
import com.springboot.repository.CursoRepository;
import com.springboot.service.CursoService;

@Service
public class CursoServiceImpl implements CursoService{

	@Autowired
	private CursoRepository repository;
	
	@Override
	public List<Curso> listarTodos() {
		return repository.findAll();
	}

	@Override
	public void guardar(Curso curso) {
		repository.save(curso);
	}

}
