package com.sgic.employee.service;

import java.util.List;

import com.sgic.employee.entities.Employee;



public interface EmployeeService {
	 void saveEmployee(Employee employee);
	 List<Employee> employeeDetails();
	 Employee updateEmployee(Long employeeId, Employee employeeDetails);
	 void deleteDetails(Long employeeId);
}
