package com.springboot.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.model.Alumno;
import com.springboot.repository.AlumnoRepository;
import com.springboot.service.AlumnoService;

@Service
public class AlumnoServiceImpl implements AlumnoService {
	
	@Autowired
	private AlumnoRepository repository;
	
	@Override
	public List<Alumno> listarTodos() {
		return repository.listarProcedure();
	}

	@Override
	public void guardar(Alumno alumno) {
		repository.guardarProcedure(alumno.getNombre(), alumno.getApellido(), alumno.getTelefono(), alumno.getCorreo());	
	}
	
	

}
