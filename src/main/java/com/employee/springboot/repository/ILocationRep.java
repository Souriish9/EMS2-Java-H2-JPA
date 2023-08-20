package com.employee.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.springboot.entity.Location;

public interface ILocationRep extends JpaRepository<Location, Long> {

}
