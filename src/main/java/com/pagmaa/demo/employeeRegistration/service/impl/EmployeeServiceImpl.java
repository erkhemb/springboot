package com.pagmaa.demo.employeeRegistration.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pagmaa.demo.employeeRegistration.entity.Employee;
import com.pagmaa.demo.employeeRegistration.repository.EmployeeRepo;
import com.pagmaa.demo.employeeRegistration.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepo employeeRepo;
	
	@Override
	public Employee getEmployee(Integer id) {
		// TODO Auto-generated method stub
		return employeeRepo.getOne(id);
	}

	@Override
	public List<Employee> findAll(){
		// TODO Auto-generated method stub
		return employeeRepo.findAll();
	}

	@Override
	public Employee saveOrUpdate(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepo.save(employee);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}


}
