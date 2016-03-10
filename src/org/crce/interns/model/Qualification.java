package org.crce.interns.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "qualification")
public class Qualification {
	
	//NO OF FIELDS: 10
	
	@Id
	@Column(name = "username")
	private String username;
	
	@Id
	@Column(name = "qualification_id")
	private Integer qualificationId;	
	
	@Column(name = "percentage")
	private Double percentage;

	@Column(name = "gpa")
	private Double gpa;
	

	@Column(name = "total_marks")
	private Integer totalMarks;
	

	@Column(name = "marks_obtained")
	private Integer marksObtained;
	

	@Column(name = "created_date")
	private Date createdDate;
	

	@Column(name = "created_by")
	private String createdBy;
	

	@Column(name = "modifiedDate")
	private Date modifiedDate;
	

	@Column(name = "modified_by")
	private String modifiedBy;


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public Integer getQualificationId() {
		return qualificationId;
	}


	public void setQualificationId(Integer qualificationId) {
		this.qualificationId = qualificationId;
	}


	public Double getPercentage() {
		return percentage;
	}


	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}


	public Double getGpa() {
		return gpa;
	}


	public void setGpa(Double gpa) {
		this.gpa = gpa;
	}


	public Integer getTotalMarks() {
		return totalMarks;
	}


	public void setTotalMarks(Integer totalMarks) {
		this.totalMarks = totalMarks;
	}


	public Integer getMarksObtained() {
		return marksObtained;
	}


	public void setMarksObtained(Integer marksObtained) {
		this.marksObtained = marksObtained;
	}


	public Date getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}


	public String getCreatedBy() {
		return createdBy;
	}


	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}


	public Date getModifiedDate() {
		return modifiedDate;
	}


	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}


	public String getModifiedBy() {
		return modifiedBy;
	}


	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	

	
}
