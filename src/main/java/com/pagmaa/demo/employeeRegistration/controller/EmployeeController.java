package com.pagmaa.demo.employeeRegistration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pagmaa.demo.employeeRegistration.entity.Employee;
import com.pagmaa.demo.employeeRegistration.service.EmployeeService;

@RestController
@RequestMapping("employee")
public class EmployeeController {

	private final EmployeeService employeeService;
	
	@Autowired
	public EmployeeController(EmployeeService employee) {
		employeeService=employee;
	}	
	
	@GetMapping("/id")
	public Employee getById(@PathVariable("id") Integer id) {
		Employee employee= new Employee();
		employee= employeeService.getEmployee(id);
		return employee;		
	}
	
}
