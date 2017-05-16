package ims.ProviderPortal.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the providermaster database table.
 * 
 */
@Entity
@Table(name="providermaster")
public class Providermaster implements Serializable {
	private static final long serialVersionUID = 1L;
	private long prov_Base_Number;
	private String clerkIdentification;
	private Date dateOfLastTrans;
	private String defaultIndProvNpi;
	private String outOfStateProvCd;
	private int provApplCompleteStatus;
	private String provCountyCode;
	private Date provDateOfBirth;
	private String provEmplrIdentNumOrSsNum;
	private int provFaxNum;
	private String provName;
	private String prov_NPI;
	private String provSortName;
	private String provSsnIrsNumInd;
	private String provTaxonomy;
	private int provTeleNum;
	private String provType;

	public Providermaster() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(unique=true, nullable=false, precision=10)
	public long getProv_Base_Number() {
		return this.prov_Base_Number;
	}

	public void setProv_Base_Number(long prov_Base_Number) {
		this.prov_Base_Number = prov_Base_Number;
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


	@Column(name="DEFAULT_IND_PROV_NPI", length=1)
	public String getDefaultIndProvNpi() {
		return this.defaultIndProvNpi;
	}

	public void setDefaultIndProvNpi(String defaultIndProvNpi) {
		this.defaultIndProvNpi = defaultIndProvNpi;
	}


	@Column(name="OUT_OF_STATE_PROV_CD", length=1)
	public String getOutOfStateProvCd() {
		return this.outOfStateProvCd;
	}

	public void setOutOfStateProvCd(String outOfStateProvCd) {
		this.outOfStateProvCd = outOfStateProvCd;
	}


	@Column(name="PROV_APPL_COMPLETE_STATUS")
	public int getProvApplCompleteStatus() {
		return this.provApplCompleteStatus;
	}

	public void setProvApplCompleteStatus(int provApplCompleteStatus) {
		this.provApplCompleteStatus = provApplCompleteStatus;
	}


	@Column(name="PROV_COUNTY_CODE", length=2)
	public String getProvCountyCode() {
		return this.provCountyCode;
	}

	public void setProvCountyCode(String provCountyCode) {
		this.provCountyCode = provCountyCode;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="PROV_DATE_OF_BIRTH")
	public Date getProvDateOfBirth() {
		return this.provDateOfBirth;
	}

	public void setProvDateOfBirth(Date provDateOfBirth) {
		this.provDateOfBirth = provDateOfBirth;
	}


	@Column(name="PROV_EMPLR_IDENT_NUM_OR_SS_NUM", length=9)
	public String getProvEmplrIdentNumOrSsNum() {
		return this.provEmplrIdentNumOrSsNum;
	}

	public void setProvEmplrIdentNumOrSsNum(String provEmplrIdentNumOrSsNum) {
		this.provEmplrIdentNumOrSsNum = provEmplrIdentNumOrSsNum;
	}


	@Column(name="PROV_FAX_NUM")
	public int getProvFaxNum() {
		return this.provFaxNum;
	}

	public void setProvFaxNum(int provFaxNum) {
		this.provFaxNum = provFaxNum;
	}


	@Column(name="PROV_NAME", length=35)
	public String getProvName() {
		return this.provName;
	}

	public void setProvName(String provName) {
		this.provName = provName;
	}


	@Column(nullable=false, length=10)
	public String getProv_NPI() {
		return this.prov_NPI;
	}

	public void setProv_NPI(String prov_NPI) {
		this.prov_NPI = prov_NPI;
	}


	@Column(name="PROV_SORT_NAME", length=35)
	public String getProvSortName() {
		return this.provSortName;
	}

	public void setProvSortName(String provSortName) {
		this.provSortName = provSortName;
	}


	@Column(name="PROV_SSN_IRS_NUM_IND", length=1)
	public String getProvSsnIrsNumInd() {
		return this.provSsnIrsNumInd;
	}

	public void setProvSsnIrsNumInd(String provSsnIrsNumInd) {
		this.provSsnIrsNumInd = provSsnIrsNumInd;
	}


	@Column(name="PROV_TAXONOMY", length=10)
	public String getProvTaxonomy() {
		return this.provTaxonomy;
	}

	public void setProvTaxonomy(String provTaxonomy) {
		this.provTaxonomy = provTaxonomy;
	}


	@Column(name="PROV_TELE_NUM")
	public int getProvTeleNum() {
		return this.provTeleNum;
	}

	public void setProvTeleNum(int provTeleNum) {
		this.provTeleNum = provTeleNum;
	}


	@Column(name="PROV_TYPE", length=2)
	public String getProvType() {
		return this.provType;
	}

	public void setProvType(String provType) {
		this.provType = provType;
	}

}