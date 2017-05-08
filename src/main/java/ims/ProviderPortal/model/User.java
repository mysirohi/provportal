package ims.ProviderPortal.model;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
//	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private String userid;

	private String password;

		public String getUserId() {
		return userid;
	}

	public void setUserId(String userId) {
		this.userid = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

		@Override
	public String toString() {
		return "User [userId=" + userid + ", password=" + password + "]";
	}

}

