package com.admon.model;

import java.io.Serializable;
import java.util.Date;

public class Payment implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3831112935814368771L;
	
	private PaymentPK id;

	private String autorizacion;

	private String formaPago;

	private double importe;

	private Date timestamp;

	private Transaction transaction;

	public PaymentPK getId() {
		return id;
	}

	public void setId(PaymentPK id) {
		this.id = id;
	}

	public String getAutorizacion() {
		return autorizacion;
	}

	public void setAutorizacion(String autorizacion) {
		this.autorizacion = autorizacion;
	}

	public String getFormaPago() {
		return formaPago;
	}

	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}
}
