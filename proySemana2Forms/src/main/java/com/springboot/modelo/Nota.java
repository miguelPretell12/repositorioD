package com.springboot.modelo;

import java.text.DecimalFormat;

public class Nota {
	private String nombre;
	private int nota1;
	private int nota2;
	private int nota3;
	
	public Nota() {
		
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
	
	public String promedioNota() {
		double prom = (this.nota1 + this.nota2 + this.nota3)/3.0;
		DecimalFormat df = new DecimalFormat("#.00");
		String promT = df.format(prom);
		return promT;
	}
	
}
