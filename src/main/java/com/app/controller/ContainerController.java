package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Container;
import com.app.service.ContainerService;

@RestController
@RequestMapping("/api")
public class ContainerController {

	
	@Autowired
	private ContainerService contServ;
	
	@CrossOrigin
	@GetMapping("/containers")
	public List<Container> getContainers(){
		
		return contServ.listContainers();
	}
	
	@CrossOrigin
	@GetMapping("/container/{id}")
	public Container getContainer(@PathVariable("id") long id) {
		return contServ.getContainerById(id);
	}
	
	@CrossOrigin
	@PostMapping("/container")
	public Container saveContainer(@RequestBody Container container) {
		
		return contServ.save(container);
	}
	
	@CrossOrigin
	@PutMapping("/container/{id}")
	public Container updateContainer(@PathVariable("id") long id,
			@RequestBody Container container) {
		
		return contServ.update(container, id);
	}
	
	@CrossOrigin
	@DeleteMapping("/container/{id}")
	public String updateContainer(@PathVariable("id") long id) {
		
		contServ.delete(id);
		return "deleted";
	}
	
	@CrossOrigin
	@PostMapping("/container/user")
	public List<Container> getContainersByUser(@RequestBody Container container) {
		
		return contServ.getContainersByUserId(container.getIdUser());
	}
	
	
	
}
