package com.admon.model;

import java.io.Serializable;

public class Address implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3598450956973451029L;

	private int id;

	private String ciudad;

	private String direccion;

	private String estado;

	private int numeroExterior;

	private int numeroInterior;

	private String pais;

	private String zipcode;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getNumeroExterior() {
		return numeroExterior;
	}

	public void setNumeroExterior(int numeroExterior) {
		this.numeroExterior = numeroExterior;
	}

	public int getNumeroInterior() {
		return numeroInterior;
	}

	public void setNumeroInterior(int numeroInterior) {
		this.numeroInterior = numeroInterior;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
}
