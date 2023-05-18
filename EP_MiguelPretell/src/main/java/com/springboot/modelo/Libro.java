package com.springboot.modelo;

import java.sql.Date;

public class Libro {
	//Atributo
	private int idLibro;
	private String titulo;
	private Date fechaPublicacion;
	private String autor;
	private String editorial;
	private String idioma;
	private int nroPaginas;
	private String isbn;
	private String descripcion;
	
	public Libro() {
		
	}

	public Libro(int idLibro, String titulo, Date fechaPublicacion, String autor, String editorial, String idioma,
			int nroPaginas, String isbn, String descripcion) {
		super();
		this.idLibro = idLibro;
		this.titulo = titulo;
		this.fechaPublicacion = fechaPublicacion;
		this.autor = autor;
		this.editorial = editorial;
		this.idioma = idioma;
		this.nroPaginas = nroPaginas;
		this.isbn = isbn;
		this.descripcion = descripcion;
	}

	public int getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(Date fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public int getNroPaginas() {
		return nroPaginas;
	}

	public void setNroPaginas(int nroPaginas) {
		this.nroPaginas = nroPaginas;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
