package com.springboot.service;

import java.util.List;

import com.springboot.model.Curso;

public interface CursoService {
	public List<Curso>listarTodos();
	public void guardar(Curso curso);
	
}
