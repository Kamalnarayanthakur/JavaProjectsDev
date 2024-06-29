package com.DevKamal.BlogPlatform.Service;

import java.util.List;

import com.DevKamal.BlogPlatform.Entity.User;
import com.DevKamal.BlogPlatform.payloads.userDTO;

public interface UserService {

//		Creating Method here 

//	creating user
	userDTO createUser(userDTO user);

//		updating user
	userDTO updateUser(userDTO user, long userID);

//	finding user by id
	userDTO getUserById(Long userId);

	List<userDTO> getAllUsers();
// Deleting user
	void deleteUser(Long userId);

}
