package com.danushka.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danushka.ems.Repository.EmployeeRepository;
import com.danushka.ems.Repository.HibernateEmployeeRepositoryImpl;
import com.danushka.ems.model.Employee;


public class EmployeeServiceImpl implements EmployeeService {
	
	
	EmployeeRepository employeeRespository;// = new HibernateEmployeeRepositoryImpl();
	
	public EmployeeServiceImpl() {
		System.out.println("Constructor fired");
	}
	
	public EmployeeServiceImpl(EmployeeRepository employeeRespository) {
		System.out.println("Constructor injection fired");
		this.employeeRespository = employeeRespository;
	}

	@Override
	public List<Employee> getAllEmployees(){
		return employeeRespository.getAllEmployees();
		
	}

	public EmployeeRepository getEmployeeRespository() {
		return employeeRespository;
	}

	@Autowired
	public void setEmployeeRespository(EmployeeRepository employeeRespository) {
		System.out.println("setter injection fired");
		this.employeeRespository = employeeRespository;
	}

}
