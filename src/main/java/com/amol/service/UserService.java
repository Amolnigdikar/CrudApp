package com.amol.service;

import java.util.List;

import com.amol.dto.UserDTO;
import com.amol.model.User;

public interface UserService {
	
	 public User addNewUser(UserDTO userDTO);
	 
	 public User getUser(Long id);
	 
	 public List<User> getAll();

}
