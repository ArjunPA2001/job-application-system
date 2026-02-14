package com.jobApplicationSystem.interview_service.controller;

import org.springframework.web.bind.annotation.RestController;

import com.jobApplicationSystem.interview_service.dto.InterviewResponse;
import com.jobApplicationSystem.interview_service.service.InterviewService;

import java.util.List;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController("/interview")
public class InterviewController {

    private InterviewService interviewService;

    public InterviewController(InterviewService interviewService) {
        this.interviewService = interviewService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<InterviewResponse>> getInterviewsByApplicationId(@PathVariable UUID id) {
        List<InterviewResponse> interviews = interviewService.getInterviewsByApplicationId(id);
        return ResponseEntity.ok().body(interviews);
    }
    
}
