package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.ICLOCK_TRASACTION;
import com.example.demo.Service.IICLOCK_TRANSACTIONService;



@RestController
@RequestMapping("/api")
public class ICLOCK_TRANSACTIONRestController {

	@Autowired
	private IICLOCK_TRANSACTIONService iclockTService;
	
	@GetMapping("/iclockT")
	public List<ICLOCK_TRASACTION> index(){
		return iclockTService.findAll();
	}
	
	@GetMapping("/iclockT/{id}")
	public ICLOCK_TRASACTION show(@PathVariable Long id) {
		return iclockTService.findById(id);
	}
	
	@PostMapping("/iclockT")
    @ResponseStatus(HttpStatus.CREATED)
	public ICLOCK_TRASACTION create(@RequestBody ICLOCK_TRASACTION iclockT) {
		return iclockTService.save(iclockT);
	}
	
	@PutMapping("/iclockT/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public ICLOCK_TRASACTION update(@RequestBody ICLOCK_TRASACTION iclockT,@PathVariable Long id) {
		ICLOCK_TRASACTION iclockTActual=iclockTService.findById(id);
		iclockTActual.setArea_alias(iclockT.getArea_alias());
		return iclockTService.save(iclockTActual);
	}
	
	@DeleteMapping("/iclockT/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		iclockTService.delete(id);
	}
}
