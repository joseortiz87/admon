package com.admon.model;

import java.io.Serializable;

public class Discount implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 202366728026184634L;
	private int id;

	private String descripcion;

	private String nombre;

	private double porcentage;

	private Product product;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPorcentage() {
		return porcentage;
	}

	public void setPorcentage(double porcentage) {
		this.porcentage = porcentage;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
}
