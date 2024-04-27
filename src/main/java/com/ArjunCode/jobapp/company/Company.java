package com.ArjunCode.jobapp.company;

import com.ArjunCode.jobapp.job.Job;
import com.ArjunCode.jobapp.review.Review;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity

public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;

    //need to map job to the company. the company has many jobs
    @JsonIgnore
    @OneToMany(mappedBy = "company") // 1 company many jobs
    private List<Job> jobs;


    @OneToMany(mappedBy = "company") // 1 company many jobs
    private List<Review> reviews;


    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    //for JPA
    public Company() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
}

