package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="job_seekers")
public class JobSeeker {

	@Column(name = "user_id")
	private String userId;
	
	@Column(name = "first_name")
	private String firstName;

	
	@Column(name = "last_name")
	private String lastName;

	
	@Column(name = "identity_number")
	private String identityNumber;

	
	@Column(name = "birth_date")
	private LocalDate birthDate;

	public JobSeeker() {
		
	}
	
	public JobSeeker(String userId, String firstName, String lastName, String identityNumber, LocalDate birthDate) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.identityNumber = identityNumber;
		this.birthDate = birthDate;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
}
