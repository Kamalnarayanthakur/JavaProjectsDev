package com.DevKamal.BlogPlatform.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.DevKamal.BlogPlatform.exceptions.*;
import com.DevKamal.BlogPlatform.Entity.User;
import com.DevKamal.BlogPlatform.Repository.UserRepo;
import com.DevKamal.BlogPlatform.Service.UserService;
import com.DevKamal.BlogPlatform.payloads.userDTO;

public class UserServiceimpl implements UserService {
	@Autowired
	private UserRepo userRepo;

	@Override
	public userDTO createUser(userDTO userDTO) {

		User user = this.dtoToUser(userDTO);
		User savedUser = this.userRepo.save(user);

		return this.dtoToDto(savedUser);
	}

	@Override
	public userDTO updateUser(userDTO userDTO, long userID) {
		
		User user = this.userRepo.findById(userID).orElseThrow(()-> ResourceNotFoundException("User","id"));
		
		return null;
	}

	@Override
	public userDTO getUserById(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<userDTO> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(Long userId) {
		// TODO Auto-generated method stub
	}

	private User dtoToUser(userDTO userdto) {
		User user = new User();
		user.setId(user.getId());
		user.setName(user.getName());
		user.setEmail(user.getEmail());
		user.setPassword(user.getPassword());
		return user;
	}

	public userDTO dtoToDto(User user) {
		userDTO userDTO = new userDTO();
		user.setId(user.getId());
		user.setName(user.getName());
		user.setEmail(user.getEmail());
		user.setPassword(user.getPassword());
		return userDTO;
	}

}
