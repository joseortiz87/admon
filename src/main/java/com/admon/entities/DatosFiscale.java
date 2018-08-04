package com.admon.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the datos_fiscales database table.
 * 
 */
@Entity
@Table(name="datos_fiscales")
@NamedQuery(name="DatosFiscale.findAll", query="SELECT d FROM DatosFiscale d")
public class DatosFiscale implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="razon_social")
	private String razonSocial;

	private String rfc;

	//bi-directional many-to-one association to Address
	@ManyToOne
	@JoinColumn(name="idaddress")
	private Address address;

	//bi-directional many-to-many association to Negocio
	@ManyToMany(mappedBy="datosFiscales")
	private List<Negocio> negocios;

	public DatosFiscale() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRazonSocial() {
		return this.razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getRfc() {
		return this.rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Negocio> getNegocios() {
		return this.negocios;
	}

	public void setNegocios(List<Negocio> negocios) {
		this.negocios = negocios;
	}

}