package ims.ProviderPortal.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the providerclaimtype database table.
 * 
 */
@Embeddable
public class ProviderclaimtypePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="PROV_BASE_NUMBER", unique=true, nullable=false, precision=10)
	private long provBaseNumber;

	@Temporal(TemporalType.DATE)
	@Column(name="BEGIN_CLM_TYPE_DT", unique=true, nullable=false)
	private java.util.Date beginClmTypeDt;

	@Temporal(TemporalType.DATE)
	@Column(name="END_CLM_TYPE_DT", unique=true, nullable=false)
	private java.util.Date endClmTypeDt;

	public ProviderclaimtypePK() {
	}
	public long getProvBaseNumber() {
		return this.provBaseNumber;
	}
	public void setProvBaseNumber(long provBaseNumber) {
		this.provBaseNumber = provBaseNumber;
	}
	public java.util.Date getBeginClmTypeDt() {
		return this.beginClmTypeDt;
	}
	public void setBeginClmTypeDt(java.util.Date beginClmTypeDt) {
		this.beginClmTypeDt = beginClmTypeDt;
	}
	public java.util.Date getEndClmTypeDt() {
		return this.endClmTypeDt;
	}
	public void setEndClmTypeDt(java.util.Date endClmTypeDt) {
		this.endClmTypeDt = endClmTypeDt;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ProviderclaimtypePK)) {
			return false;
		}
		ProviderclaimtypePK castOther = (ProviderclaimtypePK)other;
		return 
			(this.provBaseNumber == castOther.provBaseNumber)
			&& this.beginClmTypeDt.equals(castOther.beginClmTypeDt)
			&& this.endClmTypeDt.equals(castOther.endClmTypeDt);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.provBaseNumber ^ (this.provBaseNumber >>> 32)));
		hash = hash * prime + this.beginClmTypeDt.hashCode();
		hash = hash * prime + this.endClmTypeDt.hashCode();
		
		return hash;
	}
}