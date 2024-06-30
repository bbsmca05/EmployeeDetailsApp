package com.bbsmca05.EmployeeApp.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bbsmca05.EmployeeApp.entity.EmployeeDetail;

@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeDetail, Long>{

}
