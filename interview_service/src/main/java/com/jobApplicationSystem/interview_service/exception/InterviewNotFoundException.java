package com.jobApplicationSystem.interview_service.exception;

public class InterviewNotFoundException extends RuntimeException {
    public InterviewNotFoundException(String message) {
        super(message);
    }
}