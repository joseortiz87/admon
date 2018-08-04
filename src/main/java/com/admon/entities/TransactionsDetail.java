package com.admon.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the transactions_detail database table.
 * 
 */
@Entity
@Table(name="transactions_detail")
@NamedQuery(name="TransactionsDetail.findAll", query="SELECT t FROM TransactionsDetail t")
public class TransactionsDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TransactionsDetailPK id;

	private double descuento;

	private double importe;

	private double iva;

	@Column(name="precio_unitario")
	private double precioUnitario;

	private double total;

	//bi-directional many-to-one association to Inventory
	@ManyToOne
	@JoinColumn(name="idinventories")
	private Inventory inventory;

	//bi-directional many-to-one association to Transaction
	@ManyToOne
	@JoinColumn(name="idtransaction")
	private Transaction transaction;

	public TransactionsDetail() {
	}

	public TransactionsDetailPK getId() {
		return this.id;
	}

	public void setId(TransactionsDetailPK id) {
		this.id = id;
	}

	public double getDescuento() {
		return this.descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public double getImporte() {
		return this.importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public double getIva() {
		return this.iva;
	}

	public void setIva(double iva) {
		this.iva = iva;
	}

	public double getPrecioUnitario() {
		return this.precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public double getTotal() {
		return this.total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Inventory getInventory() {
		return this.inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	public Transaction getTransaction() {
		return this.transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

}