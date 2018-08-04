package com.admon.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the payments database table.
 * 
 */
@Embeddable
public class PaymentPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private int idtransaction;

	private int item;

	public PaymentPK() {
	}
	public int getIdtransaction() {
		return this.idtransaction;
	}
	public void setIdtransaction(int idtransaction) {
		this.idtransaction = idtransaction;
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
		if (!(other instanceof PaymentPK)) {
			return false;
		}
		PaymentPK castOther = (PaymentPK)other;
		return 
			(this.idtransaction == castOther.idtransaction)
			&& (this.item == castOther.item);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idtransaction;
		hash = hash * prime + this.item;
		
		return hash;
	}
}