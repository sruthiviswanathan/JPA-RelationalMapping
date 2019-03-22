package com.zilker.jpa.beans;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="specialty")
public class Speciality {

	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY )
	private int id;
	
	@Column(name="name")
	private String name;

	@ManyToMany(mappedBy="specialityList",fetch=FetchType.EAGER)
	private Set<Employee> employee;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(Set<Employee> employee) {
		this.employee = employee;
	}
	
	
}
