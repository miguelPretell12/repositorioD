package com.springboot.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springboot.modelo.Profesor;

@Repository
public class ProfesorDaoImp implements IProfesorDao{
	@Autowired
	private JdbcTemplate jdbc;
	@Override
	public List<Profesor> findAll() {
		String sql = "select * from profesores";
		List<Profesor>lista = jdbc.query(sql, BeanPropertyRowMapper.newInstance(Profesor.class));
		return lista;
	}

	@Override
	public int save(Profesor pr) {
		String sql = "insert into profesores(nombre, apellido, direccion, telefono, titulacion, email)values (?,?,?,?,?,?)";
		
		return jdbc.update(sql,pr.getNombre(),pr.getApellido(), pr.getDireccion(), pr.getTelefono(), pr.getTitulacion(), pr.getEmail());
	}

	@Override
	public Profesor findById(long id) {
		String sql ="select * from profesores where idprofesores=?";
		Profesor pr = jdbc.queryForObject(sql,new Object[] {id}, BeanPropertyRowMapper.newInstance(Profesor.class));
		return null;
	}

	@Override
	public int delete(long id) {
		String sql = "delete from profesores where idprofesores=?"; 
		return jdbc.update(sql, id);
	}

}
