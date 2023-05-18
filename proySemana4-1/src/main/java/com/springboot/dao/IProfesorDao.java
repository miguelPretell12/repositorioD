package com.springboot.dao;

import java.util.List;
import com.springboot.modelo.Profesor;


public interface IProfesorDao {
public List<Profesor>findAll();
	
	public int save(Profesor pr);
	
	public Profesor findById (long id);
	
	public int delete(long id);
}
