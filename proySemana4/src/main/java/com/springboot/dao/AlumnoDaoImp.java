package com.springboot.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springboot.modelo.Alumno;

@Repository
public class AlumnoDaoImp implements IAlumnoDao{
	
	@Autowired
	private JdbcTemplate jdbc;
	
	@Override
	public List<Alumno> findAll() {
		String sql = "select * from alumno";
		List<Alumno>lista = jdbc.query(sql, BeanPropertyRowMapper.newInstance(Alumno.class));
		return lista;
	}

	@Override
	public int save(Alumno alu) {
		String sql = "insert into alumno(nombre, apellido, telefono, correo)values(?,?,?,?)";
		return jdbc.update(sql,alu.getNombre(),alu.getApellido(), alu.getTelefono(), alu.getCorreo());
	}

	@Override
	public Alumno findById(long id) {
		String sql ="select * from alumno where idalumno=?";
		Alumno alu =jdbc.queryForObject(sql,new Object[] {id}, BeanPropertyRowMapper.newInstance(Alumno.class));
		return alu;
	}

	@Override
	public int delete(long id) {
		String sql = "delete from alumno where idalumno=?"; 
		return jdbc.update(sql, id);
	}
	
	@Override
	public int update(Alumno alu) {
		String sql = "update alumno set nombre=?, apellido=?, telefono=?, correo=? where idalumno=?";
		return jdbc.update(sql, alu.getNombre(), alu.getApellido(), alu.getTelefono(), alu.getCorreo(), alu.getIdalumno());
	}
	
}
