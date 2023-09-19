package com.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="students")
public class student {
//	stdid bigint NOT NULL AUTO_INCREMENT,
//	std_name VARCHAR(50) DEFAULT NULL,
//	std_salary float DEFAULT NULL,
//	std_age INTEGER DEFAULT NULL,
//	std_city VARCHAR(50) DEFAULT NULL
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long stdid;
	
	@Column(name="std_name")
	private String std_name;
	
	@Column(name="std_salary")
	private Float std_salary;
	
	@Column(name="std_age")
	private int std_age;
	
	@Column(name="std_city")
	private String std_city;

	public Long getStdid() {
		return stdid;
	}

	public void setStdid(Long stdid) {
		this.stdid = stdid;
	}

	public String getStd_name() {
		return std_name;
	}

	public void setStd_name(String std_name) {
		this.std_name = std_name;
	}

	public Float getStd_salary() {
		return std_salary;
	}

	public void setStd_salary(Float std_salary) {
		this.std_salary = std_salary;
	}

	public int getStd_age() {
		return std_age;
	}

	public void setStd_age(int std_age) {
		this.std_age = std_age;
	}

	public String getStd_city() {
		return std_city;
	}

	public void setStd_city(String std_city) {
		this.std_city = std_city;
	}

	public student(Long stdid, String std_name, Float std_salary, int std_age, String std_city) {
		super();
		this.stdid = stdid;
		this.std_name = std_name;
		this.std_salary = std_salary;
		this.std_age = std_age;
		this.std_city = std_city;
	}
	public student() {
		
	}

	@Override
	public String toString() {
		return "student [stdid=" + stdid + ", std_name=" + std_name + ", std_salary=" + std_salary + ", std_age="
				+ std_age + ", std_city=" + std_city + "]";
	}
	
}
