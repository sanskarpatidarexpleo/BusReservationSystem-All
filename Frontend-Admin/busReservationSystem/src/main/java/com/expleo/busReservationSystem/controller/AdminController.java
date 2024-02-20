package com.expleo.busReservationSystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.expleo.busReservationSystem.entity.BusList;


@Controller
public class AdminController {
	
//	@Autowired
//	BusService Bs;
	
	@GetMapping(path="admin")
	public String adminLogin() {
		return "AdminLogin";
	}
	
	@PostMapping(path="/adminDashboard")
	public String adminPage(@RequestParam String username,String password) {
		return "AdminDashboard";
	}
	@GetMapping(path="/addBus")
	public String AddBus() {
		return "AddBus";
	}
//	@PostMapping(path="/addingBus")
//	public String showBuses(BusList bs,Model model) {
//		
////		BusList bs=new BusList();
////		model.addAttribute(bs);
//		return "ShowAllBuses";
//	}
//	

	  @PostMapping("/addingBus")
	    public String AddingBus(BusList bs,Model model) {

	        return "busAddedSucessfully";
	    }
	
	
	
	
	
	
	
}
