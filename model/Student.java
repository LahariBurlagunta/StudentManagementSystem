package com.example15.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table; 


@Entity 
@Table(name = " students")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 private Long id ;
	
	@Column(name = "first_name" , nullable = false)
	 private String firstName;

	@Column(name = "last_name")
	 private String lastName;
	
	@Column(name = "email")
	 private String email;
	
     @Column(name = "Phno")
	 private String phno;
	
     public Student() {
		 
	 }
	 
	 public Student(Long id, String firstName, String lastName, String email, String phno) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phno = phno;
	}
	 
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	
	 
	 
	 
	
	 
	 
}
