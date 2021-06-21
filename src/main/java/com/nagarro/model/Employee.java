package com.nagarro.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int employee_Code;
	
	private String employee_Name;
	private String location;
	private String email;
	private String dob;
	public int getEmployee_Code() {
		return employee_Code;
	}
	public void setEmployee_Code(int employee_Code) {
		this.employee_Code = employee_Code;
	}
	public String getEmployee_Name() {
		return employee_Name;
	}
	public void setEmployee_Name(String employee_Name) {
		this.employee_Name = employee_Name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public Employee(int employee_Code, String employee_Name, String location, String email, String dob) {
		super();
		this.employee_Code = employee_Code;
		this.employee_Name = employee_Name;
		this.location = location;
		this.email = email;
		this.dob = dob;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [employee_Code=" + employee_Code + ", employee_Name=" + employee_Name + ", location="
				+ location + ", email=" + email + ", dob=" + dob + "]";
	}
	
	
}
