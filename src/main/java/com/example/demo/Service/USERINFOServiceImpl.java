package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.Dao.IUSERINFODao;
import com.example.demo.Entity.USERINFO;

@Service
public class USERINFOServiceImpl implements IUSERINFOService{
	
	@Autowired
	private IUSERINFODao userinfoDao;

	@Override
	@Transactional(readOnly = true)
	public List<USERINFO> findAll() {

		return (List<USERINFO>)userinfoDao.findAll();
	}

	@Override
	@Transactional
	public USERINFO save(USERINFO userinfo) {
		
		return userinfoDao.save(userinfo);
	}

	@Override
	@Transactional(readOnly = true)
	public USERINFO findById(Long USERID) {

		return userinfoDao.findById(USERID).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long USERID) {

		userinfoDao.deleteById(USERID);
	}
	
	
}
