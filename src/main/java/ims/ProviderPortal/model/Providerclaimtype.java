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
	private ProviderclaimtypePK id;
	private String clerkIdentification;
	private String clmInputFormInd1;
	private String clmInputFormInd2;
	private String clmInputFormInd3;
	private String clmInputFormInd4;
	private String clmInputFormInd5;
	private String clmInputFormInd6;
	private String clmInputFormInd7;
	private String clmInputFormInd8;
	private Date dateOfLastTrans;

	public Providerclaimtype() {
	}


	@EmbeddedId
	public ProviderclaimtypePK getId() {
		return this.id;
	}

	public void setId(ProviderclaimtypePK id) {
		this.id = id;
	}


	@Column(name="CLERK_IDENTIFICATION", length=8)
	public String getClerkIdentification() {
		return this.clerkIdentification;
	}

	public void setClerkIdentification(String clerkIdentification) {
		this.clerkIdentification = clerkIdentification;
	}


	@Column(name="CLM_INPUT_FORM_IND_1", length=1)
	public String getClmInputFormInd1() {
		return this.clmInputFormInd1;
	}

	public void setClmInputFormInd1(String clmInputFormInd1) {
		this.clmInputFormInd1 = clmInputFormInd1;
	}


	@Column(name="CLM_INPUT_FORM_IND_2", length=1)
	public String getClmInputFormInd2() {
		return this.clmInputFormInd2;
	}

	public void setClmInputFormInd2(String clmInputFormInd2) {
		this.clmInputFormInd2 = clmInputFormInd2;
	}


	@Column(name="CLM_INPUT_FORM_IND_3", length=1)
	public String getClmInputFormInd3() {
		return this.clmInputFormInd3;
	}

	public void setClmInputFormInd3(String clmInputFormInd3) {
		this.clmInputFormInd3 = clmInputFormInd3;
	}


	@Column(name="CLM_INPUT_FORM_IND_4", length=1)
	public String getClmInputFormInd4() {
		return this.clmInputFormInd4;
	}

	public void setClmInputFormInd4(String clmInputFormInd4) {
		this.clmInputFormInd4 = clmInputFormInd4;
	}


	@Column(name="CLM_INPUT_FORM_IND_5", length=1)
	public String getClmInputFormInd5() {
		return this.clmInputFormInd5;
	}

	public void setClmInputFormInd5(String clmInputFormInd5) {
		this.clmInputFormInd5 = clmInputFormInd5;
	}


	@Column(name="CLM_INPUT_FORM_IND_6", length=1)
	public String getClmInputFormInd6() {
		return this.clmInputFormInd6;
	}

	public void setClmInputFormInd6(String clmInputFormInd6) {
		this.clmInputFormInd6 = clmInputFormInd6;
	}


	@Column(name="CLM_INPUT_FORM_IND_7", length=1)
	public String getClmInputFormInd7() {
		return this.clmInputFormInd7;
	}

	public void setClmInputFormInd7(String clmInputFormInd7) {
		this.clmInputFormInd7 = clmInputFormInd7;
	}


	@Column(name="CLM_INPUT_FORM_IND_8", length=1)
	public String getClmInputFormInd8() {
		return this.clmInputFormInd8;
	}

	public void setClmInputFormInd8(String clmInputFormInd8) {
		this.clmInputFormInd8 = clmInputFormInd8;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="DATE_OF_LAST_TRANS")
	public Date getDateOfLastTrans() {
		return this.dateOfLastTrans;
	}

	public void setDateOfLastTrans(Date dateOfLastTrans) {
		this.dateOfLastTrans = dateOfLastTrans;
	}

}