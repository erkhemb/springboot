package com.pagmaa.demo.employeeRegistration.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pagmaa.demo.employeeRegistration.entity.Employer;
import com.pagmaa.demo.employeeRegistration.service.EmployeeService;
import com.pagmaa.demo.employeeRegistration.service.EmployerService;

@RestController
@RequestMapping("/employer")
public class EmployerController {
	
	
	private final EmployerService employerService;
	
	@Autowired
	public EmployerController(EmployerService employerService) {
		
		this.employerService = employerService;
	}
	
	 @GetMapping(value="/{employerId}")	
	    public Optional<Employer> getById(@PathVariable("employerId") Integer employerId) {
		// System.out.println("get employer");
		   return employerService.findById(employerId);
    }
	 
	 @GetMapping(value="/search")	
	    public List<Employer> searchByName() {
		// System.out.println("get employer");
		   return employerService.findAll();
 }
	
	
	
	

}
