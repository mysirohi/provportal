package ims.ProviderPortal.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the provideradditionalinfo database table.
 * 
 */
@Entity
@Table(name="provideradditionalinfo")
public class Provideradditionalinfo implements Serializable {
	private static final long serialVersionUID = 1L;
	private long provBaseNumber;
	private String adjustmentReason;
	private String clerkIdentification;
	private BigDecimal creditBalAmt;
	private Date creditBalanceDate;
	private String criticalAccessInd;
	private Date dateOfLastTrans;
	private String eftDfiAcctNumber;
	private int eftDfiRouteId;
	private String emcBillingInd;
	private String hospTaxInd;
	private Date initCreBalDate;
	private BigDecimal lienAmount;
	private BigDecimal lienAmountPaid;
	private Date lienDate;
	private BigDecimal lienDeductAmount;
	private BigDecimal lienDeductPercent;
	private BigDecimal lienHolderProvNum;
	private Date lienWhDate;
	private BigDecimal maxChkBalDedAmt;
	private BigDecimal maxChkBalDedPct;
	private String prov340bInd;
	private String provAfpInd;
	private Date provApplDate;
	private String provCheckAddrInd;
	private String provCliaId;
	private String provCorresAddrInd;
	private String provCorrespMedia;
	private Date provLicExpireDate;
	private Date provLicenseDate;
	private String provLicenseNum;
	private String provOwnershipCode;
	private String provPaymentMethod;
	private String provPrintSuspInd;
	private String provRemitAddrInd;
	private String provRemitMedia;
	private String provTaxName;
	private BigDecimal recoupmentAmount;
	private String typePracticeOrgan;

