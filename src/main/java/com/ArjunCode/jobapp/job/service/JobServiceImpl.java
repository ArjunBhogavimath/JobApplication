package com.ArjunCode.jobapp.job.service;

import com.ArjunCode.jobapp.job.Job;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobServiceImpl implements JobService{

    private List<Job> jobs = new ArrayList<>();
    private Long nextId = 1L;

    @Override
    public List<Job> findAll() {
        return jobs;
    }

    @Override
    public void createJob(Job job) {
        job.setId(nextId++);
        jobs.add(job);
    }

    @Override
    public Job getJobById(Long id) {
        for (Job job : jobs){
            if(job.getId().equals(id)){
                return job;
            }
        }
        return null;
    }

    @Override
    public boolean deleteJobById(Long id) {
        return jobs.removeIf(job -> job.getId().equals(id));
    }

    @Override
    public boolean updateJobById(Job job, Long id) {
        for( Job job1 : jobs){
            if(job1.getId().equals(id)){
                job1.setDescription(job.getDescription());
                job1.setLocation(job.getLocation());
                job1.setTitle(job.getTitle());
                job1.setMaxSalary(job.getMaxSalary());
                job1.setMinSalary(job.getMinSalary());
                return true;
            }
        }
        return false;
    }
}
