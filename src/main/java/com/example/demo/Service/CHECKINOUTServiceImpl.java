package com.example.demo.Service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.Dao.ICHECKINOUTDao;
import com.example.demo.Entity.CHECKINOUT;

@Service
public class CHECKINOUTServiceImpl implements ICHECKINOUTService{
	
	@Autowired
	private ICHECKINOUTDao checkinoutDao;

	@Override
	@Transactional(readOnly = true)
	public List<CHECKINOUT> findAll() {

		return (List<CHECKINOUT>)checkinoutDao.findAll();
	}

	@Override
	@Transactional
	public CHECKINOUT save(CHECKINOUT checkinout) {

		return checkinoutDao.save(checkinout);
	}

	@Override
	@Transactional(readOnly = true)
	public CHECKINOUT findById(Long USERID) {

		return checkinoutDao.findById(USERID).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long USERID) {
		
		checkinoutDao.deleteById(USERID);
	}
	
	
}
