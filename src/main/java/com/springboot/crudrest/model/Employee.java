package com.springboot.crudrest.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.Nullable;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Entity// this annotation specify that the class is an Entity 
@Table(name="employee") //this annotation specifies the table in the
@Data												// database with which this enity is mapped
public class Employee {
	
	@Id//this annotation specify that the primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)//this annotation specifies the 
																											//generation strategies for the
																											//values of primary key
	private long id;
	@Column(name="first_name", nullable=false)
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="email")
	private String email;
	

}