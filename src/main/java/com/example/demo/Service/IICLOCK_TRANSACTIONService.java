package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.ICLOCK_TRASACTION;

public interface IICLOCK_TRANSACTIONService {
	
	public List<ICLOCK_TRASACTION> findAll();

	public ICLOCK_TRASACTION save(ICLOCK_TRASACTION iclockT);
	
	public ICLOCK_TRASACTION findById(Long id);
	
	public void delete(Long id);
}
