package com.springboot.controller;

import com.springboot.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Objects;

@Controller
public class HomeController {

	private UserRepository userRepository;
	@Autowired
	public HomeController(UserRepository userRepository){
		this.userRepository=userRepository;
	}

	@RequestMapping("/")
	public String homePage() {
		return "home";
	}
	
	@RequestMapping("/login")
	public String loginPage(Model model) {
		model.addAttribute("login", new Login());
		return "login";
	}
	
	@RequestMapping("/registration")
	public String registrationPage(Model model) {
		model.addAttribute("registration", new Registration());
		return "registration";
	}

	@RequestMapping(value = "/saveRegistrationDetails",method = RequestMethod.POST)
	public String saveRegistrationInfo(@Valid Registration registration, Errors errors) {
		if(errors.hasErrors()){
			return "registration";
		}
		if(registration.getPassword().equals(registration.getConfirmPassword())) {
			userRepository.saveRegistrationDetails(registration);
			return "/home";
		}else{
			return "redirect:/registration";
		}
	}

	@RequestMapping(value = "/loadLoginInfo",method = RequestMethod.POST)
	public String loadLoginInfo(Login login) {
		Login login1 = userRepository.loadUserInfoBasedOnUsername(login.getUsername());
		if(Objects.nonNull(login1)){
			return "/home";
		}
		return "redirect:/login";

	}



}
