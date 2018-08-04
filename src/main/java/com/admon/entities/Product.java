package com.admon.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the products database table.
 * 
 */
@Entity
@Table(name="products")
@NamedQuery(name="Product.findAll", query="SELECT p FROM Product p")
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="clave_producto")
	private String claveProducto;

	private String descripcion;

	private int existencias;

	private int idproductosat;

	private int idunidad;

	@Column(name="precio_lista")
	private double precioLista;

	@Temporal(TemporalType.DATE)
	private Date timestamp;

	//bi-directional many-to-one association to Discount
	@OneToMany(mappedBy="product")
	private List<Discount> discounts;

	//bi-directional many-to-one association to Inventory
	@OneToMany(mappedBy="product")
	private List<Inventory> inventories;

	//bi-directional many-to-one association to ProductsCategory
	@ManyToOne
	@JoinColumn(name="idproductcategory")
	private ProductsCategory productsCategory;

	//bi-directional many-to-one association to Sucursale
	@ManyToOne
	@JoinColumn(name="idsucursal")
	private Sucursale sucursale;

	public Product() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClaveProducto() {
		return this.claveProducto;
	}

	public void setClaveProducto(String claveProducto) {
		this.claveProducto = claveProducto;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getExistencias() {
		return this.existencias;
	}

	public void setExistencias(int existencias) {
		this.existencias = existencias;
	}

	public int getIdproductosat() {
		return this.idproductosat;
	}

	public void setIdproductosat(int idproductosat) {
		this.idproductosat = idproductosat;
	}

	public int getIdunidad() {
		return this.idunidad;
	}

	public void setIdunidad(int idunidad) {
		this.idunidad = idunidad;
	}

	public double getPrecioLista() {
		return this.precioLista;
	}

	public void setPrecioLista(double precioLista) {
		this.precioLista = precioLista;
	}

	public Date getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public List<Discount> getDiscounts() {
		return this.discounts;
	}

	public void setDiscounts(List<Discount> discounts) {
		this.discounts = discounts;
	}

	public Discount addDiscount(Discount discount) {
		getDiscounts().add(discount);
		discount.setProduct(this);

		return discount;
	}

	public Discount removeDiscount(Discount discount) {
		getDiscounts().remove(discount);
		discount.setProduct(null);

		return discount;
	}

	public List<Inventory> getInventories() {
		return this.inventories;
	}

	public void setInventories(List<Inventory> inventories) {
		this.inventories = inventories;
	}

	public Inventory addInventory(Inventory inventory) {
		getInventories().add(inventory);
		inventory.setProduct(this);

		return inventory;
	}

	public Inventory removeInventory(Inventory inventory) {
		getInventories().remove(inventory);
		inventory.setProduct(null);

		return inventory;
	}

	public ProductsCategory getProductsCategory() {
		return this.productsCategory;
	}

	public void setProductsCategory(ProductsCategory productsCategory) {
		this.productsCategory = productsCategory;
	}

	public Sucursale getSucursale() {
		return this.sucursale;
	}

	public void setSucursale(Sucursale sucursale) {
		this.sucursale = sucursale;
	}

}