package com.ex;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="employee")
public class Employee {
	@Id
	@Column(name="id")
	
private int id;
	@Column(name="name")
private String name;
	@Column(name="salary")
private int salary;
	@Column(name="branch")
private String branch;
	@Column(name="prohibition")
private String prohibition;
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
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
public String getProhibition() {
	return prohibition;
}
public void setProhibition(String prohibition) {
	this.prohibition = prohibition;
}

}
