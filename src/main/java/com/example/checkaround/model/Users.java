package com.example.checkaround.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class Users {
	
	@GeneratedValue
	private int id;
	private String username;
	private List<Checkins> checkins;

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<Checkins> getCheckins() {
		return checkins;
	}

	public void setCheckins(List<Checkins> checkins) {
		this.checkins = checkins;
	}

}
