package com.admon.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Transaction implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6235144784460635131L;
	
	private int id;

	private double descuentoTotal;

	private double importeTotal;

	private double iva;
	
	private Date timestamp;

	private double total;

	private CortesCaja cortesCaja;

	private Sucursale sucursale;

	private List<TransactionsDetail> transactionsDetails;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getDescuentoTotal() {
		return descuentoTotal;
	}

	public void setDescuentoTotal(double descuentoTotal) {
		this.descuentoTotal = descuentoTotal;
	}

	public double getImporteTotal() {
		return importeTotal;
	}

	public void setImporteTotal(double importeTotal) {
		this.importeTotal = importeTotal;
	}

	public double getIva() {
		return iva;
	}

	public void setIva(double iva) {
		this.iva = iva;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public CortesCaja getCortesCaja() {
		return cortesCaja;
	}

	public void setCortesCaja(CortesCaja cortesCaja) {
		this.cortesCaja = cortesCaja;
	}

	public Sucursale getSucursale() {
		return sucursale;
	}

	public void setSucursale(Sucursale sucursale) {
		this.sucursale = sucursale;
	}

	public List<TransactionsDetail> getTransactionsDetails() {
		return transactionsDetails;
	}

	public void setTransactionsDetails(List<TransactionsDetail> transactionsDetails) {
		this.transactionsDetails = transactionsDetails;
	}
}
