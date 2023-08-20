package com.employee.springboot.utils;

import java.util.List;

import com.employee.springboot.entity.Employee;

public class EmployeeUtils {

    public static long getHighestEmployeeId(List<Employee> employeeList) {
        long highestEmployeeId = -1; // Initialize to a value that's lower than any possible employeeId

        for (Employee employee : employeeList) {
            if (employee.getEmployeeId() > highestEmployeeId) {
                highestEmployeeId = employee.getEmployeeId();
            }
        }

        return highestEmployeeId;
    }

    // Other utility methods can be added here if needed
}

