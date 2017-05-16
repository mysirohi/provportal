package ims.ProviderPortal.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the providergroup database table.
 * 
 */
@Embeddable
public class ProvidergroupPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	private long provBaseNumber;
	private long provGroup;

	public ProvidergroupPK() {
	}

	@Column(name="PROV_BASE_NUMBER", unique=true, nullable=false, precision=10)
	public long getProvBaseNumber() {
		return this.provBaseNumber;
	}
	public void setProvBaseNumber(long provBaseNumber) {
		this.provBaseNumber = provBaseNumber;
	}

	@Column(name="PROV_GROUP", unique=true, nullable=false, precision=10)
	public long getProvGroup() {
		return this.provGroup;
	}
	public void setProvGroup(long provGroup) {
		this.provGroup = provGroup;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ProvidergroupPK)) {
			return false;
		}
		ProvidergroupPK castOther = (ProvidergroupPK)other;
		return 
			(this.provBaseNumber == castOther.provBaseNumber)
			&& (this.provGroup == castOther.provGroup);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.provBaseNumber ^ (this.provBaseNumber >>> 32)));
		hash = hash * prime + ((int) (this.provGroup ^ (this.provGroup >>> 32)));
		
		return hash;
	}
}