package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.UserModel;
import com.app.entity.Word;
import com.app.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
	


	@Autowired
	private UserService userServ;
	
	@CrossOrigin
	@GetMapping("/users")
	public List<UserModel> getUsers(){
		return userServ.listUsers();
	}
	
	@CrossOrigin
	@PostMapping("/register")
	public UserModel saveUser(@RequestBody UserModel user) {
		
		return userServ.saveUser(user);
	}
	
	@CrossOrigin
	@PostMapping("/login")
	public UserModel signIn(@RequestBody UserModel user) {
		
		return userServ.singIn(user);
	}
	
	@CrossOrigin
	@DeleteMapping("/user/{id}")
	public String deleteUser(@PathVariable("id") long idUser) {
		
		userServ.deleteUser(idUser);
		
		return "deleted";
	}
	
	@CrossOrigin
	@GetMapping("/user/{id}")
	public UserModel getUser(@PathVariable("id") long id) {
		return userServ.getUserById(id);
	}
}
