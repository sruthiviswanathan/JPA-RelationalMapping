package com.zilker.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zilker.jpa.beans.Employee;
import com.zilker.jpa.delegate.EmployeeDelegate;


@RestController
public class EmployeeController {

	@Autowired
	EmployeeDelegate employeeDelegate;	
	
	
	@PostMapping("/employees")
	public Employee registerEmployee(@RequestBody Employee employee) {
		Employee employees = null;
	
		try {
		employees  = employeeDelegate.registerEmployee(employee);	
		}catch(Exception e) {
			
		}
		
		return  employees;
	}
	
	@GetMapping("/employees")
	public List <Employee>  getAllEmployees() {
		List <Employee> employeeList = null;
		try {
			
		employeeList = employeeDelegate.viewEmployeeDetails();
		}catch(Exception e) {
			
		}
		return employeeList;
	}
	
	
}
