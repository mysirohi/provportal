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

	@Id
	@Column(unique=true, nullable=false, precision=10)
	private long prov_Base_Number;

	@Column(name="CLERK_IDENTIFICATION", length=8)
	private String clerkIdentification;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_OF_LAST_TRANS")
	private Date dateOfLastTrans;

	@Column(name="DEFAULT_IND_PROV_NPI", length=1)
	private String defaultIndProvNpi;

	@Column(name="OUT_OF_STATE_PROV_CD", length=1)
	private String outOfStateProvCd;

	@Column(name="PROV_APPL_COMPLETE_STATUS")
	private int provApplCompleteStatus;

	@Column(name="PROV_COUNTY_CODE", length=2)
	private String provCountyCode;

	@Temporal(TemporalType.DATE)
	@Column(name="PROV_DATE_OF_BIRTH")
	private Date provDateOfBirth;

	@Column(name="PROV_EMPLR_IDENT_NUM_OR_SS_NUM", length=9)
	private String provEmplrIdentNumOrSsNum;

	@Column(name="PROV_FAX_NUM")
	private int provFaxNum;

	@Column(name="PROV_NAME", length=35)
	private String provName;

	@Column(nullable=false, length=10)
	private String prov_NPI;

	@Column(name="PROV_SORT_NAME", length=35)
	private String provSortName;

	@Column(name="PROV_SSN_IRS_NUM_IND", length=1)
	private String provSsnIrsNumInd;

	@Column(name="PROV_TAXONOMY", length=10)
	private String provTaxonomy;

	@Column(name="PROV_TELE_NUM")
	private int provTeleNum;

	@Column(name="PROV_TYPE", length=2)
	private String provType;

	public Providermaster() {
	}

	public long getProv_Base_Number() {
		return this.prov_Base_Number;
	}

	public void setProv_Base_Number(long prov_Base_Number) {
		this.prov_Base_Number = prov_Base_Number;
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

	public String getDefaultIndProvNpi() {
		return this.defaultIndProvNpi;
	}

	public void setDefaultIndProvNpi(String defaultIndProvNpi) {
		this.defaultIndProvNpi = defaultIndProvNpi;
	}

	public String getOutOfStateProvCd() {
		return this.outOfStateProvCd;
	}

	public void setOutOfStateProvCd(String outOfStateProvCd) {
		this.outOfStateProvCd = outOfStateProvCd;
	}

	public int getProvApplCompleteStatus() {
		return this.provApplCompleteStatus;
	}

	public void setProvApplCompleteStatus(int provApplCompleteStatus) {
		this.provApplCompleteStatus = provApplCompleteStatus;
	}

	public String getProvCountyCode() {
		return this.provCountyCode;
	}

	public void setProvCountyCode(String provCountyCode) {
		this.provCountyCode = provCountyCode;
	}

	public Date getProvDateOfBirth() {
		return this.provDateOfBirth;
	}

	public void setProvDateOfBirth(Date provDateOfBirth) {
		this.provDateOfBirth = provDateOfBirth;
	}

	public String getProvEmplrIdentNumOrSsNum() {
		return this.provEmplrIdentNumOrSsNum;
	}

	public void setProvEmplrIdentNumOrSsNum(String provEmplrIdentNumOrSsNum) {
		this.provEmplrIdentNumOrSsNum = provEmplrIdentNumOrSsNum;
	}

	public int getProvFaxNum() {
		return this.provFaxNum;
	}

	public void setProvFaxNum(int provFaxNum) {
		this.provFaxNum = provFaxNum;
	}

	public String getProvName() {
		return this.provName;
	}

	public void setProvName(String provName) {
		this.provName = provName;
	}

	public String getProv_NPI() {
		return this.prov_NPI;
	}

	public void setProv_NPI(String prov_NPI) {
		this.prov_NPI = prov_NPI;
	}

	public String getProvSortName() {
		return this.provSortName;
	}

	public void setProvSortName(String provSortName) {
		this.provSortName = provSortName;
	}

	public String getProvSsnIrsNumInd() {
		return this.provSsnIrsNumInd;
	}

	public void setProvSsnIrsNumInd(String provSsnIrsNumInd) {
		this.provSsnIrsNumInd = provSsnIrsNumInd;
	}

	public String getProvTaxonomy() {
		return this.provTaxonomy;
	}

	public void setProvTaxonomy(String provTaxonomy) {
		this.provTaxonomy = provTaxonomy;
	}

	public int getProvTeleNum() {
		return this.provTeleNum;
	}

	public void setProvTeleNum(int provTeleNum) {
		this.provTeleNum = provTeleNum;
	}

	public String getProvType() {
		return this.provType;
	}

	public void setProvType(String provType) {
		this.provType = provType;
	}

}