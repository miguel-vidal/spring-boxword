package com.app.service;

import java.util.List;

import com.app.entity.UserModel;

public interface UserService {


	public List<UserModel> listUsers();
	
	public UserModel saveUser(UserModel user);
	
	public void deleteUser(long id);
	
	public UserModel getUserById(long id);
	
	public UserModel singIn(UserModel user);
}