	public Provideradditionalinfo() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="PROV_BASE_NUMBER", unique=true, nullable=false, precision=10)
	public long getProvBaseNumber() {
		return this.provBaseNumber;
	}

	public void setProvBaseNumber(long provBaseNumber) {
		this.provBaseNumber = provBaseNumber;
	}


	@Column(name="ADJUSTMENT_REASON", length=2)
	public String getAdjustmentReason() {
		return this.adjustmentReason;
	}

	public void setAdjustmentReason(String adjustmentReason) {
		this.adjustmentReason = adjustmentReason;
	}


	@Column(name="CLERK_IDENTIFICATION", length=8)
	public String getClerkIdentification() {
		return this.clerkIdentification;
	}

	public void setClerkIdentification(String clerkIdentification) {
		this.clerkIdentification = clerkIdentification;
	}


	@Column(name="CREDIT_BAL_AMT", precision=10, scale=2)
	public BigDecimal getCreditBalAmt() {
		return this.creditBalAmt;
	}

	public void setCreditBalAmt(BigDecimal creditBalAmt) {
		this.creditBalAmt = creditBalAmt;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="CREDIT_BALANCE_DATE")
	public Date getCreditBalanceDate() {
		return this.creditBalanceDate;
	}

	public void setCreditBalanceDate(Date creditBalanceDate) {
		this.creditBalanceDate = creditBalanceDate;
	}


	@Column(name="CRITICAL_ACCESS_IND", length=1)
	public String getCriticalAccessInd() {
		return this.criticalAccessInd;
	}

	public void setCriticalAccessInd(String criticalAccessInd) {
		this.criticalAccessInd = criticalAccessInd;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="DATE_OF_LAST_TRANS")
	public Date getDateOfLastTrans() {
		return this.dateOfLastTrans;
	}

	public void setDateOfLastTrans(Date dateOfLastTrans) {
		this.dateOfLastTrans = dateOfLastTrans;
	}


	@Column(name="EFT_DFI_ACCT_NUMBER", length=17)
	public String getEftDfiAcctNumber() {
		return this.eftDfiAcctNumber;
	}

	public void setEftDfiAcctNumber(String eftDfiAcctNumber) {
		this.eftDfiAcctNumber = eftDfiAcctNumber;
	}


	@Column(name="EFT_DFI_ROUTE_ID")
	public int getEftDfiRouteId() {
		return this.eftDfiRouteId;
	}

	public void setEftDfiRouteId(int eftDfiRouteId) {
		this.eftDfiRouteId = eftDfiRouteId;
	}


	@Column(name="EMC_BILLING_IND", length=1)
	public String getEmcBillingInd() {
		return this.emcBillingInd;
	}

	public void setEmcBillingInd(String emcBillingInd) {
		this.emcBillingInd = emcBillingInd;
	}


	@Column(name="HOSP_TAX_IND", length=1)
	public String getHospTaxInd() {
		return this.hospTaxInd;
	}

	public void setHospTaxInd(String hospTaxInd) {
		this.hospTaxInd = hospTaxInd;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="INIT_CRE_BAL_DATE")
	public Date getInitCreBalDate() {
		return this.initCreBalDate;
	}

	public void setInitCreBalDate(Date initCreBalDate) {
		this.initCreBalDate = initCreBalDate;
	}


	@Column(name="LIEN_AMOUNT", precision=10, scale=2)
	public BigDecimal getLienAmount() {
		return this.lienAmount;
	}

	public void setLienAmount(BigDecimal lienAmount) {
		this.lienAmount = lienAmount;
	}


	@Column(name="LIEN_AMOUNT_PAID", precision=10, scale=2)
	public BigDecimal getLienAmountPaid() {
		return this.lienAmountPaid;
	}

	public void setLienAmountPaid(BigDecimal lienAmountPaid) {
		this.lienAmountPaid = lienAmountPaid;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="LIEN_DATE")
	public Date getLienDate() {
		return this.lienDate;
	}

	public void setLienDate(Date lienDate) {
		this.lienDate = lienDate;
	}


	@Column(name="LIEN_DEDUCT_AMOUNT", precision=10, scale=2)
	public BigDecimal getLienDeductAmount() {
		return this.lienDeductAmount;
	}

	public void setLienDeductAmount(BigDecimal lienDeductAmount) {
		this.lienDeductAmount = lienDeductAmount;
	}


	@Column(name="LIEN_DEDUCT_PERCENT", precision=10, scale=2)
	public BigDecimal getLienDeductPercent() {
		return this.lienDeductPercent;
	}

	public void setLienDeductPercent(BigDecimal lienDeductPercent) {
		this.lienDeductPercent = lienDeductPercent;
	}


	@Column(name="LIEN_HOLDER_PROV_NUM", precision=10)
	public BigDecimal getLienHolderProvNum() {
		return this.lienHolderProvNum;
	}

	public void setLienHolderProvNum(BigDecimal lienHolderProvNum) {
		this.lienHolderProvNum = lienHolderProvNum;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="LIEN_WH_DATE")
	public Date getLienWhDate() {
		return this.lienWhDate;
	}

	public void setLienWhDate(Date lienWhDate) {
		this.lienWhDate = lienWhDate;
	}


	@Column(name="MAX_CHK_BAL_DED_AMT", precision=10, scale=2)
	public BigDecimal getMaxChkBalDedAmt() {
		return this.maxChkBalDedAmt;
	}

	public void setMaxChkBalDedAmt(BigDecimal maxChkBalDedAmt) {
		this.maxChkBalDedAmt = maxChkBalDedAmt;
	}


	@Column(name="MAX_CHK_BAL_DED_PCT", precision=10, scale=4)
	public BigDecimal getMaxChkBalDedPct() {
		return this.maxChkBalDedPct;
	}

	public void setMaxChkBalDedPct(BigDecimal maxChkBalDedPct) {
		this.maxChkBalDedPct = maxChkBalDedPct;
	}


	@Column(name="PROV_340B_IND", length=1)
	public String getProv340bInd() {
		return this.prov340bInd;
	}

	public void setProv340bInd(String prov340bInd) {
		this.prov340bInd = prov340bInd;
	}


	@Column(name="PROV_AFP_IND", length=1)
	public String getProvAfpInd() {
		return this.provAfpInd;
	}

	public void setProvAfpInd(String provAfpInd) {
		this.provAfpInd = provAfpInd;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="PROV_APPL_DATE")
	public Date getProvApplDate() {
		return this.provApplDate;
	}

	public void setProvApplDate(Date provApplDate) {
		this.provApplDate = provApplDate;
	}


	@Column(name="PROV_CHECK_ADDR_IND", length=1)
	public String getProvCheckAddrInd() {
		return this.provCheckAddrInd;
	}

	public void setProvCheckAddrInd(String provCheckAddrInd) {
		this.provCheckAddrInd = provCheckAddrInd;
	}


	@Column(name="PROV_CLIA_ID", length=10)
	public String getProvCliaId() {
		return this.provCliaId;
	}

	public void setProvCliaId(String provCliaId) {
		this.provCliaId = provCliaId;
	}


	@Column(name="PROV_CORRES_ADDR_IND", length=1)
	public String getProvCorresAddrInd() {
		return this.provCorresAddrInd;
	}

	public void setProvCorresAddrInd(String provCorresAddrInd) {
		this.provCorresAddrInd = provCorresAddrInd;
	}


	@Column(name="PROV_CORRESP_MEDIA", length=1)
	public String getProvCorrespMedia() {
		return this.provCorrespMedia;
	}

	public void setProvCorrespMedia(String provCorrespMedia) {
		this.provCorrespMedia = provCorrespMedia;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="PROV_LIC_EXPIRE_DATE")
	public Date getProvLicExpireDate() {
		return this.provLicExpireDate;
	}

	public void setProvLicExpireDate(Date provLicExpireDate) {
		this.provLicExpireDate = provLicExpireDate;
	}


	@Temporal(TemporalType.DATE)
	@Column(name="PROV_LICENSE_DATE")
	public Date getProvLicenseDate() {
		return this.provLicenseDate;
	}

	public void setProvLicenseDate(Date provLicenseDate) {
		this.provLicenseDate = provLicenseDate;
	}


	@Column(name="PROV_LICENSE_NUM", length=9)
	public String getProvLicenseNum() {
		return this.provLicenseNum;
	}

	public void setProvLicenseNum(String provLicenseNum) {
		this.provLicenseNum = provLicenseNum;
	}


	@Column(name="PROV_OWNERSHIP_CODE", length=1)
	public String getProvOwnershipCode() {
		return this.provOwnershipCode;
	}

	public void setProvOwnershipCode(String provOwnershipCode) {
		this.provOwnershipCode = provOwnershipCode;
	}


	@Column(name="PROV_PAYMENT_METHOD", length=1)
	public String getProvPaymentMethod() {
		return this.provPaymentMethod;
	}

	public void setProvPaymentMethod(String provPaymentMethod) {
		this.provPaymentMethod = provPaymentMethod;
	}


	@Column(name="PROV_PRINT_SUSP_IND", length=1)
	public String getProvPrintSuspInd() {
		return this.provPrintSuspInd;
	}

	public void setProvPrintSuspInd(String provPrintSuspInd) {
		this.provPrintSuspInd = provPrintSuspInd;
	}


	@Column(name="PROV_REMIT_ADDR_IND", length=1)
	public String getProvRemitAddrInd() {
		return this.provRemitAddrInd;
	}

	public void setProvRemitAddrInd(String provRemitAddrInd) {
		this.provRemitAddrInd = provRemitAddrInd;
	}


	@Column(name="PROV_REMIT_MEDIA", length=1)
	public String getProvRemitMedia() {
		return this.provRemitMedia;
	}

	public void setProvRemitMedia(String provRemitMedia) {
		this.provRemitMedia = provRemitMedia;
	}


	@Column(name="PROV_TAX_NAME", length=35)
	public String getProvTaxName() {
		return this.provTaxName;
	}

	public void setProvTaxName(String provTaxName) {
		this.provTaxName = provTaxName;
	}


	@Column(name="RECOUPMENT_AMOUNT", precision=10, scale=2)
	public BigDecimal getRecoupmentAmount() {
		return this.recoupmentAmount;
	}

	public void setRecoupmentAmount(BigDecimal recoupmentAmount) {
		this.recoupmentAmount = recoupmentAmount;
	}


	@Column(name="TYPE_PRACTICE_ORGAN", length=2)
	public String getTypePracticeOrgan() {
		return this.typePracticeOrgan;
	}

	public void setTypePracticeOrgan(String typePracticeOrgan) {
		this.typePracticeOrgan = typePracticeOrgan;
	}

}