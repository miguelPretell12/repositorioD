package com.springboot.dao;

import java.util.List;

import com.springboot.modelo.Alumno;

public interface IAlumnoDao {
	//Listar todos los alumnos
	public List<Alumno>findAll();
	
	public int save(Alumno alu);
	
	public Alumno findById (long id);
	
	public int delete(long id);
	
	public int update(Alumno alu);
}
