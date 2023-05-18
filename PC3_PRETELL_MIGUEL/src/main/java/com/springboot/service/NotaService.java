package com.springboot.service;

import java.util.List;

import com.springboot.model.Nota;

public interface NotaService {
	public List<Nota>listarTodos();
	public void guardar(Nota nota);
	public List<Nota>listarAlu(int id, String apellido);
	
}
