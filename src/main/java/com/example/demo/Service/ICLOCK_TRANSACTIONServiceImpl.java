package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.IICLOCK_TRANSACTIONDao;
import com.example.demo.Entity.ICLOCK_TRASACTION;

@Service
public class ICLOCK_TRANSACTIONServiceImpl implements IICLOCK_TRANSACTIONService{

	@Autowired
	private IICLOCK_TRANSACTIONDao iclockTDao;
	
	@Override
	public List<ICLOCK_TRASACTION> findAll() {

		return (List<ICLOCK_TRASACTION>)iclockTDao.findAll();
	}

	@Override
	public ICLOCK_TRASACTION save(ICLOCK_TRASACTION iclockT) {

		return iclockTDao.save(iclockT);
	}

	@Override
	public ICLOCK_TRASACTION findById(Long id) {

		return iclockTDao.findById(id).orElse(null);
	}

	@Override
	public void delete(Long id) {

		iclockTDao.deleteById(id);
	}

	
}
