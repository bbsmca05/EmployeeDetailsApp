package com.bbsmca05.EmployeeApp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

@Table(name = "employeedb")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeeDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long empID;
	private String name;
	private String dept;
	private Integer salary;
}
