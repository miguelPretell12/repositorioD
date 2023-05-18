package com.springboot.models;

public class Alumno {
	private int codigo;
	private String nombre;
	private int nota1;
	private int nota2;
	private int nota3;
	
	public Alumno() {
		
	}
	
	public Alumno(int codigo, String nombre, int nota1, int nota2, int nota3) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNota1() {
		return nota1;
	}
	public void setNota1(int nota1) {
		this.nota1 = nota1;
	}
	public int getNota2() {
		return nota2;
	}
	public void setNota2(int nota2) {
		this.nota2 = nota2;
	}
	public int getNota3() {
		return nota3;
	}
	public void setNota3(int nota3) {
		this.nota3 = nota3;
	}
	
	//User Method
	public double Average() {
		return (nota1 + nota2 + nota3) / 3.0;
	}
	
	public String Condition() {
		if(Average()>= 10.5) {
			return "Approved" ;
		}else {
			return "Disapproved";
		}
	}
}
