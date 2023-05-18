package com.springboot.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.model.Nota;
import com.springboot.repository.NotaRepository;
import com.springboot.service.NotaService;

@Service
public class NotaServiceImpl implements NotaService{
	@Autowired
	private NotaRepository repository;

	@Override
	public List<Nota> listarTodos() {
		return repository.findAll();
	}

	@Override
	public void guardar(Nota nota) {
		repository.save(nota);
	}

	@Override
	public List<Nota> listarAlu(int id, String apellido) {
		return repository.listarProcedure(id, apellido);
	}
	
	
}
