package com.springboot.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springboot.modelo.Pasajero;

@Repository
public class PasajeroDaoImp implements IPasajeroDao {
	@Autowired
	private JdbcTemplate jdbc;

	@Override
	public List<Pasajero> findAll() {
		// TODO Auto-generated method stub
		String sql = "select * from pasajero";
		List<Pasajero>lista = jdbc.query(sql, BeanPropertyRowMapper.newInstance(Pasajero.class));
		return lista;
	}

	@Override
	public int save(Pasajero psj) {
		// TODO Auto-generated method stub
		String sql = "insert into pasajero(nombre, apellido, tipoDocumento, numDocumento, correo, telefonoMovil, sexo, estadoCivil, fechaNacimiento) values(?,?,?,?,?,?,?,?,?)";
		return jdbc.update(sql, psj.getNombre(), psj.getApellido(), psj.getTipoDocumento(), psj.getNumDocumento(), psj.getCorreo(), psj.getTelefonoMovil(), psj.getSexo(), psj.getEstadoCivil(), psj.getFechaNacimiento());
	}

	@Override
	public int delete(long id) {
		// TODO Auto-generated method stub
		String sql = "delete from pasajero where idPasajero=?"; 
		return jdbc.update(sql, id);
	}

}
