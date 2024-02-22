package com.expleo.busReservationSystem.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.expleo.busReservationSystem.ResponseModel;
import com.expleo.busReservationSystem.entity.BusList;
import com.expleo.busReservationSystem.entity.CustomerList;


@Controller
public class AdminController {
	
	private static final String BASE_URL = "http://localhost:8090/";
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping(path="admin")
	public String adminLogin() {
		return "AdminLogin";
	}
	
	@PostMapping(path="/adminDashboard")
	public String adminPage(@RequestParam String email,String password , Model ml) {
		
		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(BASE_URL+"/adminLogin")
		        .queryParam("email", email)
		        .queryParam("password", password);
		String url = builder.toUriString();
		
		ResponseEntity<ResponseModel> response = restTemplate.getForEntity(url, ResponseModel.class);
		ResponseModel responseModel = response.getBody();

		 if (responseModel != null && responseModel.status) {
		        ml.addAttribute("status", responseModel.message);
		        return "AdminDashboard";
		    } else {
		        ml.addAttribute("error", "Invalid username or password");
		        return "AdminLogin";
		    }
	}
	
	@GetMapping(path="/addBus")
	public String AddBus() {
		return "AddBus";
	}

	  @PostMapping("/addingBus")
	    public String AddingBus(BusList b,Model model) {
		  UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(BASE_URL+"/addTravel")
			        .queryParam("travelName",b.getTravelName())
			        .queryParam("travelFrom",b.getTravelFrom())
			        .queryParam("travelTo", b.getTravelTo())
			        .queryParam("busNo", b.getBusNo())
			        .queryParam("departureTime", b.getDepartureTime())
			        .queryParam("arrivalTime", b.getArrivalTime())
			        .queryParam("totalSeats", b.getTotalSeats())
			        .queryParam("price", b.getPrice());
			        
			String url = builder.toUriString();
			System.out.println(b.toString());
			
			ResponseEntity<ResponseModel> response = restTemplate.postForEntity(url,b, ResponseModel.class);
			ResponseModel responseModel = response.getBody();
			
	        return "AddBus";
	    }
	  
	  @GetMapping("/seeBuses")
	  public String showBusses(Model model) {
		  
		  ResponseEntity<List<BusList>> response = restTemplate.exchange(
		            BASE_URL + "/getAllTravels",
		            HttpMethod.GET,
		            null,
		            new ParameterizedTypeReference<List<BusList>>() {});

		  Iterable<BusList> busList = response.getBody();
		    model.addAttribute("busList", busList);
		    return "ShowAllBuses";
	  }


	  
	  @GetMapping(path="/seeCustomers")
	  public String showCustomerList(Model model) {
		  
		  ResponseEntity<List<CustomerList>> response = restTemplate.exchange(
		            BASE_URL + "/getBookingDetails", //Need to change url
		            HttpMethod.GET,
		            null,
		            new ParameterizedTypeReference<List<CustomerList>>() {});
		  
		  Iterable<CustomerList> customerList = response.getBody();
		    model.addAttribute("customerList", customerList);
		  return "customerList";
	  }
	  
	  
	
	
	
	
	
	
	
}
