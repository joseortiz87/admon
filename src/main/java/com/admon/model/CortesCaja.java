package com.admon.model;

import java.io.Serializable;
import java.util.Date;

public class CortesCaja implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7937623753304952799L;
	private int id;

	private Date timestamp;

	private double totalCajaActual;

	private double totalCajaAnterior;

	private double totalEntradas;

	private double totalSalidas;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public double getTotalCajaActual() {
		return totalCajaActual;
	}

	public void setTotalCajaActual(double totalCajaActual) {
		this.totalCajaActual = totalCajaActual;
	}

	public double getTotalCajaAnterior() {
		return totalCajaAnterior;
	}

	public void setTotalCajaAnterior(double totalCajaAnterior) {
		this.totalCajaAnterior = totalCajaAnterior;
	}

	public double getTotalEntradas() {
		return totalEntradas;
	}

	public void setTotalEntradas(double totalEntradas) {
		this.totalEntradas = totalEntradas;
	}

	public double getTotalSalidas() {
		return totalSalidas;
	}

	public void setTotalSalidas(double totalSalidas) {
		this.totalSalidas = totalSalidas;
	}
	
}
