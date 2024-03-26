package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.Dao.INOTIFICACIONDao;
import com.example.demo.Entity.NOTIFICACION;

@Service
public class NOTIFICACIONServiceImpl implements INOTIFICACIONService{
	
	@Autowired INOTIFICACIONDao notificacionDao;

	@Override
	@Transactional(readOnly = true)
	public List<NOTIFICACION> findAll() {	

		return (List<NOTIFICACION>)notificacionDao.findAll();
	}

	@Override
	@Transactional
	public NOTIFICACION save(NOTIFICACION notificacion) {

		return notificacionDao.save(notificacion);
	}

	@Override
	@Transactional(readOnly = true)
	public NOTIFICACION findById(Long ID) {

		return notificacionDao.findById(ID).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long ID) {

		notificacionDao.deleteById(ID);
	}

}
