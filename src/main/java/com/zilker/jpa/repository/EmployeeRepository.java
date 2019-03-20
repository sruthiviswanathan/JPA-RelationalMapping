package com.zilker.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zilker.jpa.beans.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
