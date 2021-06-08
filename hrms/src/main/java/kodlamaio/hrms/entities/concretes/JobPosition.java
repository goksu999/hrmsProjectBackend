package kodlamaio.hrms.entities.concretes;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="job_positions")
public class JobPosition {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "title")
	private String title;

	
	@Column(name = "created_at", columnDefinition = "Date default CURRENT_DATE")
	private final LocalDateTime createdAt = LocalDateTime.now();


	@Column(name = "is_active", columnDefinition = "boolean default true")
	private boolean isActive = true;

	
	@Column(name = "is_deleted", columnDefinition = "boolean default false")
	private boolean isDeleted = false;
	
	public JobPosition() {
		
		
	}


	public JobPosition(int id, String title, boolean isActive, boolean isDeleted) {
		super();
		this.id = id;
		this.title = title;
		this.isActive = isActive;
		this.isDeleted = isDeleted;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
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
