package com.zilker.jpa.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.zilker.jpa.beans.Address;
import com.zilker.jpa.beans.Department;
import com.zilker.jpa.beans.Employee;
import com.zilker.jpa.repository.AddressRepository;
import com.zilker.jpa.repository.DepartmentRepository;
import com.zilker.jpa.repository.EmployeeRepository;


@Repository
public class EmployeeDao {

	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private AddressRepository addressRepository;
	@Autowired
	private DepartmentRepository departmentRepository;
	
	public Employee registerEmployee(Employee employee)throws SQLException {
		// TODO Auto-generated method stub
		Employee employees = new Employee();
		Address address = new Address();
		Department department = new Department();
		boolean flag=false;
		try {
			
			flag = departmentRepository.existsByName(employee.getDepartment().getName());
			if(flag) {
				department=departmentRepository.findByName(employee.getDepartment().getName());
				address = addressRepository.save(employee.getAddress());
				employee.setDepartment(department);
				employee.setAddress(address);	
				employees = employeeRepository.save(employee);
			}else {
				employees= null;
			}
					
			}catch(Exception e) {
				System.out.println(e);
			
			}
		return employees;
	}

	public List<Employee> viewEmployeeDetails() throws SQLException {
		// TODO Auto-generated method stub
		List <Employee> employeeList = new ArrayList<Employee>();

		try {
			employeeList = employeeRepository.findAll();

		} catch (Exception e) {
			System.out.println("exception here");
		}
		return employeeList;
	}

}
