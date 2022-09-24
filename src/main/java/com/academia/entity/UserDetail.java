package com.academia.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name = "user_detail", uniqueConstraints = 
				{@UniqueConstraint(columnNames = {"prn","linkedinId"})})
public class UserDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )

	//@GeneratedValue(generator="gen")
    //@GenericGenerator(name="gen", strategy="foreign",parameters=@Parameter(name="property", value="user"))
	private Long id;
	private Integer prn;
	private Integer phoneNo;
	private LocalDate dateOfBirth;
	private String linkedinId;
	private String bio;
	private String city;
	private String state;
	//@OneToOne
	//@JoinColumn(name = "user_id", referencedColumnName = "id")
	//@PrimaryKeyJoinColumn
	//private User user;
	@JsonBackReference
	@OneToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	public UserDetail(Integer prn, Integer phoneNo, LocalDate dateOfBirth, String linkedinId, String bio, String city,
			String state, User user) {
		super();
		this.prn = prn;
		this.phoneNo = phoneNo;
		this.dateOfBirth = dateOfBirth;
		this.linkedinId = linkedinId;
		this.bio = bio;
		this.city = city;
		this.state = state;
		this.user = user;
	}

	public UserDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "UserDetail [id=" + id + ", prn=" + prn + ", phoneNo=" + phoneNo + ", dateOfBirth=" + dateOfBirth
				+ ", linkedinId=" + linkedinId + ", bio=" + bio + ", city=" + city + ", state=" + state + "]";
	}
	
	
	
	
	
}
