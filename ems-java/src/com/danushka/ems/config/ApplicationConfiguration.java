package com.danushka.ems.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.danushka.ems.Repository.EmployeeRepository;
import com.danushka.ems.Repository.HibernateEmployeeRepositoryImpl;
import com.danushka.ems.service.EmployeeService;
import com.danushka.ems.service.EmployeeServiceImpl;

@Configuration
@ComponentScan("com.danushka.ems")
@PropertySource("application.properties")
public class ApplicationConfiguration {
	
	@Bean(name="employeeService")
	@Scope("singleton")
	public EmployeeService getEmployeeService(){
		EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();
		
		//employeeServiceImpl.setEmployeeRespository(getEmployeeRepository());
		return employeeServiceImpl;
	}

	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer(){
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	/*@Bean(name="employeeRepository")
	public EmployeeRepository getEmployeeRepository(){
		return new HibernateEmployeeRepositoryImpl();
	}*/
}