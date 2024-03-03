package com.gl.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.gl.bean.Employee;

@Repository
@EnableTransactionManagement
public class EmployeeDAOImpl implements EmployeeDAO {
	
	@Autowired
	SessionFactory sf;
	Session session;
	
	
	public EmployeeDAOImpl(SessionFactory sf) {
	
		this.sf = sf;
		this.session = sf.openSession();
	}

	@Override
	@Transactional
	public void addEmployee(Employee emp) {
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(emp);
		tx.commit();
		
	}

	@Override
	@Transactional
	public void updateEmployee(Employee emp, int id) {
		Transaction tx = session.beginTransaction();
		Employee e = session.get(Employee.class,id);
		e.setEmployeeAddress(emp.getEmployeeAddress());
		e.setEmployeeName(emp.getEmployeeName());
		e.setEmployeePhone(emp.getEmployeePhone());
		e.setEmployeeSalary(emp.getEmployeeSalary());
		session.save(e);
		tx.commit();
		
	}

	@Override
	@Transactional
	public void deleteEmployee(int id) {
		Transaction tx = session.beginTransaction();
	    Employee e = getEmployeeById(id);
	    if(e!=null) {
			session.delete(e);
		}
		else {
			System.out.println("Employee id doesn't exist");
		}
		tx.commit();
		
	}

	@Override
	public List<Employee> getEmployeeList() {
		
		return (List<Employee>) session.createQuery("from Employee").list();
	}

	@Override
	public Employee getEmployeeById(int id) {
		Employee e = session.get(Employee.class,id);
		return e;
	}

}