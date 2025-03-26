package com.day10.Airport_management.controller;
import com.day10.Airport_management.dto.FlightResponseDTO;
import com.day10.Airport_management.entity.Flight;
import com.day10.Airport_management.service.FlightService;
//package com.airport.flightschedule.controller;

//import com.airport.flightschedule.entity.Flight;
//import com.airport.flightschedule.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;



@RestController
@RequestMapping("/api/flights")
public class FlightController {

    @Autowired
    private FlightService flightService;

    @GetMapping("/search")
    public ResponseEntity<List<FlightResponseDTO>> searchFlights(
            @RequestParam String source,
            @RequestParam String destination,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate departureDate) {

        List<FlightResponseDTO> flights = flightService.getFlights(source, destination, departureDate);

        if (flights.isEmpty()) {
            return ResponseEntity.noContent().build(); // 204 No Content if no flights found
        }

        return ResponseEntity.ok(flights); // Return list of filtered flight data
    }
}
