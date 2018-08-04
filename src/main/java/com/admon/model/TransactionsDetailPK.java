package com.admon.model;

import java.io.Serializable;

public class TransactionsDetailPK implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7481774031832174186L;
	private int idtransaction;

	private int idinventories;

	private int item;

	public int getIdtransaction() {
		return idtransaction;
	}

	public void setIdtransaction(int idtransaction) {
		this.idtransaction = idtransaction;
	}

	public int getIdinventories() {
		return idinventories;
	}

	public void setIdinventories(int idinventories) {
		this.idinventories = idinventories;
	}

	public int getItem() {
		return item;
	}

	public void setItem(int item) {
		this.item = item;
	}
}
