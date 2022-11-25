package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.HotelBooking;
import com.example.demo.services.HotelBookingService;
import com.example.demo.services.PingService;

@RestController
public class MyController {

	@Autowired
	private PingService pingService;
	@Autowired
	private HotelBookingService hotelService;


	public Map<String,String> errorHandler(){
		Map<String,String> error = new HashMap<>();
		error.put("Status", "Error");
		return error;
	}
	
	
	@GetMapping("/")
	public String home() {
		return "Home";
	}
	
	@GetMapping("/ping")
	public Map<String, String> ping(){
		try {
			return this.pingService.ping();
		}
		catch(Exception e) {
			return this.errorHandler();
		}
	}
	
	@PostMapping("/createNewBooking")
	public Map<String, String> newBooking(@RequestBody HotelBooking newReq) {
		try {
//			System.out.println(newReq);
			HotelBooking res = this.hotelService.saveNewBooking(newReq);
			if(res.getUserMobileNo() == newReq.getUserMobileNo()) {
				Map<String, String> success = new HashMap<>();
				success.put("status", "success");
				return success;
			}
			return this.errorHandler();
//			return newReq;
		}catch (Exception e) {
			return this.errorHandler();
		}
	}
	
	@GetMapping("/myBooking")
	public List<HotelBooking> myBooking(@RequestParam("userHash") int userHash){
		
		return this.hotelService.myBooking(userHash);
		
	}
	
	
	@PutMapping("/cancelBooking")
	public Map<String, String> cancelBooking(@RequestParam("id")int id, @RequestParam("userHash")int userHash){

		Map<String, String> success = new HashMap<>();
		
		int noOfRowsUpdated = this.hotelService.cancelBooking(id, userHash);
		if(noOfRowsUpdated>0) {
			success.put("status", "success");
			success.put("noOfRowsUpdated", String.valueOf(noOfRowsUpdated));
		}else {
			success.put("status", "failed");
		}
		
		return success; 
	}
	
	
	
}
