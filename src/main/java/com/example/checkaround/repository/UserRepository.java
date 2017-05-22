package com.example.checkaround.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.checkaround.model.Users;

public interface UserRepository extends JpaRepository<Users, Integer>{
	
//	public List<Users> findById(Integer id);

}
