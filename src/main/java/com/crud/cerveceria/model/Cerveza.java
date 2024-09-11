package com.crud.cerveceria.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cervezas")
public class Cerveza {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="nombre",nullable = false, length = 50)
	private String nombreCerveza;
	@Column(name="tipo",nullable = false, length = 30)
	private String tipoCerveza;
	@Column(name="grado alcoholico", nullable=false)
	private Double gradoAlcoholico;
	@Column(name="precioLitro", nullable = true)
	private Double precioPorLitro;
	
	public Cerveza(){}

	public Cerveza(Long id, String nombreCerveza, String tipoCerveza, Double gradoAlcoholico, Double precioPorLitro) {
		super();
		this.id = id;
		this.nombreCerveza = nombreCerveza;
		this.tipoCerveza = tipoCerveza;
		this.gradoAlcoholico = gradoAlcoholico;
		this.precioPorLitro = precioPorLitro;
	}

	public Cerveza(String nombreCerveza, String tipoCerveza, Double gradoAlcoholico, Double precioPorLitro) {
		super();
		this.nombreCerveza = nombreCerveza;
		this.tipoCerveza = tipoCerveza;
		this.gradoAlcoholico = gradoAlcoholico;
		this.precioPorLitro = precioPorLitro;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreCerveza() {
		return nombreCerveza;
	}

	public void setNombreCerveza(String nombreCerveza) {
		this.nombreCerveza = nombreCerveza;
	}

	public String getTipoCerveza() {
		return tipoCerveza;
	}

	public void setTipoCerveza(String tipoCerveza) {
		this.tipoCerveza = tipoCerveza;
	}

	public Double getGradoAlcoholico() {
		return gradoAlcoholico;
	}

	public void setGradoAlcoholico(Double gradoAlcoholico) {
		this.gradoAlcoholico = gradoAlcoholico;
	}

	public Double getPrecioPorLitro() {
		return precioPorLitro;
	}

	public void setPrecioPorLitro(Double precioPorLitro) {
		this.precioPorLitro = precioPorLitro;
	}

	@Override
	public String toString() {
		return "Cerveza [id=" + id + ", nombreCerveza=" + nombreCerveza + ", tipoCerveza=" + tipoCerveza
				+ ", gradoAlcoholico=" + gradoAlcoholico + ", precioPorLitro=" + precioPorLitro + "]";
	}

	
	

}
