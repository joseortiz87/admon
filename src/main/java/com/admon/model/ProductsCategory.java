package com.admon.model;

import java.io.Serializable;

public class ProductsCategory implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8983138075158649414L;
	private int id;

	private String descripcion;

	private String nombre;

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
}
