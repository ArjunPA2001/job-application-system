package com.jobApplicationSystem.interview_service.dto;

import java.util.UUID;

public class InterviewResponse {

    private String interviewId;
    private String applicationId;
    private int roundNumber;
    private String interviewType;
    private String mode;
    private String notes;
    private String result;
    
    public InterviewResponse() {
    }

    public InterviewResponse(String interviewId, String applicationId, int roundNumber, String interviewType,
            String mode, String notes, String result) {
        this.interviewId = interviewId;
        this.applicationId = applicationId;
        this.roundNumber = roundNumber;
        this.interviewType = interviewType;
        this.mode = mode;
        this.notes = notes;
        this.result = result;
    }

    public String getInterviewId() {
        return interviewId;
    }

    public void setInterviewId(String interviewId) {
        this.interviewId = interviewId;
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
