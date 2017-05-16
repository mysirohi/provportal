package ims.ProviderPortal.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the providergroup database table.
 * 
 */
@Entity
@Table(name="providergroup")
public class Providergroup implements Serializable {
	private static final long serialVersionUID = 1L;
	private ProvidergroupPK id;
	private String clerkIdentification;
	private Date dateOfLastTrans;
	private Date provGroupBegDate;
	private Date provGroupEndDate;

	public Providergroup() {
	}


	@EmbeddedId
	public ProvidergroupPK getId() {
		return this.id;
	}

	public void setId(ProvidergroupPK id) {
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
	@Column(name="PROV_GROUP_BEG_DATE")
	public Date getProvGroupBegDate() {
		return this.provGroupBegDate;
	}

	public void setProvGroupBegDate(Date provGroupBegDate) {
		this.provGroupBegDate = provGroupBegDate;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="PROV_GROUP_END_DATE")
	public Date getProvGroupEndDate() {
		return this.provGroupEndDate;
	}

	public void setProvGroupEndDate(Date provGroupEndDate) {
		this.provGroupEndDate = provGroupEndDate;
	}

}