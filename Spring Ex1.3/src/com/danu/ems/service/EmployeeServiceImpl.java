package com.danu.ems.service;

import java.util.List;

import com.danu.ems.model.Employee;
import com.danu.ems.repository.EmployeeRepository;

public class EmployeeServiceImpl implements EmployeeService {
	
	EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(){
		System.out.println("Constructor fired");
		
	}
	public EmployeeServiceImpl(EmployeeRepository employeeRepository){
		System.out.println("Paramiterized Constructor fired");
		this.employeeRepository=employeeRepository;
	}
	
	public EmployeeRepository getEmployeeRepository() {
		return employeeRepository;
	}

	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		System.out.println("Setter fired");
		this.employeeRepository = employeeRepository;
	}
	
	public List<Employee> getAllEmployees(){
		return employeeRepository.getAllEmployees();
	}


}
