package ims.ProviderPortal.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the providerclaimtype database table.
 * 
 */
@Entity
@Table(name="providerclaimtype")
public class Providerclaimtype implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ProviderclaimtypePK id;

	@Column(name="CLERK_IDENTIFICATION", length=8)
	private String clerkIdentification;

	@Column(name="CLM_INPUT_FORM_IND_1", length=1)
	private String clmInputFormInd1;

	@Column(name="CLM_INPUT_FORM_IND_2", length=1)
	private String clmInputFormInd2;

	@Column(name="CLM_INPUT_FORM_IND_3", length=1)
	private String clmInputFormInd3;

	@Column(name="CLM_INPUT_FORM_IND_4", length=1)
	private String clmInputFormInd4;

	@Column(name="CLM_INPUT_FORM_IND_5", length=1)
	private String clmInputFormInd5;

	@Column(name="CLM_INPUT_FORM_IND_6", length=1)
	private String clmInputFormInd6;

	@Column(name="CLM_INPUT_FORM_IND_7", length=1)
	private String clmInputFormInd7;

	@Column(name="CLM_INPUT_FORM_IND_8", length=1)
	private String clmInputFormInd8;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_OF_LAST_TRANS")
	private Date dateOfLastTrans;

	public Providerclaimtype() {
	}

	public ProviderclaimtypePK getId() {
		return this.id;
	}

	public void setId(ProviderclaimtypePK id) {
		this.id = id;
	}

	public String getClerkIdentification() {
		return this.clerkIdentification;
	}

	public void setClerkIdentification(String clerkIdentification) {
		this.clerkIdentification = clerkIdentification;
	}

	public String getClmInputFormInd1() {
		return this.clmInputFormInd1;
	}

	public void setClmInputFormInd1(String clmInputFormInd1) {
		this.clmInputFormInd1 = clmInputFormInd1;
	}

	public String getClmInputFormInd2() {
		return this.clmInputFormInd2;
	}

	public void setClmInputFormInd2(String clmInputFormInd2) {
		this.clmInputFormInd2 = clmInputFormInd2;
	}

	public String getClmInputFormInd3() {
		return this.clmInputFormInd3;
	}

	public void setClmInputFormInd3(String clmInputFormInd3) {
		this.clmInputFormInd3 = clmInputFormInd3;
	}

	public String getClmInputFormInd4() {
		return this.clmInputFormInd4;
	}

	public void setClmInputFormInd4(String clmInputFormInd4) {
		this.clmInputFormInd4 = clmInputFormInd4;
	}

	public String getClmInputFormInd5() {
		return this.clmInputFormInd5;
	}

	public void setClmInputFormInd5(String clmInputFormInd5) {
		this.clmInputFormInd5 = clmInputFormInd5;
	}

	public String getClmInputFormInd6() {
		return this.clmInputFormInd6;
	}

	public void setClmInputFormInd6(String clmInputFormInd6) {
		this.clmInputFormInd6 = clmInputFormInd6;
	}

	public String getClmInputFormInd7() {
		return this.clmInputFormInd7;
	}

	public void setClmInputFormInd7(String clmInputFormInd7) {
		this.clmInputFormInd7 = clmInputFormInd7;
	}

	public String getClmInputFormInd8() {
		return this.clmInputFormInd8;
	}

	public void setClmInputFormInd8(String clmInputFormInd8) {
		this.clmInputFormInd8 = clmInputFormInd8;
	}

	public Date getDateOfLastTrans() {
		return this.dateOfLastTrans;
	}

	public void setDateOfLastTrans(Date dateOfLastTrans) {
		this.dateOfLastTrans = dateOfLastTrans;
	}

}