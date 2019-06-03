package com.photoapp.api.users.repository;

import org.springframework.data.repository.CrudRepository;

import com.photoapp.api.users.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {

	User findByEmail(String email);

	User findByUserId(String userId);
	
}
