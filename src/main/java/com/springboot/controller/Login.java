package com.springboot.controller;

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
public class Login {

	private long id;
	private String username;
	private String password;
	

}
