package com.admon.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the transactions_detail database table.
 * 
 */
@Embeddable
public class TransactionsDetailPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private int idtransaction;

	@Column(insertable=false, updatable=false)
	private int idinventories;

	private int item;

	public TransactionsDetailPK() {
	}
	public int getIdtransaction() {
		return this.idtransaction;
	}
	public void setIdtransaction(int idtransaction) {
		this.idtransaction = idtransaction;
	}
	public int getIdinventories() {
		return this.idinventories;
	}
	public void setIdinventories(int idinventories) {
		this.idinventories = idinventories;
	}
	public int getItem() {
		return this.item;
	}
	public void setItem(int item) {
		this.item = item;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TransactionsDetailPK)) {
			return false;
		}
		TransactionsDetailPK castOther = (TransactionsDetailPK)other;
		return 
			(this.idtransaction == castOther.idtransaction)
			&& (this.idinventories == castOther.idinventories)
			&& (this.item == castOther.item);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idtransaction;
		hash = hash * prime + this.idinventories;
		hash = hash * prime + this.item;
		
		return hash;
	}
}