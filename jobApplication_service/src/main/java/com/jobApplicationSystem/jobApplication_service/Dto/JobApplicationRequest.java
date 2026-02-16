package com.jobApplicationSystem.jobApplication_service.Dto;

import java.sql.Date;
import java.util.UUID;

public class JobApplicationRequest {
    
    private String userId;
    private String jobId;
    private String companyName;
    private String jobTitle;
    private String location;
    private String appliedDate;
    private String status;
    private String notes;
    private String createdAt;
    private String jobLink;
    
    public JobApplicationRequest() {
    }

    public JobApplicationRequest(String userId, String jobId, String companyName, String jobTitle, String location,
            String appliedDate, String status, String notes, String createdAt, String jobLink) {
        this.userId = userId;
        this.jobId = jobId;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.location = location;
        this.appliedDate = appliedDate;
        this.status = status;
        this.notes = notes;
        this.createdAt = createdAt;
        this.jobLink = jobLink;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAppliedDate() {
        return appliedDate;
    }

    public void setAppliedDate(String appliedDate) {
        this.appliedDate = appliedDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getJobLink() {
        return jobLink;
    }

    public void setJobLink(String jobLink) {
        this.jobLink = jobLink;
    }
    
    
    
    
    
    
    
}


