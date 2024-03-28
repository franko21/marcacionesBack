package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Entity.PERSONNEL_EMPLOYEE;
import com.example.demo.Service.IPERSONNEL_EMPLOYEEService;



@RestController
@CrossOrigin(origins = "http://localhost:4200")
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
        List<String> marcaciones = personnelEService.findByCedEmp(emp_code);
        return ResponseEntity.ok().body(marcaciones);
    }

	@GetMapping("/personnelE/iclockT/fecha/{fechaI}/{fechaF}")
    public ResponseEntity<List<String>> findByFechEmp(@PathVariable String fechaI,@PathVariable String fechaF) {
        List<String> marcaciones = personnelEService.findByFechEmp(fechaI,fechaF);
        return ResponseEntity.ok().body(marcaciones);
    }
}
