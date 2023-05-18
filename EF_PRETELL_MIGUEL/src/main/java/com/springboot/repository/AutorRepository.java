package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.model.Autor;

public interface AutorRepository extends JpaRepository<Autor, Integer>{

}
