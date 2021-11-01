package com.sgic.employee.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.employee.entities.Employee;
import com.sgic.employee.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;

	@PostMapping("/employee")
	public ResponseEntity<Object> createIncomingSample(@RequestBody Employee employee) {
		employeeService.saveEmployee(employee);
		return ResponseEntity.ok("Saved Successfully!");
	}
	
	@RequestMapping("/hello")
	public Map<String, String> callAsyncMethod() {
		Map map = new HashMap<Integer, String>();
		map.put("message", "Hello");

		return map; // returns empty braces
	}
	@GetMapping("/getdetails")
	public ResponseEntity<Object> getDetails(){
		
		return ResponseEntity.ok(employeeService.employeeDetails());
			
	}
	
	@PutMapping("/update/{id}")
public ResponseEntity<Object> updateDetails(@PathVariable(value="id")Long employeeId,@RequestBody Employee e){
		
		return ResponseEntity.ok().body(employeeService.updateEmployee(employeeId, e));
		
	}
	
	@DeleteMapping("/delete/{id}")
public ResponseEntity<Object> deleteDetails(@PathVariable(value = "id")Long employeeId){
	
		employeeService.deleteDetails(employeeId);
		return ResponseEntity.ok("Successfully Deleted");
			
	}
	
}
