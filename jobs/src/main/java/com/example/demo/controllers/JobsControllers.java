package com.example.demo.controllers;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.JobsEntity;
import com.example.demo.services.JobsServices;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/jobs")
public class JobsControllers {
	private JobsServices jobsService = null;

    public JobsControllers(JobsServices jobsService) {
        this.jobsService = jobsService;
    }

    @GetMapping
    public <Jobs> List<JobsEntity> getAllJobs() {
        return jobsService.findAllJobs();
    }

    @GetMapping("/{jobId}")
    public <Jobs> JobsEntity getJobById(@PathVariable String jobId) {
        Optional<JobsEntity> job = jobsService.findJobById(jobId);
        return job.orElse(null); // You can return an appropriate response if not found
    }

    
    @PutMapping("/{jobId}")
    public <Jobs> Jobs updateJob(@PathVariable String jobId, @RequestBody Jobs updatedJob) {
        return jobsService.updateJob(jobId, updatedJob);
    }

    @DeleteMapping("/{jobId}")
    public void deleteJob(@PathVariable String jobId) {
        jobsService.deleteJob(jobId);
    }
}
