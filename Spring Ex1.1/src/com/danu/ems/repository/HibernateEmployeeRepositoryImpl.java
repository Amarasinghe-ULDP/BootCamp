package com.danu.ems.repository;

import java.util.List;
import java.util.ArrayList;

import com.danu.ems.model.Employee;

public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {
	
	/* (non-Javadoc)
	 * @see com.danu.ems.repository.EmployeeRepository#getAllEmployees()
	 */
	@Override
	public List<Employee> getAllEmployees(){
		
		Employee employee = new Employee();
		List<Employee> employees = new ArrayList<>();
		employee.setLocation("Padukka");
		employee.setName("Danushka");
		employees.add(employee);
		return employees;
		
	}

}
