package com.tcs.mcoe.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="mongodb")
public class Employee {
	@Id
	private String id;
	private String name;
	private String place;
	private String hobby;
	private int salary;

	public Employee() {

	}

	public Employee(String name, String place, String hobby, int salary) {
		this.name=name;
		this.place=place;
		this.hobby=hobby;
		this.salary=salary;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlace() {
		return this.place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getHobby() {
		return this.hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public int getSalary() {
		return this.salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
