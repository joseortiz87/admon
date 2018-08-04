package com.admon.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the sucursales database table.
 * 
 */
@Entity
@Table(name="sucursales")
@NamedQuery(name="Sucursale.findAll", query="SELECT s FROM Sucursale s")
public class Sucursale implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String descripcion;

	private String nombre;

	//bi-directional many-to-one association to Caja
	@OneToMany(mappedBy="sucursale")
	private List<Caja> cajas;

	//bi-directional many-to-one association to CortesCaja
	@OneToMany(mappedBy="sucursale")
	private List<CortesCaja> cortesCajas;

	//bi-directional many-to-one association to Product
	@OneToMany(mappedBy="sucursale")
	private List<Product> products;

	//bi-directional many-to-one association to Address
	@ManyToOne
	@JoinColumn(name="idaddress")
	private Address address;

	//bi-directional many-to-one association to Negocio
	@ManyToOne
	@JoinColumn(name="idnegocio")
	private Negocio negocio;

	//bi-directional many-to-one association to Transaction
	@OneToMany(mappedBy="sucursale")
	private List<Transaction> transactions;

	//bi-directional many-to-one association to User
	@OneToMany(mappedBy="sucursale")
	private List<User> users;

	public Sucursale() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Caja> getCajas() {
		return this.cajas;
	}

	public void setCajas(List<Caja> cajas) {
		this.cajas = cajas;
	}

	public Caja addCaja(Caja caja) {
		getCajas().add(caja);
		caja.setSucursale(this);

		return caja;
	}

	public Caja removeCaja(Caja caja) {
		getCajas().remove(caja);
		caja.setSucursale(null);

		return caja;
	}

	public List<CortesCaja> getCortesCajas() {
		return this.cortesCajas;
	}

	public void setCortesCajas(List<CortesCaja> cortesCajas) {
		this.cortesCajas = cortesCajas;
	}

	public CortesCaja addCortesCaja(CortesCaja cortesCaja) {
		getCortesCajas().add(cortesCaja);
		cortesCaja.setSucursale(this);

		return cortesCaja;
	}

	public CortesCaja removeCortesCaja(CortesCaja cortesCaja) {
		getCortesCajas().remove(cortesCaja);
		cortesCaja.setSucursale(null);

		return cortesCaja;
	}

	public List<Product> getProducts() {
		return this.products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Product addProduct(Product product) {
		getProducts().add(product);
		product.setSucursale(this);

		return product;
	}

	public Product removeProduct(Product product) {
		getProducts().remove(product);
		product.setSucursale(null);

		return product;
	}

	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Negocio getNegocio() {
		return this.negocio;
	}

	public void setNegocio(Negocio negocio) {
		this.negocio = negocio;
	}

	public List<Transaction> getTransactions() {
		return this.transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

	public Transaction addTransaction(Transaction transaction) {
		getTransactions().add(transaction);
		transaction.setSucursale(this);

		return transaction;
	}

	public Transaction removeTransaction(Transaction transaction) {
		getTransactions().remove(transaction);
		transaction.setSucursale(null);

		return transaction;
	}

	public List<User> getUsers() {
		return this.users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public User addUser(User user) {
		getUsers().add(user);
		user.setSucursale(this);

		return user;
	}

	public User removeUser(User user) {
		getUsers().remove(user);
		user.setSucursale(null);

		return user;
	}

}