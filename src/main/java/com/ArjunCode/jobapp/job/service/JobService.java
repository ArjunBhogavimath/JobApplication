package com.ArjunCode.jobapp.job.service;

import com.ArjunCode.jobapp.job.Job;

import java.util.List;

public interface JobService {
    List<Job> findAll();
    void createJob(Job job);

    Job getJobById(Long id);

    boolean deleteJobById(Long id);

    boolean updateJobById(Job job, Long id);
}
