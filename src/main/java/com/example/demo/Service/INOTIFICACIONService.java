package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.NOTIFICACION;

public interface INOTIFICACIONService {
	
	public List<NOTIFICACION> findAll();
	
	public NOTIFICACION save(NOTIFICACION notificacion);
	
	public NOTIFICACION findById(Long ID);
	
	public void delete(Long ID);
}
