package org.crce.interns.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "professional_profile")
public class ProfessionalProfile {

	// NO OF FIELDS: 17

	@Id
	@Column(name = "username")
	private String username;

	@Column(name = "branch")
	private String branch;

	@Column(name = "year")
	private Integer year;

	@Column(name = "status")
	private String status;

	@Column(name = "job_category")
	private String jobCategory;

	@Column(name = "field_of_interest")
	private String fieldOfInterest;

	@Column(name = "qualification_id")
	private Integer qualificationId;

	@Column(name = "achievements")
	private String achievements;

	@Column(name = "projects")
	private String projects;

	@Column(name = "internships")
	private String internships;

	@Column(name = "co_curricular_activities")
	private String coCurricularActivities;

	@Column(name = "extra_curricular_activities")
	private String extraCurricularActivities;

	@Column(name = "job_id")
	private Integer jobId;
	
	// common to userDetails
	@Column(name = "created_date")
	private Date createdDate;

	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "modified_date")
	private Date modifiedDate;

	@Column(name = "modified_by")
	private String modifiedBy;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getJobCategory() {
		return jobCategory;
	}

	public void setJobCategory(String jobCategory) {
		this.jobCategory = jobCategory;
	}

	public String getFieldOfInterest() {
		return fieldOfInterest;
	}

	public void setFieldOfInterest(String fieldOfInterest) {
		this.fieldOfInterest = fieldOfInterest;
	}

	public Integer getQualificationId() {
		return qualificationId;
	}

	public void setQualificationId(Integer qualificationId) {
		this.qualificationId = qualificationId;
	}

	public String getAchievements() {
		return achievements;
	}

	public void setAchievements(String achievements) {
		this.achievements = achievements;
	}

	public String getProjects() {
		return projects;
	}

	public void setProjects(String projects) {
		this.projects = projects;
	}

	public String getInternships() {
		return internships;
	}

	public void setInternships(String internships) {
		this.internships = internships;
	}

	public String getCoCurricularActivities() {
		return coCurricularActivities;
	}

	public void setCoCurricularActivities(String coCurricularActivities) {
		this.coCurricularActivities = coCurricularActivities;
	}

	public String getExtraCurricularActivities() {
		return extraCurricularActivities;
	}

	public void setExtraCurricularActivities(String extraCurricularActivities) {
		this.extraCurricularActivities = extraCurricularActivities;
	}

	public Integer getJobId() {
		return jobId;
	}

	public void setJobId(Integer jobId) {
		this.jobId = jobId;
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
