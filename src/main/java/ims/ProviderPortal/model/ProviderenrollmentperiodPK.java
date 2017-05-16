package ims.ProviderPortal.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the providerenrollmentperiod database table.
 * 
 */
@Embeddable
public class ProviderenrollmentperiodPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="PROV_BASE_NUMBER", unique=true, nullable=false, precision=10)
	private long provBaseNumber;

	@Column(name="PROV_ENROL_STAT_CD", unique=true, nullable=false, length=1)
	private String provEnrolStatCd;

	public ProviderenrollmentperiodPK() {
	}
	public long getProvBaseNumber() {
		return this.provBaseNumber;
	}
	public void setProvBaseNumber(long provBaseNumber) {
		this.provBaseNumber = provBaseNumber;
	}
	public String getProvEnrolStatCd() {
		return this.provEnrolStatCd;
	}
	public void setProvEnrolStatCd(String provEnrolStatCd) {
		this.provEnrolStatCd = provEnrolStatCd;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ProviderenrollmentperiodPK)) {
			return false;
		}
		ProviderenrollmentperiodPK castOther = (ProviderenrollmentperiodPK)other;
		return 
			(this.provBaseNumber == castOther.provBaseNumber)
			&& this.provEnrolStatCd.equals(castOther.provEnrolStatCd);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.provBaseNumber ^ (this.provBaseNumber >>> 32)));
		hash = hash * prime + this.provEnrolStatCd.hashCode();
		
		return hash;
	}
}