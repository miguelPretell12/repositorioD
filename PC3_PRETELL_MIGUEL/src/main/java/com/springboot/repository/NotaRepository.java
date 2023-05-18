package com.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.springboot.model.Nota;

@Repository
public interface NotaRepository extends JpaRepository<Nota, Integer> {
	@Query(value="{call list_alu(:cod_alu, :ap)}", nativeQuery = true)
	public List<Nota>listarProcedure(@Param("cod_alu") int cod_alu, @Param("ap") String ap);
}
