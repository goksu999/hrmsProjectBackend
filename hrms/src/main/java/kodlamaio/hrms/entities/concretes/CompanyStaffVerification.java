package kodlamaio.hrms.entities.concretes;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import kodlamaio.hrms.core.entities.User;

@Entity
@Table(name="company_staff_verfications")
public class CompanyStaffVerification {

	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	
	@JoinColumn(name = "user_id")
	@OneToOne()
	private User user;

	
	@Column(name = "is_approved", columnDefinition = "boolean default false")
	private boolean isApproved = false;

	
	@Column(name = "created_at", columnDefinition = "Date default CURRENT_DATE")
	private final LocalDateTime createdAt = LocalDateTime.now();

	
	
	@Column(name = "approval_date")
	private LocalDateTime approvalDate;
	
	public CompanyStaffVerification() {
		
		
	}

	public CompanyStaffVerification(int id, User user, boolean isApproved, LocalDateTime approvalDate) {
		super();
		this.id = id;
		this.user = user;
		this.isApproved = isApproved;
		this.approvalDate = approvalDate;
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

	public boolean isApproved() {
		return isApproved;
	}

	public void setApproved(boolean isApproved) {
		this.isApproved = isApproved;
	}

	public LocalDateTime getApprovalDate() {
		return approvalDate;
	}

	public void setApprovalDate(LocalDateTime approvalDate) {
		this.approvalDate = approvalDate;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
}
