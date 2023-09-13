package com.UserManagement.service;

import com.UserManagement.Dto.UserDto;
import com.UserManagement.Entity.User;

import java.util.List;

public interface UserService {
		
	void saveUser(UserDto userDto);

    List<UserDto> findAllUsers();

	User findUserByEmail(String email);

	UserDto findUserById(Long userId);

	boolean doesUserExist(Long userId);

	void editUser(UserDto updatedUserDto, Long userId);

	void deleteUserById(Long userId);

}
