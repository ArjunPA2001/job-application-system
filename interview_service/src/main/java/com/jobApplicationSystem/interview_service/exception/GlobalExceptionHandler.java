package com.jobApplicationSystem.interview_service.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(InterviewNotFoundException.class)
    public ResponseEntity<Map<String,String>> interviewNotFoundExceptionHandler(InterviewNotFoundException ex) {
        Map<String,String> errors = new HashMap<>();
        errors.put("message", "Interview with the given Id does not exists");
        return ResponseEntity.badRequest().body(errors);
    }
}
