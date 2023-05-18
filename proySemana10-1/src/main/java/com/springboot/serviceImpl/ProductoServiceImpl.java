package com.springboot.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.model.Producto;
import com.springboot.repository.ProductoRepository;
import com.springboot.service.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService{
	@Autowired
	private ProductoRepository repository;

	@Override
	public List<Producto> listarProducto() {
		return repository.listarProcedure();
	}

	@Override
	public void save(Producto producto) {
		repository.saveProcedure(producto.getNompro(), 
				producto.getPrepro(), producto.getStkpro(), producto.getFvcpro(), producto.getDespro());
		
	}

	@Override
	public void update(Producto producto) {
		repository.updateProcedure(producto.getNompro(), 
			producto.getPrepro(), producto.getStkpro(), producto.getFvcpro(), producto.getDespro(), producto.getIdpro());
	}

	@Override
	public void delete(int tidpro) {
		repository.deleteProcedure(tidpro);
	}

	@Override
	public Optional<Producto> buscarId(int id) {
		return repository.findById(id);
	}	
	
}
