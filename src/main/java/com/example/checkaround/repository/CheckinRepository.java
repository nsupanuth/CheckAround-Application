package com.example.checkaround.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.checkaround.model.Checkins;

public interface CheckinRepository extends JpaRepository<Checkins,Integer>{
		
//	public List<Checkins> findByLocationNameDistinctByLocationName();

}
