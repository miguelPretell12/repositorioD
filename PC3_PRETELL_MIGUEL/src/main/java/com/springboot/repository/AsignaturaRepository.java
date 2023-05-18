package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.model.Asignatura;

@Repository
public interface AsignaturaRepository extends JpaRepository<Asignatura, Integer>{

}
