package com.sgic.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.employee.entities.Employee;
import com.sgic.employee.repositories.EmployeeRepository;


@Service
public class EmployeeServiceImpl implements EmployeeService {
@Autowired
EmployeeRepository employeeRepository;

	@Override
	public void saveEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

	@Override
	public List<Employee> employeeDetails() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Employee updateEmployee(Long employeeId, Employee e) {
		// TODO Auto-generated method stub
		java.util.Optional<Employee> emp = employeeRepository.findById(employeeId);
		Employee employee =emp.get();
		employee.setEmail(e.getEmail());
		employee.setFirstName(e.getFirstName());
		employee.setLastName(e.getLastName());
		employeeRepository.save(employee);
		return employee;
	}

	@Override
	public void deleteDetails(Long employeeId) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(employeeId);
	}

}
