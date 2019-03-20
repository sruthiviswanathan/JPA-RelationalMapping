package com.zilker.jpa.delegate;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zilker.jpa.beans.Employee;
import com.zilker.jpa.customException.DepartmentNotFoundException;
import com.zilker.jpa.dao.EmployeeDao;


@Service
public class EmployeeDelegate {

	@Autowired
	EmployeeDao employeeDao;	
	
	public Employee registerEmployee(Employee employee) {
		// TODO Auto-generated method stub
		Employee employees = null;
		try {
			employees = employeeDao.registerEmployee(employee);
			if(employees != null) {
				
			}else {
				throw new DepartmentNotFoundException();
			}

		} catch (DepartmentNotFoundException e) {
			System.out.println("department not found");
		}
		
		catch (SQLException e) {
			System.out.println("exception here");
		}
		return employees;
	}

	public List<Employee> viewEmployeeDetails() {
		// TODO Auto-generated method stub
		List <Employee> employeeList = null;

		try {
			employeeList = employeeDao.viewEmployeeDetails();

		} catch (Exception e) {
			System.out.println("exception here");
		}
		return employeeList;
	}

}
