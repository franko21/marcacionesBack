package com.example.demo.Service;

import java.sql.Date;
import java.util.List;

import com.example.demo.Entity.CHECKINOUT;


public interface ICHECKINOUTService {

	public List<CHECKINOUT> findAll();
	
	public CHECKINOUT save(CHECKINOUT checkinout);
	
	public CHECKINOUT findById(Long userid);
	
	public void delete(Long USERID);
}
