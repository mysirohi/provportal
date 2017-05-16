package ims.ProviderPortal.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the providercertification database table.
 * 
 */
@Embeddable
public class ProvidercertificationPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="PROV_BASE_NUMBER", unique=true, nullable=false, precision=10)
	private long provBaseNumber;

	@Column(name="PROV_CERTIF_CD", unique=true, nullable=false, length=1)
	private String provCertifCd;

	public ProvidercertificationPK() {
	}
	public long getProvBaseNumber() {
		return this.provBaseNumber;
	}
	public void setProvBaseNumber(long provBaseNumber) {
		this.provBaseNumber = provBaseNumber;
	}
	public String getProvCertifCd() {
		return this.provCertifCd;
	}
	public void setProvCertifCd(String provCertifCd) {
		this.provCertifCd = provCertifCd;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ProvidercertificationPK)) {
			return false;
		}
		ProvidercertificationPK castOther = (ProvidercertificationPK)other;
		return 
			(this.provBaseNumber == castOther.provBaseNumber)
			&& this.provCertifCd.equals(castOther.provCertifCd);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.provBaseNumber ^ (this.provBaseNumber >>> 32)));
		hash = hash * prime + this.provCertifCd.hashCode();
		
		return hash;
	}
}