package com.example.demo.repo;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.dxbair.services.flightbooking.domain.entity.Flight;

@Transactional
public interface FlightRepository extends JpaRepository<Flight, String> {
	
	List<Flight> findByDepartureAndDepartureDateGreaterThan(String departure, LocalDateTime departureDate);
}
