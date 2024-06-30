package com.bbsmca05.EmployeeApp.service;

import java.util.List;

import com.bbsmca05.EmployeeApp.entity.EmployeeDetail;

public interface EmployeeService {
	
	List<EmployeeDetail> getEmployee();
	EmployeeDetail createEMP(EmployeeDetail e);

}
