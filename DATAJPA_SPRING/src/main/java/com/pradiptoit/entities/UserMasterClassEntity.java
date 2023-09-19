package com.pradiptoit.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//id, name,city,user email,gender,city,

@Table(name="user_master11")
@Entity
public class UserMasterClassEntity {
	@Id
	@Column(name="user_id")
	private Integer userId;
	@Column(name="user_name")
	private String userName;
	@Column(name="user_city")
	private String userCity;
	@Column(name="user_email")
	private String userEmail;
	@Column(name="user_gender")
	private String userGender;
	@Column(name="user_age")
	private Integer userAge;
	
	public Integer getUserId() {
		return userId;
	}
	@Override
	public String toString() {
		return "UserMasterClassEntity [userId=" + userId + ", userName=" + userName + ", userCity=" + userCity
				+ ", userEmail=" + userEmail + ", userGender=" + userGender + ", userAge=" + userAge + "]";
	}
	public Integer getUserAge() {
		return userAge;
	}
	public void setUserAge(Integer userAge) {
		this.userAge = userAge;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserCity() {
		return userCity;
	}
	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	
	
	
	
}
