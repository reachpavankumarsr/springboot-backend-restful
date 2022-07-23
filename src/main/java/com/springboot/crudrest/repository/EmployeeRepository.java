package com.springboot.crudrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.crudrest.model.Employee;

//@Repository //no need of @Repository annotation if we extends JpaRepository<Employee, Long>
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	
}
