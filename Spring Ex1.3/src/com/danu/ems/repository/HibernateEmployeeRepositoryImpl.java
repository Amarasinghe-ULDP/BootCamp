package com.danu.ems.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.danu.ems.model.Employee;

public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {
	
	/* (non-Javadoc)
	 * @see com.danushka.ems.Repository.HibernateEmployeeRepository#getAllEmployees()
	 */
	@Override
	public List<Employee> getAllEmployees(){
		
		List<Employee> employees = new ArrayList<>();
		Employee employee = new Employee();
		employee.setLocation("Padukka");
		employee.setName("Danushka");
		employees.add(employee);
		return employees;
		
	}

}
