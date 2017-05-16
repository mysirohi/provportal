package ims.ProviderPortal.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the providercertification database table.
 * 
 */
@Entity
@Table(name="providercertification")
public class Providercertification implements Serializable {
	private static final long serialVersionUID = 1L;
	private ProvidercertificationPK id;
	private String clerkIdentification;
	private Date dateOfLastTrans;
	private Date provCertifBegDt;
	private Date provCertifEndDt;

	public Providercertification() {
	}


	@EmbeddedId
	public ProvidercertificationPK getId() {
		return this.id;
	}

	public void setId(ProvidercertificationPK id) {
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
	@Column(name="PROV_CERTIF_BEG_DT")
	public Date getProvCertifBegDt() {
		return this.provCertifBegDt;
	}

	public void setProvCertifBegDt(Date provCertifBegDt) {
		this.provCertifBegDt = provCertifBegDt;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="PROV_CERTIF_END_DT")
	public Date getProvCertifEndDt() {
		return this.provCertifEndDt;
	}

	public void setProvCertifEndDt(Date provCertifEndDt) {
		this.provCertifEndDt = provCertifEndDt;
	}

}