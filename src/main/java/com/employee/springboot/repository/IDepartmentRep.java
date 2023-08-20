package com.employee.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.springboot.entity.Department;

public interface IDepartmentRep extends JpaRepository<Department, Long> {

}
