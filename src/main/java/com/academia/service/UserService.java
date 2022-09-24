package com.academia.service;

import com.academia.DTO.RegistrationDto;
import com.academia.entity.User;

public interface UserService {
	
	public User addUser(RegistrationDto regDto);

}
