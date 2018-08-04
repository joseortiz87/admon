package com.admon.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the inventories database table.
 * 
 */
@Entity
@Table(name="inventories")
@NamedQuery(name="Inventory.findAll", query="SELECT i FROM Inventory i")
public class Inventory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private int cantidad;

	@Column(name="precio_compra")
	private double precioCompra;

	@Temporal(TemporalType.DATE)
	private Date timestamp;

	//bi-directional many-to-one association to Product
	@ManyToOne
	@JoinColumn(name="idproducto")
	private Product product;

	//bi-directional many-to-one association to TransactionsDetail
	@OneToMany(mappedBy="inventory")
	private List<TransactionsDetail> transactionsDetails;

	public Inventory() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecioCompra() {
		return this.precioCompra;
	}

	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}

	public Date getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public List<TransactionsDetail> getTransactionsDetails() {
		return this.transactionsDetails;
	}

	public void setTransactionsDetails(List<TransactionsDetail> transactionsDetails) {
		this.transactionsDetails = transactionsDetails;
	}

	public TransactionsDetail addTransactionsDetail(TransactionsDetail transactionsDetail) {
		getTransactionsDetails().add(transactionsDetail);
		transactionsDetail.setInventory(this);

		return transactionsDetail;
	}

	public TransactionsDetail removeTransactionsDetail(TransactionsDetail transactionsDetail) {
		getTransactionsDetails().remove(transactionsDetail);
		transactionsDetail.setInventory(null);

		return transactionsDetail;
	}

}