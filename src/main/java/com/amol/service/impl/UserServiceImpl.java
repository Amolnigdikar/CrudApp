package com.amol.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amol.dto.UserDTO;
import com.amol.model.User;
import com.amol.repository.UserRepository;
import com.amol.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public User addNewUser(UserDTO userDTO) {
		// TODO Auto-generated method stub
		User user = new User();
		BeanUtils.copyProperties(userDTO, user);
		return userRepository.save(user);
	}

	@Override
	public User getUser(Long id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id).get();
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return (List<User>) userRepository.findAll();
	}

}
