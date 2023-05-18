package com.springboot.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.model.Empleado;
import com.springboot.repository.EmpleadoRepository;
import com.springboot.service.EmpleadoService;

@Service
public class EmpleadoServiceImpl implements EmpleadoService{
	
	@Autowired
	private EmpleadoRepository repository;
	@Override
	public List<Empleado> listar() {
		return repository.findAll();
	}
	@Override
	public void guardar(Empleado empleado) {
		repository.save(empleado);
	}
	@Override
	public List<Empleado> listarFiltro(String ape_empl, String nom_depa) {
		return repository.listarProcedure(ape_empl, nom_depa);
	}
	
}
