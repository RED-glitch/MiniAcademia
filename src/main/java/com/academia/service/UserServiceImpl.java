package com.academia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.academia.DTO.RegistrationDto;
import com.academia.entity.User;
import com.academia.entity.UserDetail;
import com.academia.repository.UserDao;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;

	
	@Override
	public User addUser(RegistrationDto regDto) {
		
		User user = new User();
		user.setFirstName(regDto.getFirstName());
		user.setLastName(regDto.getLastName());
		user.setUserName(regDto.getUserName());
		user.setEmail(regDto.getEmail());
		user.setPassword(regDto.getPassword());
		user.setRole(regDto.getRole());
		
		UserDetail userDetail = new UserDetail();
		userDetail.setPrn(regDto.getPrn());
		userDetail.setPhoneNo(regDto.getPhoneNo());
		userDetail.setDateOfBirth(regDto.getDateOfBirth());
		userDetail.setLinkedinId(regDto.getLinkedinId());
		userDetail.setBio(regDto.getBio());
		userDetail.setCity(regDto.getCity());
		userDetail.setState(regDto.getState());
		
		userDetail.setUser(user);
		user.setUserDetail(userDetail);
		user = userDao.save(user);
		

		return user;
	}

}
