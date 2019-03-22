package com.zilker.jpa.beans;

import java.io.Serializable;

import javax.persistence.Column;

public class EmployeeSplKey implements Serializable {

	private static final long serialVersionUID = 6843977865924912122L;
	
	@Column(name="employee_id")
	private int employeeId;
	
	@Column(name="speciality_id")
	private int specialtyId;

	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public int getSpecialtyId() {
		return specialtyId;
	}
	public void setSpecialtyId(int specialtyId) {
		this.specialtyId = specialtyId;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
