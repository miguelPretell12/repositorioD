package com.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.springboot.model.Libro;

public interface LibroRepository extends JpaRepository<Libro, Integer>{
	@Query(value="{call list_cat_autor(:cat_nombre, :aut_pais)}", nativeQuery = true)
	public List<Libro>listarProcedure(@Param("cat_nombre") String cat_nombre, @Param("aut_pais") String aut_pais);
}
