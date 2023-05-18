package com.springboot.models;

public class Obrero {
	private String nombre;
	private double tarifa;
	private int horas;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getTarifa() {
		return tarifa;
	}
	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}
	public int getHoras() {
		return horas;
	}
	public void setHoras(int horas) {
		this.horas = horas;
	}

	// user methods
	public double SalarioBruto() {
		return tarifa * horas;
	}
	
	public double Desct() {
		if(SalarioBruto() <= 930) {
			return SalarioBruto() * 0.1;
		} else if(SalarioBruto() > 930 && SalarioBruto() <= 2500) {
			return SalarioBruto() * 0.12;
		} else {
			return SalarioBruto()*0.15;
		}
	}
}
