package com.admon.model;

import java.io.Serializable;

public class Sucursale implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4964435853534729577L;

	private int id;

	private String descripcion;

	private String nombre;

	private Address address;

	private Negocio negocio;

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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Negocio getNegocio() {
		return negocio;
	}

	public void setNegocio(Negocio negocio) {
		this.negocio = negocio;
	}
}
