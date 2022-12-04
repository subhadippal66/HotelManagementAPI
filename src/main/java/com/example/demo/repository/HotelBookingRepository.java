package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.HotelBooking;

public interface HotelBookingRepository extends JpaRepository<HotelBooking, Integer>{
	public List<HotelBooking> findByUserEmail(String userEmail);
	
	@Modifying
	@Transactional
	@Query("UPDATE HotelBooking SET status = 1 WHERE id = :id AND userHash = :userHash")
	public Integer cancelBooking(@Param("id")int id, @Param("userHash")int userhash);
}
