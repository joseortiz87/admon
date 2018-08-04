package com.admon.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the transactions database table.
 * 
 */
@Entity
@Table(name="transactions")
@NamedQuery(name="Transaction.findAll", query="SELECT t FROM Transaction t")
public class Transaction implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="descuento_total")
	private double descuentoTotal;

	@Column(name="importe_total")
	private double importeTotal;

	private double iva;

	@Temporal(TemporalType.TIMESTAMP)
	private Date timestamp;

	private double total;

	//bi-directional many-to-one association to Payment
	@OneToMany(mappedBy="transaction")
	private List<Payment> payments;

	//bi-directional many-to-one association to CortesCaja
	@ManyToOne
	@JoinColumn(name="idcortecaja")
	private CortesCaja cortesCaja;

	//bi-directional many-to-one association to Sucursale
	@ManyToOne
	@JoinColumn(name="idsucursal")
	private Sucursale sucursale;

	//bi-directional many-to-one association to TransactionsDetail
	@OneToMany(mappedBy="transaction")
	private List<TransactionsDetail> transactionsDetails;

	public Transaction() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getDescuentoTotal() {
		return this.descuentoTotal;
	}

	public void setDescuentoTotal(double descuentoTotal) {
		this.descuentoTotal = descuentoTotal;
	}

	public double getImporteTotal() {
		return this.importeTotal;
	}

	public void setImporteTotal(double importeTotal) {
		this.importeTotal = importeTotal;
	}

	public double getIva() {
		return this.iva;
	}

	public void setIva(double iva) {
		this.iva = iva;
	}

	public Date getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public double getTotal() {
		return this.total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public List<Payment> getPayments() {
		return this.payments;
	}

	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}

	public Payment addPayment(Payment payment) {
		getPayments().add(payment);
		payment.setTransaction(this);

		return payment;
	}

	public Payment removePayment(Payment payment) {
		getPayments().remove(payment);
		payment.setTransaction(null);

		return payment;
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

	public List<TransactionsDetail> getTransactionsDetails() {
		return this.transactionsDetails;
	}

	public void setTransactionsDetails(List<TransactionsDetail> transactionsDetails) {
		this.transactionsDetails = transactionsDetails;
	}

	public TransactionsDetail addTransactionsDetail(TransactionsDetail transactionsDetail) {
		getTransactionsDetails().add(transactionsDetail);
		transactionsDetail.setTransaction(this);

		return transactionsDetail;
	}

	public TransactionsDetail removeTransactionsDetail(TransactionsDetail transactionsDetail) {
		getTransactionsDetails().remove(transactionsDetail);
		transactionsDetail.setTransaction(null);

		return transactionsDetail;
	}

}