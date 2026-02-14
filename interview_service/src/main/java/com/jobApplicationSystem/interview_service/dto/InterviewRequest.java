package com.jobApplicationSystem.interview_service.dto;

import java.util.UUID;

import jakarta.validation.constraints.NotBlank;

public class InterviewRequest {

    @NotBlank(message = "application ID is required")
    private String applicationId;

    @NotBlank(message = "round number is required")
    private int roundNumber;

    @NotBlank(message = "interview type is required")
    private String interviewType;

    @NotBlank(message = "mode is required")
    private String mode;

    @NotBlank(message = "round number is required")
    private String notes;

    @NotBlank(message = "result is required")
    private String result;

    public InterviewRequest() {
    }

    public InterviewRequest(@NotBlank(message = "application ID is required") String applicationId,
            @NotBlank(message = "round number is required") int roundNumber,
            @NotBlank(message = "interview type is required") String interviewType,
            @NotBlank(message = "mode is required") String mode,
            @NotBlank(message = "round number is required") String notes,
            @NotBlank(message = "result is required") String result) {
        this.applicationId = applicationId;
        this.roundNumber = roundNumber;
        this.interviewType = interviewType;
        this.mode = mode;
        this.notes = notes;
        this.result = result;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
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
