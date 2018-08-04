package com.admon.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the discounts database table.
 * 
 */
@Entity
@Table(name="discounts")
@NamedQuery(name="Discount.findAll", query="SELECT d FROM Discount d")
public class Discount implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String descripcion;

	private String nombre;

	private double porcentage;

	//bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name="idproducto")
	private Product product;

	public Discount() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPorcentage() {
		return this.porcentage;
	}

	public void setPorcentage(double porcentage) {
		this.porcentage = porcentage;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}