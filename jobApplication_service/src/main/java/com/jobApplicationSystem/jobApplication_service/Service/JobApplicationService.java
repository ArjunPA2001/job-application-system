package com.jobApplicationSystem.jobApplication_service.Service;

import org.springframework.stereotype.Service;

import com.jobApplicationSystem.jobApplication_service.Repositories.JobApplicationRepository;

@Service
public class JobApplicationService {
    private JobApplicationRepository jobApplicationRepo;

    public JobApplicationService(JobApplicationRepository jobApplicationRepo) {
        this.jobApplicationRepo = jobApplicationRepo;
    }
    
}
