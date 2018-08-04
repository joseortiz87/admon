package com.admon.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the addresses database table.
 * 
 */
@Entity
@Table(name="addresses")
@NamedQuery(name="Address.findAll", query="SELECT a FROM Address a")
public class Address implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String ciudad;

	private String direccion;

	private String estado;

	@Column(name="numero_exterior")
	private int numeroExterior;

	@Column(name="numero_interior")
	private int numeroInterior;

	private String pais;

	private String zipcode;

	//bi-directional many-to-one association to DatosFiscale
	@OneToMany(mappedBy="address")
	private List<DatosFiscale> datosFiscales;

	//bi-directional many-to-one association to Sucursale
	@OneToMany(mappedBy="address")
	private List<Sucursale> sucursales;

	public Address() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCiudad() {
		return this.ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getNumeroExterior() {
		return this.numeroExterior;
	}

	public void setNumeroExterior(int numeroExterior) {
		this.numeroExterior = numeroExterior;
	}

	public int getNumeroInterior() {
		return this.numeroInterior;
	}

	public void setNumeroInterior(int numeroInterior) {
		this.numeroInterior = numeroInterior;
	}

	public String getPais() {
		return this.pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public List<DatosFiscale> getDatosFiscales() {
		return this.datosFiscales;
	}

	public void setDatosFiscales(List<DatosFiscale> datosFiscales) {
		this.datosFiscales = datosFiscales;
	}

	public DatosFiscale addDatosFiscale(DatosFiscale datosFiscale) {
		getDatosFiscales().add(datosFiscale);
		datosFiscale.setAddress(this);

		return datosFiscale;
	}

	public DatosFiscale removeDatosFiscale(DatosFiscale datosFiscale) {
		getDatosFiscales().remove(datosFiscale);
		datosFiscale.setAddress(null);

		return datosFiscale;
	}

	public List<Sucursale> getSucursales() {
		return this.sucursales;
	}

	public void setSucursales(List<Sucursale> sucursales) {
		this.sucursales = sucursales;
	}

	public Sucursale addSucursale(Sucursale sucursale) {
		getSucursales().add(sucursale);
		sucursale.setAddress(this);

		return sucursale;
	}

	public Sucursale removeSucursale(Sucursale sucursale) {
		getSucursales().remove(sucursale);
		sucursale.setAddress(null);

		return sucursale;
	}

}