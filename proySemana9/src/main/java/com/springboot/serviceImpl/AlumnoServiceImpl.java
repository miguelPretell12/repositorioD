package com.springboot.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.springboot.model.Alumno;
import com.springboot.repository.AlumnoRepository;
import com.springboot.service.AlumnoService;

public class AlumnoServiceImpl implements AlumnoService {

	@Autowired
	private AlumnoRepository repository;
	
	public List<Alumno> listarTodos(){
		return (List<Alumno>) repository;
	}
	
}
