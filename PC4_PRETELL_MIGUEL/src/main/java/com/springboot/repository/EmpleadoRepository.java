package com.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.springboot.model.Empleado;


public interface EmpleadoRepository extends JpaRepository<Empleado, Integer> {
	@Query(value="{call list_empl_dep(:ape_emp, :nom_dep)}", nativeQuery = true)
	public List<Empleado>listarProcedure(@Param("ape_emp") String ape_emp, @Param("nom_dep") String nom_dep);
}
