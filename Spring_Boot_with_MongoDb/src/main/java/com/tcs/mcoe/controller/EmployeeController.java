package com.tcs.mcoe.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tcs.mcoe.repository.EmployeeRepository;
import com.tcs.mcoe.model.Employee;

@RestController
@RequestMapping("/")
public class EmployeeController {
	@Autowired
	public EmployeeRepository repo;



	@RequestMapping(value="/add", method=RequestMethod.POST)
	public Employee addEmployee(@RequestBody Employee employee) {
		return repo.save(employee);
	}



	@RequestMapping(value = "/getEmployee/{id}", method=RequestMethod.GET)
	public Employee getEmployee(@PathVariable String id) {
		return repo.findOne(id);
	}



	@RequestMapping(value="/getAllEmployees", method=RequestMethod.GET)
	public List<Employee> getAllEmployees() {
		return repo.findAll(); 
	}



	@RequestMapping(value = "/delete/{id}",method=RequestMethod.DELETE)
	public void deleteEmployee(@PathVariable String id) {
		Employee employees = repo.findOne(id);
		repo.delete(employees.getId());
	}
	
	
	@RequestMapping(value = "/update/{id}",method=RequestMethod.PUT)
	public Employee updateEmployee(@PathVariable String id, @RequestBody Employee employee){
		employee.setId(id);
		return repo.save(employee);
	}

}
