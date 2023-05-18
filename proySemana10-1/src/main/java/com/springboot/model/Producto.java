package com.springboot.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="producto")

public class Producto {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column
	private int idpro;
	
	@Column
	private String nompro;
	
	@Column
	private Double prepro;
	
	@Column
	private int stkpro;
	
	@Column 
	private Date fvcpro;
	
	@Column
	private String despro;

	public int getIdpro() {
		return idpro;
	}

	public void setIdpro(int idpro) {
		this.idpro = idpro;
	}

	public String getNompro() {
		return nompro;
	}

	public void setNompro(String nompro) {
		this.nompro = nompro;
	}

	public Double getPrepro() {
		return prepro;
	}

	public void setPrepro(Double prepo) {
		this.prepro = prepo;
	}

	public int getStkpro() {
		return stkpro;
	}

	public void setStkpro(int stkpro) {
		this.stkpro = stkpro;
	}

	public Date getFvcpro() {
		return fvcpro;
	}

	public void setFvcpro(Date fvcpro) {
		this.fvcpro = fvcpro;
	}

	public String getDespro() {
		return despro;
	}

	public void setDespro(String despro) {
		this.despro = despro;
	}
	
	
}
