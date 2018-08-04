package com.admon.model;

import java.io.Serializable;
import java.util.Date;

public class Product implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2667915856767564122L;
	
	private int id;

	private String claveProducto;

	private String descripcion;

	private int existencias;

	private int idproductosat;

	private int idunidad;

	private double precioLista;
	
	private Date timestamp;
	
	private ProductsCategory productsCategory;

	private Sucursale sucursale;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClaveProducto() {
		return claveProducto;
	}

	public void setClaveProducto(String claveProducto) {
		this.claveProducto = claveProducto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getExistencias() {
		return existencias;
	}

	public void setExistencias(int existencias) {
		this.existencias = existencias;
	}

	public int getIdproductosat() {
		return idproductosat;
	}

	public void setIdproductosat(int idproductosat) {
		this.idproductosat = idproductosat;
	}

	public int getIdunidad() {
		return idunidad;
	}

	public void setIdunidad(int idunidad) {
		this.idunidad = idunidad;
	}

	public double getPrecioLista() {
		return precioLista;
	}

	public void setPrecioLista(double precioLista) {
		this.precioLista = precioLista;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public ProductsCategory getProductsCategory() {
		return productsCategory;
	}

	public void setProductsCategory(ProductsCategory productsCategory) {
		this.productsCategory = productsCategory;
	}

	public Sucursale getSucursale() {
		return sucursale;
	}

	public void setSucursale(Sucursale sucursale) {
		this.sucursale = sucursale;
	}	
}
