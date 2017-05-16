package ims.ProviderPortal.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the provideraddress database table.
 * 
 */
@Embeddable
public class ProvideraddressPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="PROV_BASE_NUMBER", unique=true, nullable=false, precision=10)
	private long provBaseNumber;

	@Column(name="ADDRESS_NUMBER_IND", unique=true, nullable=false, length=1)
	private String addressNumberInd;

	public ProvideraddressPK() {
	}
	public long getProvBaseNumber() {
		return this.provBaseNumber;
	}
	public void setProvBaseNumber(long provBaseNumber) {
		this.provBaseNumber = provBaseNumber;
	}
	public String getAddressNumberInd() {
		return this.addressNumberInd;
	}
	public void setAddressNumberInd(String addressNumberInd) {
		this.addressNumberInd = addressNumberInd;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ProvideraddressPK)) {
			return false;
		}
		ProvideraddressPK castOther = (ProvideraddressPK)other;
		return 
			(this.provBaseNumber == castOther.provBaseNumber)
			&& this.addressNumberInd.equals(castOther.addressNumberInd);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.provBaseNumber ^ (this.provBaseNumber >>> 32)));
		hash = hash * prime + this.addressNumberInd.hashCode();
		
		return hash;
	}
}