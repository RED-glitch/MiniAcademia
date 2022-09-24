package com.academia.DTO;

import java.time.LocalDate;

import com.academia.entity.RoleName;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class RegistrationDto {
	
	private String firstName;
	private String lastName;
	
	private String userName;
	private String email;
	private String password;
	
	private RoleName role;
	
	private Integer prn;
	private Integer phoneNo;
	private LocalDate dateOfBirth;
	private String linkedinId;
	private String bio;
	private String city;
	private String state;
	
	public RegistrationDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RegistrationDto(String firstName, String lastName, String userName, String email, String password,
			RoleName role, Integer prn, Integer phoneNo, LocalDate dateOfBirth, String linkedinId, String bio,
			String city, String state) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.role = role;
		this.prn = prn;
		this.phoneNo = phoneNo;
		this.dateOfBirth = dateOfBirth;
		this.linkedinId = linkedinId;
		this.bio = bio;
		this.city = city;
		this.state = state;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getPrn() {
		return prn;
	}

	public void setPrn(Integer prn) {
		this.prn = prn;
	}

	public Integer getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(Integer phoneNo) {
		this.phoneNo = phoneNo;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getLinkedinId() {
		return linkedinId;
	}

	public void setLinkedinId(String linkedinId) {
		this.linkedinId = linkedinId;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public RoleName getRole() {
		return role;
	}

	public void setRole(RoleName role) {
		this.role = role;
	}




	
	
	
	
	
	
	

}
