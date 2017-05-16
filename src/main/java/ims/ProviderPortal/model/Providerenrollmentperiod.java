package ims.ProviderPortal.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the providerenrollmentperiod database table.
 * 
 */
@Entity
@Table(name="providerenrollmentperiod")
public class Providerenrollmentperiod implements Serializable {
	private static final long serialVersionUID = 1L;
	private ProviderenrollmentperiodPK id;
	private String clerkIdentification;
	private Date dateOfLastTrans;
	private Date provSpecCertDate;
	private String provSpecCertNum;

	public Providerenrollmentperiod() {
	}


	@EmbeddedId
	public ProviderenrollmentperiodPK getId() {
		return this.id;
	}

	public void setId(ProviderenrollmentperiodPK id) {
		this.id = id;
	}


	@Column(name="CLERK_IDENTIFICATION", length=8)
	public String getClerkIdentification() {
		return this.clerkIdentification;
	}

	public void setClerkIdentification(String clerkIdentification) {
		this.clerkIdentification = clerkIdentification;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="DATE_OF_LAST_TRANS")
	public Date getDateOfLastTrans() {
		return this.dateOfLastTrans;
	}

	public void setDateOfLastTrans(Date dateOfLastTrans) {
		this.dateOfLastTrans = dateOfLastTrans;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="PROV_SPEC_CERT_DATE")
	public Date getProvSpecCertDate() {
		return this.provSpecCertDate;
	}

	public void setProvSpecCertDate(Date provSpecCertDate) {
		this.provSpecCertDate = provSpecCertDate;
	}


	@Column(name="PROV_SPEC_CERT_NUM", length=6)
	public String getProvSpecCertNum() {
		return this.provSpecCertNum;
	}

	public void setProvSpecCertNum(String provSpecCertNum) {
		this.provSpecCertNum = provSpecCertNum;
	}

}