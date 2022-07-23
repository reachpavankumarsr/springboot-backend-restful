package com.springboot.crudrest.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.crudrest.model.Employee;
import com.springboot.crudrest.service.EmployeeService;

/**
 * @author dvg
 *
 */
/**
 * @author dvg
 *
 */
@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	
	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	//URL: http://localhost:8080/api/employees/add
	@PostMapping(path="/employees/add")
	public ResponseEntity<Employee> saveEmployee(@RequestBody  Employee newEmployee){
		System.out.println("---Entered saveEmployee method "+newEmployee.toString());
		return new ResponseEntity<Employee>(employeeService.saveEmployee(newEmployee), HttpStatus.CREATED);
		
	}
	
	/**
	 * getEmployees()
	 * @return List<Employee>
	 */
	//URL: http://localhost:8080/api/employees
	@GetMapping(path="/employees")
	public List<Employee> getEmployees(){
		return employeeService.getEmployees();
		
	}
}
