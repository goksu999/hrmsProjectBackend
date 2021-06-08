package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employers")
public class Employer {

	@Id
	@Column(name="id")
	String id;
	
	@Column(name="company_name")
	String companyName;
	
	@Column(name="website")
	String website;
	
	@Column(name="corporate_email")
	String corporateEmail;
	
	@Column(name="phone")
	String phone;
	
	public Employer() {
		
	}
	
	public Employer(String companyName, String website, String corporateEmail, String phone) {
		super();
		this.companyName = companyName;
		this.website = website;
		this.corporateEmail = corporateEmail;
		this.phone = phone;
	}

	
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getCorporateEmail() {
		return corporateEmail;
	}

	public void setCorporateEmail(String corporateEmail) {
		this.corporateEmail = corporateEmail;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
