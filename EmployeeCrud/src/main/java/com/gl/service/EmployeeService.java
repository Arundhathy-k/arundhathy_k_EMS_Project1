package com.gl.service;

import java.util.List;

import com.gl.bean.Employee;

public interface EmployeeService {
	
	public void addEmployee(Employee emp);
	public List<Employee> getEmployeeList();
	public void updateEmployee(Employee emp,int id);
	public void deleteEmployee(int id);
	public Employee getEmployeeById(int id);

}
