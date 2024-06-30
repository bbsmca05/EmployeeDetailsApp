package com.bbsmca05.EmployeeApp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bbsmca05.EmployeeApp.entity.EmployeeDetail;
import com.bbsmca05.EmployeeApp.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	private EmployeeService employeeService;
	
	
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@GetMapping("/")
	public String greet() {
		return "Welcome to Employee detail application";
	}
	
	@GetMapping("/welcomeText")
	public String welcome() {
		return "Welcome to Employee detail application. Welcome to Employee detail application. Welcome to Employee detail application";
	}
	
	@GetMapping("/employees")
	public List<EmployeeDetail> getEmployees() {
		return employeeService.getEmployee();
	}
	
	@PostMapping("/createemp")
	public EmployeeDetail createemp(EmployeeDetail e) {
		return employeeService.createEMP(e);
	}

}
