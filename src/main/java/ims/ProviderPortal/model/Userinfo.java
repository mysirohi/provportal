package ims.ProviderPortal.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the userinfo database table.
 * 
 */
@Entity
@Table(name="userinfo")
public class Userinfo implements Serializable {
	private static final long serialVersionUID = 1L;
	private String userid;
	private Date lastUpdatedDate;
	private String password;

	public Userinfo() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(unique=true, nullable=false, length=8)
	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}


	@Temporal(TemporalType.DATE)
	public Date getLastUpdatedDate() {
		return this.lastUpdatedDate;
	}

	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}


	@Column(length=8)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}