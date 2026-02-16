package com.jobApplicationSystem.jobApplication_service.Models;

import jakarta.persistence.GenerationType;

import java.sql.Date;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
@Entity
public class JobApplication {
    @Id
    @GeneratedValue (strategy=GenerationType.AUTO)
    UUID applicationId;
    UUID userId;
    UUID jobId;
    String companyName;
    String jobTitle;
    String location;
    String status;
    Date appliedDate;
    String notes;
    Date createdAt;
    String jobLink;
    

    

    public JobApplication(UUID applicationId, UUID userId, UUID jobId, String companyName, String jobTitle,
            String location, String status, Date appliedDate, String notes, Date createdAt, String jobLink) {
        this.applicationId = applicationId;
        this.userId = userId;
        this.jobId = jobId;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.location = location;
        this.status = status;
        this.appliedDate = appliedDate;
        this.notes = notes;
        this.createdAt = createdAt;
        this.jobLink = jobLink;
    }

    public JobApplication() {
    }

    public UUID getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(UUID applicationId) {
        this.applicationId = applicationId;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public UUID getJobId() {
        return jobId;
    }

    public void setJobId(UUID jobId) {
        this.jobId = jobId;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getAppliedDate() {
        return appliedDate;
    }

    public void setAppliedDate(Date appliedDate) {
        this.appliedDate = appliedDate;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getJobLink() {
        return jobLink;
    }

    public void setJobLink(String jobLink) {
        this.jobLink = jobLink;
    }
    
    

    
}
