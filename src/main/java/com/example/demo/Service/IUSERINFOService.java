package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.USERINFO;

public interface IUSERINFOService {

	public List<USERINFO> findAll();
	
	public USERINFO save(USERINFO userinfo);
	
	public USERINFO findById(Long USERID);
	
	public void delete(Long USERID);
	
}
