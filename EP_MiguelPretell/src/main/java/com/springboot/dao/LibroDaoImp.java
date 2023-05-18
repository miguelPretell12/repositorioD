package com.springboot.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springboot.modelo.Libro;

@Repository
public class LibroDaoImp implements ILibroDao{
	@Autowired
	private JdbcTemplate jdbc;

	@Override
	public List<Libro> findAll() {
		String sql = "select * from libro";
		List<Libro>libro = jdbc.query(sql, BeanPropertyRowMapper.newInstance(Libro.class));
		return libro;
	}

	@Override
	public int save(Libro lib) {
		String sql = "insert into libro(titulo,fechaPublicacion,autor, editorial, idioma,"
				+ "nroPaginas, isbn, descripcion) values (?,?,?,?,?,?,?,?)";
		return jdbc.update(sql, lib.getTitulo(),lib.getFechaPublicacion(),lib.getAutor(),
				lib.getEditorial(),lib.getIdioma(),lib.getNroPaginas(),
				lib.getIsbn(),lib.getDescripcion());
	}

	@Override
	public Libro findByTitulo(String titulo) {
		String sql = "select * from libro where titulo =?";
		Libro alu =jdbc.queryForObject(sql,new Object[] {titulo}, BeanPropertyRowMapper.newInstance(Libro.class));
		return alu;
	}
	
	
}
