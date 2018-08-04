package com.admon.model;

import java.io.Serializable;
import java.util.List;

public class Negocio implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8839398211843369903L;
	private int id;

	private String descripcion;
	
	private String logo;

	private String nombre;
	
	private List<DatosFiscale> datosFiscales;
	
	private List<Sucursale> sucursales;

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

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<DatosFiscale> getDatosFiscales() {
		return datosFiscales;
	}

	public void setDatosFiscales(List<DatosFiscale> datosFiscales) {
		this.datosFiscales = datosFiscales;
	}

	public List<Sucursale> getSucursales() {
		return sucursales;
	}

	public void setSucursales(List<Sucursale> sucursales) {
		this.sucursales = sucursales;
	}
}
