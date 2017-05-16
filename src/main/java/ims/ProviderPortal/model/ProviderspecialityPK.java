package ims.ProviderPortal.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the providerspeciality database table.
 * 
 */
@Embeddable
public class ProviderspecialityPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	private long provBaseNumber;
	private String provSpecCode;

	public ProviderspecialityPK() {
	}

	@Column(name="PROV_BASE_NUMBER", unique=true, nullable=false, precision=10)
	public long getProvBaseNumber() {
		return this.provBaseNumber;
	}
	public void setProvBaseNumber(long provBaseNumber) {
		this.provBaseNumber = provBaseNumber;
	}

	@Column(name="PROV_SPEC_CODE", unique=true, nullable=false, length=2)
	public String getProvSpecCode() {
		return this.provSpecCode;
	}
	public void setProvSpecCode(String provSpecCode) {
		this.provSpecCode = provSpecCode;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ProviderspecialityPK)) {
			return false;
		}
		ProviderspecialityPK castOther = (ProviderspecialityPK)other;
		return 
			(this.provBaseNumber == castOther.provBaseNumber)
			&& this.provSpecCode.equals(castOther.provSpecCode);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.provBaseNumber ^ (this.provBaseNumber >>> 32)));
		hash = hash * prime + this.provSpecCode.hashCode();
		
		return hash;
	}
}