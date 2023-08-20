package com.employee.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


@JsonPropertyOrder({"employeeId", "employeeName", "age", "sex", "department", "job", "location"})
@Entity
@Table(name = "EMPLOYEES")
public class Employee {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EMPLOYEE_ID")
	private Long employeeId;


    @Column(name = "EMPLOYEE_NAME")
    private String employeeName;

    @Column(name = "AGE")
    private Integer age;

   
    @Column(name = "DEPARTMENT_ID")
    private Long department;

    @Column(name = "JOB_ID")
    private Long job;

    @Column(name = "LOCATION_ID")
    private Long location;

    @Column(name = "SEX")
    private String sex;
    
 // Getter and Setter for employeeId
    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    // Getter and Setter for employeeName
    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    // Getter and Setter for age
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    
    public String getSex() {
    	return sex;
    }
    
    public void setSex(String sex) {
    	this.sex=sex;
    }


    // Constructors, getters, setters, and toString methods
    
    public Long getDepartment() {
        return department;
    }

    public void setDepartment(Long department) {
        this.department = department;
    }

    public Long getJob() {
        return job;
    }

    public void setJob(Long job) {
        this.job = job;
    }

    public Long getLocation() {
        return location;
    }

    public void setLocation(Long location) {
        this.location = location;
    }

    // ... (other getters and setters)

    @Override
    public String toString() {
        return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", age=" + age
                + ", department=" + department + ", job=" + job + ", location=" + location + ", sex=" + sex + "]";
    }
}