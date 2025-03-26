package com.day10.Airport_management.repository;

//package com.airport.flightschedule.repository;


import com.day10.Airport_management.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {
    List<Flight> findBySourceAndDestinationAndDepartureDateTimeBetween(
            String source, String destination, LocalDateTime startDate, LocalDateTime endDate);
}
