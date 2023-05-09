package com.springboot.controller;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Setter
@Getter
@NoArgsConstructor
@ToString
public class Registration {

	private Long id;
	@NotBlank(message = "username is required")
//	@Size(min = 3,message = "Username must be at least 3 characters")
	private String username;
	@NotBlank(message = "password is required")
//	@Size(min = 3,message = "Username must be at least 3 characters")
	private String password;
	@NotBlank
	private String confirmPassword;
	@NotBlank(message = "firstname is required")
	private String firstname;
	@NotBlank(message = "lastname is required")
	private String lastname;
	@NotBlank(message = "phone is required")
	private String phone;
	@Pattern(regexp = "^[A-Za-z0-9+_.-]+@(.+)$",message="Invalid Email Address")
	private String email;
	@NotBlank(message = "state is required")
	private String state;
	@NotBlank(message = "city is required")
	private String city;
	@NotBlank(message = "zipcode is required")
	private String zipcode;

}
