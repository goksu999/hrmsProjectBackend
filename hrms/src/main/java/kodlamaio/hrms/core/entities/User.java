package kodlamaio.hrms.core.entities;


import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;




@Entity
@Table(name = "users")
public class User{
		
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private int id;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "password")
    private String password;
		
	@Column(name = "created_at", columnDefinition = "Date default CURRENT_DATE")
	private  LocalDateTime createdAt = LocalDateTime.now();

	
	@Column(name = "is_active", columnDefinition = "boolean default true")
	private boolean isActive = true;


	@Column(name = "is_deleted", columnDefinition = "boolean default false")
	private boolean isDeleted = false;
		
		
	public User() {
			
			
	}


	public User(int id, String email, String password, boolean isActive, boolean isDeleted) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.isActive = isActive;
		this.isDeleted = isDeleted;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public boolean isActive() {
		return isActive;
	}


	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}


	public boolean isDeleted() {
		return isDeleted;
	}


	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}


	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

		
}


