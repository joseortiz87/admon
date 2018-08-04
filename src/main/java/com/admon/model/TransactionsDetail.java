package com.admon.model;

import java.io.Serializable;

public class TransactionsDetail implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6060489654441848295L;
	
	private TransactionsDetailPK id;

	private double descuento;

	private double importe;

	private double iva;

	private double precioUnitario;

	private double total;

	private Inventory inventory;

	public TransactionsDetailPK getId() {
		return id;
	}

	public void setId(TransactionsDetailPK id) {
		this.id = id;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public double getIva() {
		return iva;
	}

	public void setIva(double iva) {
		this.iva = iva;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
}
