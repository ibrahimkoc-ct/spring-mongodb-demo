package com.ba.entity;

import java.util.HashMap;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Kullanici {
	@Id
	private String id;
	private String name;
	private String lastname;
	private HashMap property;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public HashMap getProperty() {
		return property;
	}
	public void setProperty(HashMap property) {
		this.property = property;
	}
	public Kullanici() {
	
	}
	
	
}
