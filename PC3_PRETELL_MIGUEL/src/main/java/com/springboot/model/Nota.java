package com.springboot.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="nota")
public class Nota {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idnota;
	
	@Column 
	private int calificacion;

	@Column 
	private Date fecha_examen;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="asignatura_id")
	private Asignatura asignatura;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="alumno_id")
	private Alumno alumno;

	public int getIdnota() {
		return idnota;
	}

	public void setIdnota(int idnota) {
		this.idnota = idnota;
	}

	public int getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}

	public Date getFecha_examen() {
		return fecha_examen;
	}

	public void setFecha_examen(Date fecha_examen) {
		this.fecha_examen = fecha_examen;
	}

	public Asignatura getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	
	
}
