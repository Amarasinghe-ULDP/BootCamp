package com.danu.ems.service;

import com.danu.ems.model.Employee;
import com.danu.ems.repository.EmployeeRepository;
import com.danu.ems.repository.HibernateEmployeeRepositoryImpl;

import java.util.List;


public class EmployeeServiceImpl implements EmployeeService {
	
	EmployeeRepository employeeRepository = new HibernateEmployeeRepositoryImpl();

	/* (non-Javadoc)
	 * @see com.danu.ems.service.EmployeeService#getAllEmployees()
	 */
	@Override
	public List<Employee> getAllEmployees(){
		return employeeRepository.getAllEmployees();
		
	}
}
