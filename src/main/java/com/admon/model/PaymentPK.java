package com.admon.model;

import java.io.Serializable;

public class PaymentPK implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 9074172617878396375L;
	private int idtransaction;

	private int item;

	public int getIdtransaction() {
		return idtransaction;
	}

	public void setIdtransaction(int idtransaction) {
		this.idtransaction = idtransaction;
	}

	public int getItem() {
		return item;
	}

	public void setItem(int item) {
		this.item = item;
	}
}
