package com.pagmaa.demo.employeeRegistration.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pagmaa.demo.employeeRegistration.entity.Employer;
import com.pagmaa.demo.employeeRegistration.repository.EmployerRepo;
import com.pagmaa.demo.employeeRegistration.service.EmployerService;

@Service
public class EmployerServiceImpl implements EmployerService {

	@Autowired
	private EmployerRepo employerRepo;
	
	@Override
	public Optional<Employer> findById(Integer id) {
		return employerRepo.findById(id);
	}

	@Override
	public List<Employer> findAll(String name) {
		// TODO Auto-generated method stub
		return employerRepo.findAll(name);
	}

	@Override
	public List<Employer> findByName(String name) {
		// TODO Auto-generated method stub
		return employerRepo.findByName(name);
	}

	@Override
	public List<Employer> findAll() {
		// TODO Auto-generated method stub
		return employerRepo.findAll();
	}
	
	
	

}
