package com.jobApplicationSystem.interview_service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jobApplicationSystem.interview_service.dto.InterviewResponse;
import com.jobApplicationSystem.interview_service.repository.InterviewRepository;

@Service
public class InterviewService {

    private InterviewRepository interviewRepo;

    public InterviewService(InterviewRepository interviewRepo) {
        this.interviewRepo = interviewRepo;
    }

    public List<InterviewResponse> getInterviews()
}
