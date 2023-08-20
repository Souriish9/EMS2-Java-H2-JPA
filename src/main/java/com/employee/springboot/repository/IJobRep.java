package com.employee.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.springboot.entity.Job;

public interface IJobRep extends JpaRepository<Job, Long> {

}
