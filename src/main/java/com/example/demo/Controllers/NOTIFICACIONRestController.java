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

import com.example.demo.Entity.NOTIFICACION;
import com.example.demo.Service.INOTIFICACIONService;



@RestController
@RequestMapping("/api")
public class NOTIFICACIONRestController {

	@Autowired
	private INOTIFICACIONService notificacionService;
	
	@GetMapping("/notificacion")
	public List<NOTIFICACION> index(){
		return notificacionService.findAll();
	}
	
	@GetMapping("/notificacion/{id}")
	public NOTIFICACION show(@PathVariable Long id) {
		return notificacionService.findById(id);
	}
	
	@PostMapping("/notificacion")
    @ResponseStatus(HttpStatus.CREATED)
	public NOTIFICACION create(@RequestBody NOTIFICACION notificacion) {
		return notificacionService.save(notificacion);
	}
	
	@PutMapping("/notificacion/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public NOTIFICACION update(@RequestBody NOTIFICACION notificacion,@PathVariable Long id) {
		NOTIFICACION notificacionActual=notificacionService.findById(id);
		notificacionActual.setDescripcion(notificacion.getDescripcion());
		return notificacionService.save(notificacionActual);
	}
	
	@DeleteMapping("/notificacion/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		notificacionService.delete(id);
	}
}
