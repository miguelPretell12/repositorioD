package com.springboot.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.model.Departamento;
import com.springboot.repository.DepartamentoRepository;
import com.springboot.service.DepartamentoService;

@Service
public class DepartamentoServiceImpl implements DepartamentoService{

	@Autowired
	private DepartamentoRepository repository;
	@Override
	public List<Departamento> listar() {
		return repository.findAll();
	}
	
}
