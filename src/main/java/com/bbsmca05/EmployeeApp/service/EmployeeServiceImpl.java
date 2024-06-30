package com.bbsmca05.EmployeeApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.bbsmca05.EmployeeApp.entity.EmployeeDetail;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	EmployeeRepo employeeRepo;
	

	public EmployeeServiceImpl(EmployeeRepo employeeRepo) {
		this.employeeRepo = employeeRepo;
	}

	@Override
	public List<EmployeeDetail> getEmployee() {
		// TODO Auto-generated method stub
		return employeeRepo.findAll();
	}

	@Override
	public EmployeeDetail createEMP(EmployeeDetail e) {
		return employeeRepo.save(e);
	}

}
