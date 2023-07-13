package com.amol.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amol.dto.UserDTO;
import com.amol.model.User;
import com.amol.service.UserService;

@RestController
@RequestMapping("/api/v1")
public class UserController {
	
	@Autowired
	UserService userService;
	
	
	@PostMapping("/create/user")
	User addNewUser(@RequestBody UserDTO userDTO) {
		return userService.addNewUser(userDTO);
	}
	
	
	@GetMapping("/get/all")
	List<User> getAll(){
		return userService.getAll();
	}

}
