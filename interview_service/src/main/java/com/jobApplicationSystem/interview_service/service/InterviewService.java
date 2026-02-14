package com.jobApplicationSystem.interview_service.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.jobApplicationSystem.interview_service.dto.InterviewRequest;
import com.jobApplicationSystem.interview_service.dto.InterviewResponse;
import com.jobApplicationSystem.interview_service.exception.InterviewNotFoundException;
import com.jobApplicationSystem.interview_service.mapper.InterviewMapper;
import com.jobApplicationSystem.interview_service.models.Interview;
import com.jobApplicationSystem.interview_service.repository.InterviewRepository;

@Service
public class InterviewService {

    private InterviewRepository interviewRepo;

    public InterviewService(InterviewRepository interviewRepo) {
        this.interviewRepo = interviewRepo;
    }

    public List<InterviewResponse> getInterviews() {
        List<Interview> interviews = interviewRepo.findAll();
        return interviews.stream().map(interview -> InterviewMapper.toDto(interview)).toList();
    }

    public List<InterviewResponse> getInterviewsByApplicationId(UUID applicationId) {
        List<Interview> interviews = interviewRepo.findByApplicationId(applicationId);
        return interviews.stream().map(interview -> InterviewMapper.toDto(interview)).toList();
    }

    public InterviewResponse createInterview(InterviewRequest request) {
        Interview interview = interviewRepo.save(InterviewMapper.toInterview(request));
        return InterviewMapper.toDto(interview);
    }

    public InterviewResponse updateInterview(UUID interviewId, InterviewRequest interviewRequest) {
        Interview interview = interviewRepo.findById(interviewId).orElseThrow(() -> new InterviewNotFoundException("Interview with ID " + interviewId + " not found"));
        
        interview.setApplicationId(UUID.fromString(interviewRequest.getApplicationId()));
        interview.setInterviewType(interviewRequest.getInterviewType());
        interview.setMode(interviewRequest.getMode());
        interview.setNotes(interviewRequest.getNotes());
        interview.setRoundNumber(interviewRequest.getRoundNumber());
        interview.setResult(interviewRequest.getResult());

        Interview updatedInterview = interviewRepo.save(interview);
        return InterviewMapper.toDto(updatedInterview);
    }

    public void deleteInterview(UUID interviewId) {
        interviewRepo.deleteById(interviewId);
    }
}
