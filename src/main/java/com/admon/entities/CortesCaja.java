package com.admon.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the cortes_caja database table.
 * 
 */
@Entity
@Table(name="cortes_caja")
@NamedQuery(name="CortesCaja.findAll", query="SELECT c FROM CortesCaja c")
public class CortesCaja implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date timestamp;

	@Column(name="total_caja_actual")
	private double totalCajaActual;

	@Column(name="total_caja_anterior")
	private double totalCajaAnterior;

	@Column(name="total_entradas")
	private double totalEntradas;

	@Column(name="total_salidas")
	private double totalSalidas;

	//bi-directional many-to-one association to Caja
	@OneToMany(mappedBy="cortesCaja")
	private List<Caja> cajas;

	//bi-directional many-to-one association to Sucursale
	@ManyToOne
	@JoinColumn(name="idsucursal")
	private Sucursale sucursale;

	//bi-directional many-to-one association to Transaction
	@OneToMany(mappedBy="cortesCaja")
	private List<Transaction> transactions;

	public CortesCaja() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public double getTotalCajaActual() {
		return this.totalCajaActual;
	}

	public void setTotalCajaActual(double totalCajaActual) {
		this.totalCajaActual = totalCajaActual;
	}

	public double getTotalCajaAnterior() {
		return this.totalCajaAnterior;
	}

	public void setTotalCajaAnterior(double totalCajaAnterior) {
		this.totalCajaAnterior = totalCajaAnterior;
	}

	public double getTotalEntradas() {
		return this.totalEntradas;
	}

	public void setTotalEntradas(double totalEntradas) {
		this.totalEntradas = totalEntradas;
	}

	public double getTotalSalidas() {
		return this.totalSalidas;
	}

	public void setTotalSalidas(double totalSalidas) {
		this.totalSalidas = totalSalidas;
	}

	public List<Caja> getCajas() {
		return this.cajas;
	}

	public void setCajas(List<Caja> cajas) {
		this.cajas = cajas;
	}

	public Caja addCaja(Caja caja) {
		getCajas().add(caja);
		caja.setCortesCaja(this);

		return caja;
	}

	public Caja removeCaja(Caja caja) {
		getCajas().remove(caja);
		caja.setCortesCaja(null);

		return caja;
	}

	public Sucursale getSucursale() {
		return this.sucursale;
	}

	public void setSucursale(Sucursale sucursale) {
		this.sucursale = sucursale;
	}

	public List<Transaction> getTransactions() {
		return this.transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

	public Transaction addTransaction(Transaction transaction) {
		getTransactions().add(transaction);
		transaction.setCortesCaja(this);

		return transaction;
	}

	public Transaction removeTransaction(Transaction transaction) {
		getTransactions().remove(transaction);
		transaction.setCortesCaja(null);

		return transaction;
	}

}