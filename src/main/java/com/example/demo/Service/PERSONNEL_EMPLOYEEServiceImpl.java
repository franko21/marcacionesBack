package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.IPERSONNEL_EMPLOYEEDao;
import com.example.demo.Entity.PERSONNEL_EMPLOYEE;

@Service
public class PERSONNEL_EMPLOYEEServiceImpl implements IPERSONNEL_EMPLOYEEService{
	
	@Autowired
	private IPERSONNEL_EMPLOYEEDao personnel_employeeDao;

	@Override
	public List<PERSONNEL_EMPLOYEE> findAll() {

		return (List<PERSONNEL_EMPLOYEE>)personnel_employeeDao.findAll();
	}

	@Override
	public PERSONNEL_EMPLOYEE save(PERSONNEL_EMPLOYEE personnel_employeee) {

		return personnel_employeeDao.save(personnel_employeee);
	}

	@Override
	public PERSONNEL_EMPLOYEE findById(Long id) {

		return personnel_employeeDao.findById(id).orElse(null);
	}

	@Override
	public void delete(Long id) {
		
		personnel_employeeDao.deleteById(id);
	}

	@Override
	public List<String> findByCedEmp(String emp_code) {

		return personnel_employeeDao.findByCedEmp(emp_code);
	}

	@Override
	public List<String> findByFechEmp(String fechaI, String fechaF) {

		return personnel_employeeDao.findByFechEmp(fechaI, fechaF);
	}
	
}
