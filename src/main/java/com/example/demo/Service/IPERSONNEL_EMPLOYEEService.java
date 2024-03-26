package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.PERSONNEL_EMPLOYEE;

public interface IPERSONNEL_EMPLOYEEService {

	public List<PERSONNEL_EMPLOYEE> findAll();
	
	public PERSONNEL_EMPLOYEE save(PERSONNEL_EMPLOYEE personnel_employeee);
	
	public PERSONNEL_EMPLOYEE findById(Long id);
	
	public void delete(Long id);
	
	public List<String> findByCedEmp(String emp_code);
	
	public List<String> findByFechEmp(String fechaI,String fechaF);
}
