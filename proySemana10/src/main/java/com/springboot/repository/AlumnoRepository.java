package com.springboot.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.springboot.model.Alumno;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Integer>{
	@Query(value="{call usp_listar_alumno()}", nativeQuery= true)
	public List<Alumno>listarProcedure();

	@Transactional
	@Modifying
	@Query(value="{call usp_insert_alumno(:p_nom, :p_ape, :p_tel, :p_cor)}",nativeQuery = true)
	public void guardarProcedure(
			@Param("p_nom") String p_nom, 
			@Param("p_ape") String p_ape,
			@Param("p_tel") String p_tel,
			@Param("p_cor") String p_cor
	);
}
