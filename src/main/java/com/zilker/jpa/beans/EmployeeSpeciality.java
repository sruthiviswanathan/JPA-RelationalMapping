package com.zilker.jpa.beans;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="employee_specialty")
public class EmployeeSpeciality {

	 @EmbeddedId
	 EmployeeSplKey id;
	
	@ManyToOne
	@JoinColumn(name="employee_id",insertable=false,updatable=false)
	private Employee employee;
	
	@ManyToOne
	@JoinColumn(name="specialty_id",insertable=false,updatable=false)
	private Speciality speciality;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Speciality getSpeciality() {
		return speciality;
	}

	public void setSpeciality(Speciality speciality) {
		this.speciality = speciality;
	}
	
	
	
	
	
}
