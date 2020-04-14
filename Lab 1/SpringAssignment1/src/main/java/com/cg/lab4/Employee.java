package com.cg.lab4;

import java.util.List;

public class Employee {
	
private int employeeId;
private String employeeName;
private double salary;

@Override
public String toString() {
	return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary + "]";
}
public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
List<Employee> emplist;

public List<Employee> getEmplist() {
	return emplist;
}

public void setEmplist(List<Employee> emplist) {
	this.emplist = emplist;
}
 
}
