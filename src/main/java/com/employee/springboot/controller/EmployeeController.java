package com.employee.springboot.controller;


import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.springboot.repository.*;
import com.employee.springboot.utils.EmployeeUtils;
import com.employee.springboot.entity.*;

@RestController
public class EmployeeController {
	
	@Autowired
	IEmpRep empRepo;
	
	@PostMapping("/employees")
	public ResponseEntity<Employee> saveEmp(@RequestBody Employee emp) {
		
		try {
			System.out.println("Received Employee: " + emp);
			Long id=EmployeeUtils.getHighestEmployeeId(empRepo.findAll());
			id=id+1;
			System.out.println("Outgoing ID::" +id);
			emp.setEmployeeId(id);
			return new ResponseEntity<>(empRepo.save(emp),HttpStatus.CREATED);
		}catch(Exception e)
		{
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/employees")
	public ResponseEntity<List<Employee>> getAllCustomers(){
		
		try {
			
			List<Employee> list= empRepo.findAll();
			if(list.isEmpty() || list.size()==0)
			{
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			
			return new ResponseEntity<>(list,HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/employees/{id}")
	public ResponseEntity<Employee> getEmployee(@PathVariable Long id){
		
		Optional<Employee> emp=empRepo.findById(id);
		
		if(emp.isPresent())
		{
			return new ResponseEntity<>(emp.get(),HttpStatus.OK);
		}
		
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
	@PutMapping("/employees/{employeeId}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable Long employeeId, @RequestBody Employee updatedEmployee) {
	    try {
	        Optional<Employee> existingEmployee = empRepo.findById(employeeId);
	        
	        if (existingEmployee.isPresent()) {
	            Employee employeeToUpdate = existingEmployee.get();
	            employeeToUpdate.setEmployeeName(updatedEmployee.getEmployeeName());
	            employeeToUpdate.setAge(updatedEmployee.getAge());
	            employeeToUpdate.setDepartment(updatedEmployee.getDepartment());
	            employeeToUpdate.setLocation(updatedEmployee.getLocation());
	            employeeToUpdate.setJob(updatedEmployee.getJob());
	            // You can update other fields here
	            
	            return new ResponseEntity<>(empRepo.save(employeeToUpdate), HttpStatus.OK);
	        } else {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        }
	    } catch (Exception e) {
	        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	}
	
	@DeleteMapping("/employees/{employeeId}")
	public ResponseEntity<Map<String, Object>> deleteEmployee(@PathVariable Long employeeId) {
		
		Map<String, Object> response = new LinkedHashMap<>();
		try {
			Optional<Employee> ep=empRepo.findById(employeeId);
			if(ep.isPresent()) {
				empRepo.delete(ep.get());
				response.put("status", "success");
				response.put("message", "deleted");
				response.put("data",ep);
				return new ResponseEntity<>(response,HttpStatus.OK);
			}
			response.put("status", "issue");
			response.put("message", "not_found");
			response.put("data",null);
			
			System.out.println("pelonaaaaaaaaaaah!");
			return new ResponseEntity<>(response,HttpStatus.NO_CONTENT);
		}
		catch(Exception e)
		{
			
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
