package com.springboot.crudrest.service;

import java.util.List;

import com.springboot.crudrest.model.Employee;

public interface EmployeeService {

	public Employee saveEmployee(Employee employee);
	
	public List<Employee> getEmployees();
	
	
}
