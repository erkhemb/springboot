package com.pagmaa.demo.employeeRegistration.service;

import java.util.List;
import java.util.Optional;

import org.springframework.transaction.annotation.Transactional;

import com.pagmaa.demo.employeeRegistration.entity.Employer;

@Transactional(readOnly = true)
public interface EmployerService {
	
//	@Transactional
	public Optional<Employer> findById(Integer id);
	
	@Transactional
	public List<Employer> findAll(String name);
	
	@Transactional
	public List<Employer> findByName(String name);
	
//	@Transactional
	public List<Employer> findAll();
}