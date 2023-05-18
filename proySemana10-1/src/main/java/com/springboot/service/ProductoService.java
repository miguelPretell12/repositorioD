package com.springboot.service;

import java.util.List;
import java.util.Optional;

import com.springboot.model.Producto;

public interface ProductoService {
	public List<Producto>listarProducto();
	public void save(Producto producto);
	public Optional<Producto>buscarId(int id);
	public void update(Producto producto);
	public void delete(int tidpro);
	
}
