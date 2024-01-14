package com.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.admin.model.User;
import com.admin.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	@PostMapping("/save-user")
	public ResponseEntity<User>addUser(@RequestBody User user){
		
		User AddedUser = adminService.addUser(user);
		return new ResponseEntity<User>(AddedUser,HttpStatus.CREATED); 
	}
	
	@GetMapping("/getUser/{Id}")
	public ResponseEntity<User>getUserById(@PathVariable int Id){
		
		User userById = adminService.getUserById(Id);
		
		return new ResponseEntity<User>(userById,HttpStatus.FOUND);
	}
	
	@GetMapping("/getAllUser")
	public ResponseEntity<List<User>> getAllUser(){
		
		List<User> allUser = adminService.getAllUser();
		return new ResponseEntity<List<User>>(allUser,HttpStatus.FOUND);
	}
	
	@DeleteMapping("/deleteById/{Id}")
	public ResponseEntity<String>deleteUserById(@PathVariable int Id){
		
		adminService.deleteUserById(Id);
		
		return new ResponseEntity<String>("User Deleted Sucessfully",HttpStatus.OK);
	}
	
	@PutMapping("/updateUser")
	public ResponseEntity<User>updateUser(@RequestBody User user){
		
		User updatedUser = adminService.addUser(user);
		
		return new ResponseEntity<User>(updatedUser,HttpStatus.OK);
	}
}
