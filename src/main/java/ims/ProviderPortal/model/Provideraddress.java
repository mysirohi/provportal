package ims.ProviderPortal.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the provideraddress database table.
 * 
 */
@Entity
@Table(name="provideraddress")
public class Provideraddress implements Serializable {
	private static final long serialVersionUID = 1L;
	private ProvideraddressPK id;
	private String provAddrLine1;
	private String provAddrLine2;
	private String provCity;
	private String provEmailId;
	private String provState;
	private BigDecimal provZipCode;

	public Provideraddress() {
	}


	@EmbeddedId
	public ProvideraddressPK getId() {
		return this.id;
	}

	public void setId(ProvideraddressPK id) {
		this.id = id;
	}


	@Column(name="PROV_ADDR_LINE_1", length=28)
	public String getProvAddrLine1() {
		return this.provAddrLine1;
	}

	public void setProvAddrLine1(String provAddrLine1) {
		this.provAddrLine1 = provAddrLine1;
	}


	@Column(name="PROV_ADDR_LINE_2", length=28)
	public String getProvAddrLine2() {
		return this.provAddrLine2;
	}

	public void setProvAddrLine2(String provAddrLine2) {
		this.provAddrLine2 = provAddrLine2;
	}


	@Column(name="PROV_CITY", length=18)
	public String getProvCity() {
		return this.provCity;
	}

	public void setProvCity(String provCity) {
		this.provCity = provCity;
	}


	@Column(name="PROV_EMAIL_ID", length=50)
	public String getProvEmailId() {
		return this.provEmailId;
	}

	public void setProvEmailId(String provEmailId) {
		this.provEmailId = provEmailId;
	}


	@Column(name="PROV_STATE", length=2)
	public String getProvState() {
		return this.provState;
	}

	public void setProvState(String provState) {
		this.provState = provState;
	}


	@Column(name="PROV_ZIP_CODE", precision=10)
	public BigDecimal getProvZipCode() {
		return this.provZipCode;
	}

	public void setProvZipCode(BigDecimal provZipCode) {
		this.provZipCode = provZipCode;
	}

}