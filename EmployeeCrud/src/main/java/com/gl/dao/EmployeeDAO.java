package com.gl.dao;

import java.util.List;

import com.gl.bean.Employee;

public interface EmployeeDAO {
	
	public void addEmployee(Employee emp);
	public List<Employee> getEmployeeList();
	public void updateEmployee(Employee emp,int id);
	public void deleteEmployee(int id);
	public Employee getEmployeeById(int id);
}
