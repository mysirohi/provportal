package ims.ProviderPortal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Provider {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private long id;

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Provider [id=" + id + ", name=" + name + "]";
	}

}

