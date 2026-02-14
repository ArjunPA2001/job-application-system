package com.jobApplicationSystem.interview_service.models;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

@Entity
public class Interview {

    @GeneratedValue(strategy=GenerationType.AUTO)
    @Id
    UUID interviewId;

    @NotNull
    UUID applicationId;

    @NotNull
    int roundNumber;

    @NotNull
    String interviewType;

    @NotNull
    String mode;

    @NotNull
    String notes;

    @NotNull
    String result;

    public Interview() {
    }

    public Interview(UUID interviewId, @NotNull UUID applicationId, @NotNull int roundNumber,
            @NotNull String interviewType, @NotNull String mode, @NotNull String notes, @NotNull String result) {
        this.interviewId = interviewId;
        this.applicationId = applicationId;
        this.roundNumber = roundNumber;
        this.interviewType = interviewType;
        this.mode = mode;
        this.notes = notes;
        this.result = result;
    }

    public UUID getInterviewId() {
        return interviewId;
    }

    public void setInterviewId(UUID interviewId) {
        this.interviewId = interviewId;
    }

    public UUID getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(UUID applicationId) {
        this.applicationId = applicationId;
    }

    public int getRoundNumber() {
        return roundNumber;
    }

    public void setRoundNumber(int roundNumber) {
        this.roundNumber = roundNumber;
    }

    public String getInterviewType() {
        return interviewType;
    }

    public void setInterviewType(String interviewType) {
        this.interviewType = interviewType;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    

}
