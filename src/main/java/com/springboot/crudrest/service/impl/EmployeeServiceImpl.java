package com.springboot.crudrest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.crudrest.model.Employee;
import com.springboot.crudrest.repository.EmployeeRepository;
import com.springboot.crudrest.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}


	@Override
	public Employee saveEmployee(Employee newEmployee) {
		return employeeRepository.save(newEmployee);
	}


	@Override
	public List<Employee> getEmployees() {
		return employeeRepository.findAll();
	}
	
	

}
