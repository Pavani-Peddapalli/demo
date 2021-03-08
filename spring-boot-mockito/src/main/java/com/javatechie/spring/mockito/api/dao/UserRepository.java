package com.javatechie.spring.mockito.api.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.javatechie.spring.mockito.api.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{
	
	List<User> findByAddress(String address);

}
