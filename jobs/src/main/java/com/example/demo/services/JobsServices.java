package com.example.demo.services;

import org.springframework.stereotype.Service;
import com.example.demo.entity.JobsEntity;
import com.example.demo.repository.JobsRepository;
import java.util.List;
import java.util.Optional;

@Service
public class JobsServices {
	private final JobsRepository jobsRepository ;

	public JobsServices(JobsRepository jobsRepository) {
		this.jobsRepository = jobsRepository;
	}

	public <Jobs> List<JobsEntity> findAllJobs() {
		return jobsRepository.findAll();
	}

	public <Jobs> Optional<JobsEntity> findJobById(String jobId) {
		return jobsRepository.findById(jobId);
	}

	public <Jobs> Jobs updateJob(String jobId, Jobs updatedJob) {
		Optional<JobsEntity> existingJob = jobsRepository.findById(jobId);
		if (existingJob.isPresent()) {
			((JobsEntity) updatedJob).setJOBID(jobId);
		}
		return null; // You can handle the not found scenario differently
	}

	public void deleteJob(String jobId) {
		jobsRepository.deleteById(jobId);
	}

	public <Jobs> List<JobsEntity> selectAll() {
		return jobsRepository.findAll();
	}

	public <Jobs> Optional<JobsEntity> selectOne(String jobId) {
		return jobsRepository.findById(jobId);
	}

	public <Jobs> Optional<JobsEntity> findJobsByTitle(String jobTitle) {
		return jobsRepository.findById(jobTitle);
	}

	public <Jobs> Jobs addJob(Jobs job) {
		// TODO Auto-generated method stub
		return null;
	}
}
