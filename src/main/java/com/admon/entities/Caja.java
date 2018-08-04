package com.admon.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the caja database table.
 * 
 */
@Entity
@NamedQuery(name="Caja.findAll", query="SELECT c FROM Caja c")
public class Caja implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String concepto;

	private double monto;

	@Temporal(TemporalType.TIMESTAMP)
	private Date timestamp;

	//bi-directional many-to-one association to CortesCaja
	@ManyToOne
	@JoinColumn(name="idcortecaja")
	private CortesCaja cortesCaja;

	//bi-directional many-to-one association to Sucursale
	@ManyToOne
	@JoinColumn(name="idsucursal")
	private Sucursale sucursale;

	public Caja() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getConcepto() {
		return this.concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public double getMonto() {
		return this.monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public Date getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public CortesCaja getCortesCaja() {
		return this.cortesCaja;
	}

	public void setCortesCaja(CortesCaja cortesCaja) {
		this.cortesCaja = cortesCaja;
	}

	public Sucursale getSucursale() {
		return this.sucursale;
	}

	public void setSucursale(Sucursale sucursale) {
		this.sucursale = sucursale;
	}

}