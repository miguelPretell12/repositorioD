package com.springboot.repository;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.springboot.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer>{
	@Query(value="{call proc_list()}", nativeQuery = true)
	public List<Producto>listarProcedure();
	
	@Transactional
	@Modifying
	@Query(value="{call proc_save(:tnompro, :tprepo, :tstkpro, :tfvcpro, :tdespro)}", nativeQuery = true)
	public void saveProcedure(
			@Param("tnompro") String tnompro,
			@Param("tprepo") double tprepo,
			@Param("tstkpro") int tstkpro,
			@Param("tfvcpro") Date tfvcpro,
			@Param("tdespro") String tdespro
	);
	
	@Transactional
	@Modifying
	@Query(value="{call proc_update(:tnompro, :tprepo, :tstkpro, :tfvcpro, :tdespro, :tidpro)}", nativeQuery = true)
	public void updateProcedure(
			@Param("tnompro") String tnompro,
			@Param("tprepo") double tprepo,
			@Param("tstkpro") int tstkpro,
			@Param("tfvcpro") Date tfvcpro,
			@Param("tdespro") String tdespro,
			@Param("tidpro") int tidpro
	);
	
	@Transactional
	@Modifying
	@Query(value="{call proc_delete(:tidpro)}", nativeQuery = true)
	public void deleteProcedure(
			@Param("tidpro") int tidpro
		);
	/*
	@Transactional
	@Modifying
	@Query(value="{call proc_lista_fin(:tidpro)}", nativeQuery = true)
	public vo listId(
			@Param("tidpro") int tidpro
		);*/
}
