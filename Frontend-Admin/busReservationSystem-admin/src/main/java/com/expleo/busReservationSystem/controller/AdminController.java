package com.expleo.busReservationSystem.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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


@Controller
public class AdminController {
	
	//private static final String BASE_URL = "http://localhost:8090/";
	
	//@Autowired
	//RestTemplate restTemplate;
	
	@GetMapping(path="admin")
	public String adminLogin() {
		return "AdminLogin";
	}
	
	@PostMapping(path="/adminDashboard")
	public String adminPage(@RequestParam String email,String password , Model ml) {
		
//		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(BASE_URL+"/loginAdmin")
//		        .queryParam("email", email)
//		        .queryParam("password", password);
//		String url = builder.toUriString();
//		
//		ResponseEntity<ResponseModel> response = restTemplate.getForEntity(url, ResponseModel.class);
//		String result = response.getBody().message;
//		
//		if(response.getBody().status) {
//			//Success
//			
//		} else {
//			//Failed
//		}
//		ml.addAttribute("status",result);
		return "AdminDashboard";
	}
	@GetMapping(path="/addBus")
	public String AddBus() {
		return "AddBus";
	}

	  @PostMapping("/addingBus")
	    public String AddingBus(BusList bs,Model model) {
	        return "busAddedSucessfully";
	    }
	  
	  @GetMapping("/seeBuses")
	  public String showBusses(Model model) {
		  Iterable<BusList> bs = getIterableBusList();
		  model.addAttribute("bs", bs);
		  System.out.println(bs);
		  return "ShowAllBuses";
	  }

	  private Iterable<BusList> getIterableBusList() {
	        List<BusList> busList = new ArrayList<>();
	        busList.add(new BusList("Mh25","Komal",30,"pune","Latur",LocalDate.of(2024, 2, 20),LocalTime.of(11,50),550));
		    busList.add(new BusList("Mh26","Saad",30,"pune","Latur",LocalDate.of(2024, 2, 20),LocalTime.of(12,50),650));
	        busList.add(new BusList("Mh24", "Rudra", 30, "Pune", "Latur", LocalDate.of(2024, 2, 20), LocalTime.of(10, 50), 50));
	        busList.add(new BusList("Mh24", "Rudra", 30, "Pune", "Latur", LocalDate.of(2024, 2, 20), LocalTime.of(10, 50), 50));
	        busList.add(new BusList("Mh24", "Rudra", 30, "Pune", "Latur", LocalDate.of(2024, 2, 20), LocalTime.of(10, 50), 50));
	        return busList;
	    }
	  
	  
	
	
	
	
	
	
	
}
