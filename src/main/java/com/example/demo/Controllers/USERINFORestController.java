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

import com.example.demo.Entity.USERINFO;
import com.example.demo.Service.IUSERINFOService;

@RestController
@RequestMapping("/api")
public class USERINFORestController {
	
	@Autowired
	private IUSERINFOService userinfoService;
	
	@GetMapping("/userinfo")
	public List<USERINFO> index(){
		return userinfoService.findAll();
	}
	
	@GetMapping("/userinfo/{userid}")
	public USERINFO show(@PathVariable Long userid) {
		return userinfoService.findById(userid);
	}
	
	@PostMapping("/userinfo")
    @ResponseStatus(HttpStatus.CREATED)
	public USERINFO create(@RequestBody USERINFO userinfo) {
		return userinfoService.save(userinfo);
	}
	
	@PutMapping("/userinfo/{userid}")
	@ResponseStatus(HttpStatus.CREATED)
	public USERINFO update(@RequestBody USERINFO userinfo,@PathVariable Long userid) {
		USERINFO userinfoActual=userinfoService.findById(userid);
		userinfoActual.setEmail(userinfo.getEmail());
		return userinfoService.save(userinfoActual);
	}
	
	@DeleteMapping("/userinfo/{userid}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long userid) {
		userinfoService.delete(userid);
	}
}
