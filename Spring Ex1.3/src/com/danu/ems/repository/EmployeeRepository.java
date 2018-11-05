package com.danu.ems.repository;

import java.util.List;

import com.danu.ems.model.Employee;

public interface EmployeeRepository {

	List<Employee> getAllEmployees();

}