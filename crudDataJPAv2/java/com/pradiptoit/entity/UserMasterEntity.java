package com.pradiptoit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user_master4")
public class UserMasterEntity {

	@Id
	@Column(name="user_id")
	private Integer user_id;
	@Column(name="user_name")
	private String user_name;
	@Column(name="user_email")
	private String user_email;
	@Column(name="user_age")
	private Integer user_age;
	@Column(name="user_city")
	private String user_city;
	@Column(name="user_gender")
	private String user_gender;
	
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public Integer getUser_age() {
		return user_age;
	}
	public void setUser_age(Integer user_age) {
		this.user_age = user_age;
	}
	public String getUser_city() {
		return user_city;
	}
	public void setUser_city(String user_city) {
		this.user_city = user_city;
	}
	public String getUser_gender() {
		return user_gender;
	}
	public void setUser_gender(String user_gender) {
		this.user_gender = user_gender;
	}
	
	@Override
	public String toString() {
		return "UserMasterEntity [user_id=" + user_id + ", user_name=" + user_name + ", user_email=" + user_email
				+ ", user_age=" + user_age + ", user_city=" + user_city + ", user_gender=" + user_gender + "]";
	}
	
	
	
	
}
