package com.ba.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ba.entity.Kullanici;
import com.ba.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserRepository repository;
	
	
	@PostMapping
	public ResponseEntity<Kullanici> addUserController (@RequestBody Kullanici kullanici) {
		return ResponseEntity.ok(repository.save(kullanici));
	}
	
	@GetMapping
	public ResponseEntity<List<Kullanici>> getAllUser(){
		return ResponseEntity.ok(repository.findAll());
	}
	

}
