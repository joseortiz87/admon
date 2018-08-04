package com.admon.model;

import java.io.Serializable;
import java.util.Date;

import com.admon.model.CortesCaja;
import com.admon.model.Sucursale;

public class Caja implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -623650614950917869L;

	private int id;

	private String concepto;

	private double monto;

	private Date timestamp;
	
	private CortesCaja cortesCaja;
	
	private Sucursale sucursale;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
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
}
