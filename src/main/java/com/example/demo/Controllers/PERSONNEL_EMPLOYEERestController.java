package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.PERSONNEL_EMPLOYEE;
import com.example.demo.Service.IPERSONNEL_EMPLOYEEService;



@RestController
@RequestMapping("/api")
public class PERSONNEL_EMPLOYEERestController {

	@Autowired
	private IPERSONNEL_EMPLOYEEService personnelEService;
	
	@GetMapping("/personnelE")
	public List<PERSONNEL_EMPLOYEE> index(){
		return personnelEService.findAll();
	}
	
	@GetMapping("/personnelE/{id}")
	public PERSONNEL_EMPLOYEE show(@PathVariable Long id) {
		return personnelEService.findById(id);
	}
	
	@PostMapping("/personnelE")
    @ResponseStatus(HttpStatus.CREATED)
	public PERSONNEL_EMPLOYEE create(@RequestBody PERSONNEL_EMPLOYEE personnelE) {
		return personnelEService.save(personnelE);
	}
	
	@PutMapping("/personnelE/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public PERSONNEL_EMPLOYEE update(@RequestBody PERSONNEL_EMPLOYEE personnelE,@PathVariable Long id) {
		PERSONNEL_EMPLOYEE personnelEActual=personnelEService.findById(id);
		personnelEActual.setChange_time(personnelE.getChange_time());
		return personnelEService.save(personnelEActual);
	}
	
	@DeleteMapping("/personnelE/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		personnelEService.delete(id);
	}
	
	@GetMapping("/personnelE/iclockT/{emp_code}")
    public ResponseEntity<List<String>> findByCedEmp(@PathVariable String emp_code) {
        List<String> horario = personnelEService.findByCedEmp(emp_code);
        return ResponseEntity.ok().body(horario);
    }
	
	@GetMapping("/personnelE/iclockT/fecha/{fechaI}/{fechaF}")
    public ResponseEntity<List<String>> findByFechEmp(@PathVariable String fechaI,@PathVariable String fechaF) {
        List<String> horario = personnelEService.findByFechEmp(fechaI,fechaF);
        return ResponseEntity.ok().body(horario);
    }
}
