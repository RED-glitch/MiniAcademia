package com.academia.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
@Table(name = "user", uniqueConstraints = 
				{@UniqueConstraint(columnNames = {"userName","email","password"})})
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long id;
	
	private String firstName;
	private String lastName;
	
	private String userName;
	private String email;
	private String password;
	
	@Enumerated(EnumType.STRING)
	private RoleName role;
	
	
	//@OneToOne(cascade = CascadeType.ALL,targetEntity = UserDetail.class )
	//	@PrimaryKeyJoinColumn
	//private UserDetail userDetail;

	@JsonManagedReference
	@OneToOne(cascade = CascadeType.ALL,targetEntity = UserDetail.class,mappedBy = "user")
	private UserDetail userDetail;
	
	@OneToMany(cascade = CascadeType.ALL,targetEntity = Question.class ,mappedBy = "user")
	private List<Question> question;
	
	@OneToMany (cascade = CascadeType.ALL,targetEntity =Answer.class ,mappedBy = "user")
	private List<Answer> answer;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String firstName, String lastName, String userName, String email, String password, RoleName role) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.role = role;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public RoleName getRole() {
		return role;
	}

	public void setRole(RoleName role) {
		this.role = role;
	}

	public UserDetail getUserDetail() {
		return userDetail;
	}

	public void setUserDetail(UserDetail userDetail) {
		this.userDetail = userDetail;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName
				+ ", email=" + email + ", password=" + password + ", role=" + role + ", " + userDetail.toString() + "]";
	}
	
	
	
	
	
}
