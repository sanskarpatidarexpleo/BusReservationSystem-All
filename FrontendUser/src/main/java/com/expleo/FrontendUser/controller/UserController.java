package com.expleo.FrontendUser.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
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
import com.expleo.FrontendUser.entity.BusList;


@Controller
public class UserController {
	
	public String BASE_URL = "http://localhost:8090/";
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping(path = "/Login")
	public String userLogin() {
		return "login";
	}
	
	@GetMapping(path = "/addUsers")
	public String addUserForm() {
	    return "Register";
	}
	
	@PostMapping(path = "/addUsers")
	public String addUser(@RequestParam String username, @RequestParam String email, @RequestParam String password, Model ml) {
		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(BASE_URL+"/register")
		        .queryParam("username", username)
		        .queryParam("email", email)
		        .queryParam("password", password);
		String url = builder.toUriString();
		ResponseEntity<ResponseModel> response = restTemplate.getForEntity(url, ResponseModel.class);
		ResponseModel responseModel = response.getBody();
		 if (responseModel != null && responseModel.status) {
		        ml.addAttribute("status","Registration Sucessful. Please Log In ");
		        return "redirect:/Login";
		    } else {
		        ml.addAttribute("error", "Registration failed. Please try again");
		        return "Register";
		    }
	}
	
	//----------------------------------------------------------------------------------------------------------
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
	
	
	//-----------------------------------------------------------------------------------------------------------------------
	
	
	
	@GetMapping(path="/bookTravelFrom")
	public String getTravelForm(Model model) {
		ResponseEntity<List<BusList>> response = restTemplate.exchange(
	            BASE_URL + "/getAllTravels",
	            HttpMethod.GET,
	            null,
	            new ParameterizedTypeReference<List<BusList>>() {});

	  Iterable<BusList> busList = response.getBody();
	    model.addAttribute("busList", busList);
		return "BookTravelForm";
		
	}
	
	
	
	
}
