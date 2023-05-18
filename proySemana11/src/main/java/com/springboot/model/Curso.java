package com.springboot.model;

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
@Table(name="curso")
public class Curso {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	@Column
	private int idcur;
	
	@Column
	private String nomcur;
	
	@Column 
	private int crecur;
	
	@Column 
	private String descur;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idcat")
	private Categoria categoria;

	public int getIdcur() {
		return idcur;
	}

	public void setIdcur(int idcur) {
		this.idcur = idcur;
	}

	public String getNomcur() {
		return nomcur;
	}

	public void setNomcur(String nomcur) {
		this.nomcur = nomcur;
	}

	public int getCrecur() {
		return crecur;
	}

	public void setCrecur(int crecur) {
		this.crecur = crecur;
	}

	public String getDescur() {
		return descur;
	}

	public void setDescur(String descur) {
		this.descur = descur;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	} 
	
	
}
