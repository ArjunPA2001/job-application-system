package com.jobApplicationSystem.interview_service.mapper;

import java.util.UUID;

import com.jobApplicationSystem.interview_service.dto.InterviewRequest;
import com.jobApplicationSystem.interview_service.dto.InterviewResponse;
import com.jobApplicationSystem.interview_service.models.Interview;

public class InterviewMapper {

    public static Interview toInterview(InterviewRequest interviewRequest) {
        Interview interview = new Interview();
        interview.setApplicationId(UUID.fromString(interviewRequest.getApplicationId()));
        interview.setInterviewType(interviewRequest.getInterviewType());
        interview.setMode(interviewRequest.getMode());
        interview.setNotes(interviewRequest.getNotes());
        interview.setRoundNumber(interviewRequest.getRoundNumber());
        interview.setResult(interviewRequest.getResult());
        return interview;
    }

    public static InterviewResponse toDto(Interview interview) {
        InterviewResponse interviewResponse = new InterviewResponse();
        interviewResponse.setInterviewId(interview.getInterviewId().toString());
        interviewResponse.setApplicationId(interview.getApplicationId().toString());
        interviewResponse.setInterviewType(interview.getInterviewType());
        interviewResponse.setMode(interview.getMode());
        interviewResponse.setRoundNumber(interview.getRoundNumber());
        interviewResponse.setNotes(interview.getNotes());
        interviewResponse.setResult(interview.getResult());

        return interviewResponse;
    }
}
