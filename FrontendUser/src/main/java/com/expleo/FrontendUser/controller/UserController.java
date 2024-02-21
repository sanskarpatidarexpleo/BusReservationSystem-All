package com.expleo.FrontendUser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.expleo.FrontendUser.ResponseModel;


@Controller
public class UserController {
	
	public String BASE_URL = "http://localhost:8090/";
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping(path = "/login")
	public String userLogin() {
		return "login";
	}
	
	@PostMapping(path="/userDashboard")
    public String registerUser(@RequestParam String email,String password,Model ml) {

		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(BASE_URL+"/login")
		        .queryParam("email", email)
		        .queryParam("password", password);
		String url = builder.toUriString();
		
		ResponseEntity<ResponseModel> response = restTemplate.getForEntity(url, ResponseModel.class);
		ResponseModel responseModel = response.getBody();

		 if (responseModel != null && responseModel.status) {
		        ml.addAttribute("status", responseModel.message);
		        return "UserDashBoard";
		    } else {
		        ml.addAttribute("error", "Invalid username or password");
		        return "login";
		    }
       
    }
	
	 /*@GetMapping("/login1")
	    public String login() {
	        return "login";
	    }*/
}
