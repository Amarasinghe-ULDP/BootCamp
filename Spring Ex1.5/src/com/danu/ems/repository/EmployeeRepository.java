package com.danu.ems.repository;

import java.util.List;

import com.danu.ems.model.Employee;

public interface EmployeeRepository {

	/* (non-Javadoc)
	 * @see com.danushka.ems.Repository.HibernateEmployeeRepository#getAllEmployees()
	 */
	List<Employee> getAllEmployees();

}