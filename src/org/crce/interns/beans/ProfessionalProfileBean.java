package org.crce.interns.beans;

import java.util.Date;


public class ProfessionalProfileBean {
	

	private String username;


	private String branch;


	private Integer year;


	private String status;


	private String jobCategory;


	private String fieldOfInterest;


	private Integer qualificationId;


	private String achievements;


	private String projects;

	
	private String internships;

	
	private String coCurricularActivities;

	
	private String extraCurricularActivities;

	
	private Integer jobId;
	
	// common to userDetails
	
	private Date createdDate;

	
	private String createdBy;

	
	private Date modifiedDate;

	
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
