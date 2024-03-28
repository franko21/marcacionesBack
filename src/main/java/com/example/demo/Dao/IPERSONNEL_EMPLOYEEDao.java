package com.example.demo.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


import com.example.demo.Entity.PERSONNEL_EMPLOYEE;

public interface IPERSONNEL_EMPLOYEEDao extends CrudRepository<PERSONNEL_EMPLOYEE,Long>{
	

    @Query(value="SELECT emp.emp_code,emp.first_name,tra.emp_code,tra.emp_id,*"
    		+ " FROM iclock_transaction tra JOIN personnel_employee emp ON tra.emp_id = emp.id WHERE tra.emp_code = :emp_code ORDER BY emp.first_name, tra.punch_time DESC", nativeQuery=true)
    List<String> findByCedEmp(@Param("emp_code") String emp_code);
    
    @Query(value="SELECT emp.emp_code,emp.first_name,tra.emp_code,tra.emp_id,*"
    		+ " FROM iclock_transaction tra JOIN personnel_employee emp ON tra.emp_id = emp.id WHERE tra.punch_time BETWEEN :fechaI AND :fechaF ORDER BY emp.first_name, tra.punch_time DESC", nativeQuery=true)
    List<String> findByFechEmp(@Param("fechaI") String fechaI,@Param("fechaF") String fechaF);

}
