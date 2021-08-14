package com.app.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.UserModel;
import com.app.repository.UserRepository;
import com.app.service.UserService;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	private UserRepository userRep; 
	
	@Override
	public List<UserModel> listUsers() {

		return userRep.findAll(); 
	}

	@Override
	public UserModel saveUser(UserModel user) {

		return userRep.save(user);
	}

	@Override
	public void deleteUser(long id) {
		userRep.deleteById(id);
	}

	@Override
	public UserModel singIn(UserModel user) {
		
		UserModel userDB=userRep.findByEmail(user.getEmail());
		
		if(userDB.getEmail().equalsIgnoreCase(user.getEmail()) 
				&& userDB.getPassword().equalsIgnoreCase(user.getPassword())) {
			
			return userDB; 
		}
		
		return null;
	}

	
	public UserModel getUserById(long id) {
		
		return userRep.findById(id).get();
	}

}
