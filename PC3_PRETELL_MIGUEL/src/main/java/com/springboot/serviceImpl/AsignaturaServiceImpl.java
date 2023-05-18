package com.springboot.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.model.Asignatura;
import com.springboot.repository.AsignaturaRepository;
import com.springboot.service.AsignaturaService;

@Service
public class AsignaturaServiceImpl implements AsignaturaService{
	
	@Autowired
	private AsignaturaRepository repository;
	
	@Override
	public List<Asignatura> listarTodos() {
		return repository.findAll();
	}
	
}
