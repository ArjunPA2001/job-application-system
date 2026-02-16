package com.jobApplicationSystem.jobApplication_service.Repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jobApplicationSystem.jobApplication_service.Models.JobApplication;
@Repository
public interface JobApplicationRepository extends JpaRepository<JobApplication,UUID> {

}
