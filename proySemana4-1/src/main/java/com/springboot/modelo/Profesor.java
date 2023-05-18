package com.springboot.modelo;

public class Profesor {
	private int idprofesores;
	private String nombre;
	private String apellido;
	private String direccion;
	private int telefono;
	private String titulacion;
	private String email;
	
	public Profesor() {
		
	}

	public int getIdprofesores() {
		return idprofesores;
	}

	public void setIdprofesores(int idprofesores) {
		this.idprofesores = idprofesores;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
