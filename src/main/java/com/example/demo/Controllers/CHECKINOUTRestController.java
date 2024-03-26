package com.example.demo.Controllers;

import java.sql.Date;
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

import com.example.demo.Entity.CHECKINOUT;
import com.example.demo.Service.ICHECKINOUTService;



@RestController
@RequestMapping("/api")
public class CHECKINOUTRestController {
	@Autowired
	private ICHECKINOUTService checkinoutService;
	
	@GetMapping("/checkinout")
	public List<CHECKINOUT> index(){
		return checkinoutService.findAll();
	}
	
	@GetMapping("/checkinout/{userid}")
	public CHECKINOUT show(@PathVariable Long userid) {
		return checkinoutService.findById(userid);
	}
	
	@PostMapping("/checkinout")
    @ResponseStatus(HttpStatus.CREATED)
	public CHECKINOUT create(@RequestBody CHECKINOUT checkinout) {
		return checkinoutService.save(checkinout);
	}
	
	@PutMapping("/checkinout/{userid}")
	@ResponseStatus(HttpStatus.CREATED)
	public CHECKINOUT update(@RequestBody CHECKINOUT checkinout,@PathVariable Long userid) {
		CHECKINOUT checkinoutActual=checkinoutService.findById(userid);
		checkinoutActual.setChecktime(checkinout.getChecktime());
		return checkinoutService.save(checkinoutActual);
	}
	
	@DeleteMapping("/checkinout/{userid}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long userid) {
		checkinoutService.delete(userid);
	}
}
