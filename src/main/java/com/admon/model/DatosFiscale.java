package com.admon.model;

import java.io.Serializable;

public class DatosFiscale implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2070898953108192326L;
	
	private int id;

	private String razonSocial;

	private String rfc;

	private Address address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
