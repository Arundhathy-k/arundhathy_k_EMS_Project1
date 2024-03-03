package com.gl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.bean.Employee;
import com.gl.dao.EmployeeDAO;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeDAO dao;

	@Override
	public void addEmployee(Employee emp) {
	dao.addEmployee(emp);
		
	}

	@Override
	public void updateEmployee(Employee emp, int id) {
		dao.updateEmployee(emp, id);
		
	}

	@Override
	public void deleteEmployee(int id) {
		dao.deleteEmployee(id);
		
	}

	@Override
	public List<Employee> getEmployeeList() {
		
		return dao.getEmployeeList();
	}

	@Override
	public Employee getEmployeeById(int id) {
		
		return dao.getEmployeeById(id);
	}

}
