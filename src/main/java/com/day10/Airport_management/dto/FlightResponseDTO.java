package com.day10.Airport_management.dto;



import java.time.LocalDateTime;

public class FlightResponseDTO {
    private String flightName;
    private String sourceName;
    private String destinationName;
    private String aircraftType;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private Double totalFare;

    public FlightResponseDTO(String flightName, String sourceName, String destinationName,
                             String aircraftType, LocalDateTime departureTime,
                             LocalDateTime arrivalTime, Double totalFare) {
        this.flightName = flightName;
        this.sourceName = sourceName;
        this.destinationName = destinationName;
        this.aircraftType = aircraftType;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.totalFare = totalFare;
    }

    // Getters
    public String getFlightName() { return flightName; }
    public String getSourceName() { return sourceName; }
    public String getDestinationName() { return destinationName; }
    public String getAircraftType() { return aircraftType; }
    public LocalDateTime getDepartureTime() { return departureTime; }
    public LocalDateTime getArrivalTime() { return arrivalTime; }
    public Double getTotalFare() { return totalFare; }
}

