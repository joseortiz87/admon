package com.admon.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the negocios database table.
 * 
 */
@Entity
@Table(name="negocios")
@NamedQuery(name="Negocio.findAll", query="SELECT n FROM Negocio n")
public class Negocio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private String descripcion;

	@Lob
	private String logo;

	private String nombre;

	//bi-directional many-to-many association to DatosFiscale
	@ManyToMany
	@JoinTable(
		name="datosfiscalesxnegocio"
		, joinColumns={
			@JoinColumn(name="idnegocio")
			}
		, inverseJoinColumns={
			@JoinColumn(name="iddatosfiscales")
			}
		)
	private List<DatosFiscale> datosFiscales;

	//bi-directional many-to-one association to Sucursale
	@OneToMany(mappedBy="negocio")
	private List<Sucursale> sucursales;

	public Negocio() {
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

	public String getLogo() {
		return this.logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<DatosFiscale> getDatosFiscales() {
		return this.datosFiscales;
	}

	public void setDatosFiscales(List<DatosFiscale> datosFiscales) {
		this.datosFiscales = datosFiscales;
	}

	public List<Sucursale> getSucursales() {
		return this.sucursales;
	}

	public void setSucursales(List<Sucursale> sucursales) {
		this.sucursales = sucursales;
	}

	public Sucursale addSucursale(Sucursale sucursale) {
		getSucursales().add(sucursale);
		sucursale.setNegocio(this);

		return sucursale;
	}

	public Sucursale removeSucursale(Sucursale sucursale) {
		getSucursales().remove(sucursale);
		sucursale.setNegocio(null);

		return sucursale;
	}

}