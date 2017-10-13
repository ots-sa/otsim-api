package com.ots.otsim.api.repositories;

import org.springframework.data.repository.CrudRepository;

import com.ots.otsim.api.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
	User findByUsernameAndPassword(String userName, String password);
	
}
