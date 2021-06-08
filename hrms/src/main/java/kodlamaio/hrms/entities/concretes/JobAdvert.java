package kodlamaio.hrms.entities.concretes;


import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="job_adverts")
public class JobAdvert {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	
	@JoinColumn(name = "job_position_id")
	@ManyToOne()
	private JobPosition jobPosition;

	
	@JoinColumn(name = "city_id")
	@ManyToOne()
	private City city;

	
	@Column(name = "description")
	private String description;

	
	@Column(name = "min_salary")
	private int minSalary;

	
	@Column(name = "max_salary")
	private int maxSalary;

	
	@Column(name = "number_of_open_positions")
	private int numberOfOpenPositions;

	
	@Column(name = "created_at", columnDefinition = "Date default CURRENT_TIMESTAMP")
	private final LocalDateTime createdAt = LocalDateTime.now();

	
	@Column(name = "application_deadline")
	private LocalDateTime applicationDeadline;

	@Column(name = "is_active", columnDefinition = "boolean default true")
	private boolean isActive = true;

	@Column(name = "is_deleted", columnDefinition = "boolean default false")
	private boolean isDeleted = false;
	
	public JobAdvert() {
		
		
	}

	public JobAdvert(int id, JobPosition jobPosition, City city, String description, int minSalary, int maxSalary,
			int numberOfOpenPositions, LocalDateTime applicationDeadline, boolean isActive, boolean isDeleted) {
		super();
		this.id = id;
		this.jobPosition = jobPosition;
		this.city = city;
		this.description = description;
		this.minSalary = minSalary;
		this.maxSalary = maxSalary;
		this.numberOfOpenPositions = numberOfOpenPositions;
		this.applicationDeadline = applicationDeadline;
		this.isActive = isActive;
		this.isDeleted = isDeleted;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public JobPosition getJobPosition() {
		return jobPosition;
	}

	public void setJobPosition(JobPosition jobPosition) {
		this.jobPosition = jobPosition;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getMinSalary() {
		return minSalary;
	}

	public void setMinSalary(int minSalary) {
		this.minSalary = minSalary;
	}

	public int getMaxSalary() {
		return maxSalary;
	}

	public void setMaxSalary(int maxSalary) {
		this.maxSalary = maxSalary;
	}

	public int getNumberOfOpenPositions() {
		return numberOfOpenPositions;
	}

	public void setNumberOfOpenPositions(int numberOfOpenPositions) {
		this.numberOfOpenPositions = numberOfOpenPositions;
	}

	public LocalDateTime getApplicationDeadline() {
		return applicationDeadline;
	}

	public void setApplicationDeadline(LocalDateTime applicationDeadline) {
		this.applicationDeadline = applicationDeadline;
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
