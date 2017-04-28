package com.db;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Id;
	private String firstName;
	
	public Employee(){
		//require by JPA.
	}
	
	public Employee(String firstName){
		super();
		this.firstName = firstName;
	}

}
