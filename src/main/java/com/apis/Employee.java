package com.apis;

import java.io.Serializable;
import java.sql.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee implements Serializable{
	@Id
	private int id;
	
	private String name;
	private Date dateOfJoining;
	private int salary;
	private String phone;
	private String address;
	
	
	
	public Employee() {
		super();
	}
	
	
	public Employee(int id,String name, Date dateOfJoining, int salary, String phone, String address) {
		super();
		this.id = id;
		this.name = name;
		this.dateOfJoining = dateOfJoining;
		this.salary = salary;
		this.phone = phone;
		this.address = address;
	}


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
	public Date getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

	@Override
	public String toString() {
		return "Employee [name=" + name + ", dateOfJoining=" + dateOfJoining + ", salary=" + salary + ", phone=" + phone
				+ ", address=" + address + "]";
	}
}
