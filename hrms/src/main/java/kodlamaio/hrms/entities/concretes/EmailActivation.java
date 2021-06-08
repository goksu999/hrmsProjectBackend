package kodlamaio.hrms.entities.concretes;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import kodlamaio.hrms.core.entities.User;

public class EmailActivation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	
	@JoinColumn(name = "user_id")
	@ManyToOne()
	private User user;

	
	@Column(name = "activation_code")
	private String activationCode;

	
	@Column(name = "email")
	private String email;

	
	@Column(name = "is_activated", columnDefinition = "boolean default false")
	private boolean isActivated = false;

	
	@Column(name = "created_at", columnDefinition = "Date default CURRENT_DATE")
	private LocalDateTime createdAt = LocalDateTime.now();

	
	@Column(name = "expiration_date")
	private LocalDateTime expirationDate;

	@Column(name = "activation_date")
	private LocalDateTime activationDate;
	
	
	public EmailActivation() {
		
		
	}

	public EmailActivation(int id, User user, String activationCode, String email, boolean isActivated,
			LocalDateTime createdAt, LocalDateTime expirationDate, LocalDateTime activationDate) {
		super();
		this.id = id;
		this.user = user;
		this.activationCode = activationCode;
		this.email = email;
		this.isActivated = isActivated;
		this.createdAt = createdAt;
		this.expirationDate = expirationDate;
		this.activationDate = activationDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getActivationCode() {
		return activationCode;
	}

	public void setActivationCode(String activationCode) {
		this.activationCode = activationCode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isActivated() {
		return isActivated;
	}

	public void setActivated(boolean isActivated) {
		this.isActivated = isActivated;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(LocalDateTime expirationDate) {
		this.expirationDate = expirationDate;
	}

	public LocalDateTime getActivationDate() {
		return activationDate;
	}

	public void setActivationDate(LocalDateTime activationDate) {
		this.activationDate = activationDate;
	}

}
