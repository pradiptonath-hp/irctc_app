package com.pradiptoit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user_master10")
public class UserEntity {
		@Id
		@Column(name="user_id")
		private Integer id;
		
		@Column(name="user_name")
		private String name;
		
		@Column(name="user_email")
		private String email;
		
		@Column(name="user_age")
		private Integer age;
		
		@Column(name="user_city")
		private String city;
		
		@Column(name="user_gender")
		private String gender;

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Integer getAge() {
			return age;
		}

		public void setAge(Integer age) {
			this.age = age;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		@Override
		public String toString() {
			return "UserEntity [id=" + id + ", name=" + name + ", email=" + email + ", age=" + age + ", city=" + city
					+ ", gender=" + gender + "]";
		}
		
		

}
