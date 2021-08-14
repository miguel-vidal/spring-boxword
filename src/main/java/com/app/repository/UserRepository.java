package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.entity.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {
	
	@Query(value="SELECT * FROM Users WHERE email = :email", nativeQuery = true)
	UserModel findByEmail(String email);
}
