package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.HotelBooking;
import com.example.demo.repository.HotelBookingRepository;

@Service
public class HotelBookingService {

	@Autowired
	private HotelBookingRepository hotelBookingRepo;
	
	public HotelBooking saveNewBooking(HotelBooking newBooking) {
		return hotelBookingRepo.save(newBooking);
	}
	
	public List<HotelBooking> myBooking(String email){
		return hotelBookingRepo.findByUserEmail(email);
	}
	
	public int cancelBooking(int id, int userHash) {
		return hotelBookingRepo.cancelBooking(id, userHash);
	}
}
