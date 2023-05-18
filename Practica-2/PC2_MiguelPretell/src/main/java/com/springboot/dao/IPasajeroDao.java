package com.springboot.dao;

import java.util.List;

import com.springboot.modelo.Pasajero;

public interface IPasajeroDao {
	//Listar todos los pasajeros
	public List<Pasajero>findAll();
	
	public int save(Pasajero alu);
	
	public int delete(long id);
}
