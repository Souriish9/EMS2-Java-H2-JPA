package com.employee.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.springboot.entity.Employee;



public interface IEmpRep extends JpaRepository<Employee, Long> {

}
