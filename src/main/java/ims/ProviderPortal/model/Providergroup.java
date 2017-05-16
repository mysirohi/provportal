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

	@EmbeddedId
	private ProvidergroupPK id;

	@Column(name="CLERK_IDENTIFICATION", length=8)
	private String clerkIdentification;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_OF_LAST_TRANS")
	private Date dateOfLastTrans;

	@Temporal(TemporalType.DATE)
	@Column(name="PROV_GROUP_BEG_DATE")
	private Date provGroupBegDate;

	@Temporal(TemporalType.DATE)
	@Column(name="PROV_GROUP_END_DATE")
	private Date provGroupEndDate;

	public Providergroup() {
	}

	public ProvidergroupPK getId() {
		return this.id;
	}

	public void setId(ProvidergroupPK id) {
		this.id = id;
	}

	public String getClerkIdentification() {
		return this.clerkIdentification;
	}

	public void setClerkIdentification(String clerkIdentification) {
		this.clerkIdentification = clerkIdentification;
	}

	public Date getDateOfLastTrans() {
		return this.dateOfLastTrans;
	}

	public void setDateOfLastTrans(Date dateOfLastTrans) {
		this.dateOfLastTrans = dateOfLastTrans;
	}

	public Date getProvGroupBegDate() {
		return this.provGroupBegDate;
	}

	public void setProvGroupBegDate(Date provGroupBegDate) {
		this.provGroupBegDate = provGroupBegDate;
	}

	public Date getProvGroupEndDate() {
		return this.provGroupEndDate;
	}

	public void setProvGroupEndDate(Date provGroupEndDate) {
		this.provGroupEndDate = provGroupEndDate;
	}

}