package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.model.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer>{

}
