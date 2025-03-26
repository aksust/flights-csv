package com.day10.Airport_management.entity;

import jakarta.persistence.*;
//import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "flight_details")
//@Data
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "airline")
    private String airline;
    @Column(name = "source")// Airline Name
    private String source;
    @Column(name = "Source Name")// Source Airport Code (e.g., CXB)
    private String sourceName;
    @Column(name = "destination")// Source Airport Full Name
    private String destination;
    @Column(name = "Destination Name")// Destination Airport Code (e.g., CCU)
    private String destinationName;
    @Column(name = "Departure Date & Time")// Destination Airport Full Name
    private LocalDateTime departureDateTime;
    @Column(name = "Arrival Date & Time")// Departure Date & Time
    private LocalDateTime arrivalDateTime;
    @Column(name = "Duration (hrs)")// Arrival Date & Time
    private Double duration;
    @Column(name = "stopovers")// Duration in Hours
    private String stopovers;
    @Column(name = "Aircraft Type")// Direct or 1 Stop, etc.
    private String aircraftType;
    @Column(name = "Class")// Aircraft Type (e.g., Airbus A320)
    private String flightClass;
    @Column(name = "Booking Source")// Economy, First Class, etc.
    private String bookingSource;
    @Column(name = "Base Fare (BDT)")// Online Website, Travel Agency, etc.
    private Double baseFare;
    @Column(name = "Tax & Surcharge (BDT)")// Base Fare in BDT
    private Double taxAndSurcharge;
    @Column(name = "Total Fare (BDT)")// Tax & Surcharge in BDT
    private Double totalFare;
    @Column(name = "seasonality")// Total Fare in BDT
    private String seasonality;
    @Column(name = "Days Before Departure")// Regular, Winter Holidays, etc.
    private Integer daysBeforeDeparture;
    // Number of days before departure

    public Flight() {
    }

    public Flight(Long id, String airline, String source, String sourceName, String destination, String destinationName, LocalDateTime departureDateTime, LocalDateTime arrivalDateTime, Double duration, String stopovers, String aircraftType, String flightClass, String bookingSource, Double baseFare, Double taxAndSurcharge, Double totalFare, String seasonality, Integer daysBeforeDeparture) {
        this.id = id;
        this.airline = airline;
        this.source = source;
        this.sourceName = sourceName;
        this.destination = destination;
        this.destinationName = destinationName;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.duration = duration;
        this.stopovers = stopovers;
        this.aircraftType = aircraftType;
        this.flightClass = flightClass;
        this.bookingSource = bookingSource;
        this.baseFare = baseFare;
        this.taxAndSurcharge = taxAndSurcharge;
        this.totalFare = totalFare;
        this.seasonality = seasonality;
        this.daysBeforeDeparture = daysBeforeDeparture;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    public LocalDateTime getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(LocalDateTime departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public LocalDateTime getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(LocalDateTime arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public String getStopovers() {
        return stopovers;
    }

    public void setStopovers(String stopovers) {
        this.stopovers = stopovers;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public String getFlightClass() {
        return flightClass;
    }

    public void setFlightClass(String flightClass) {
        this.flightClass = flightClass;
    }

    public String getBookingSource() {
        return bookingSource;
    }

    public void setBookingSource(String bookingSource) {
        this.bookingSource = bookingSource;
    }

    public Double getBaseFare() {
        return baseFare;
    }

    public void setBaseFare(Double baseFare) {
        this.baseFare = baseFare;
    }

    public Double getTaxAndSurcharge() {
        return taxAndSurcharge;
    }

    public void setTaxAndSurcharge(Double taxAndSurcharge) {
        this.taxAndSurcharge = taxAndSurcharge;
    }

    public Double getTotalFare() {
        return totalFare;
    }

    public void setTotalFare(Double totalFare) {
        this.totalFare = totalFare;
    }

    public String getSeasonality() {
        return seasonality;
    }

    public void setSeasonality(String seasonality) {
        this.seasonality = seasonality;
    }

    public Integer getDaysBeforeDeparture() {
        return daysBeforeDeparture;
    }

    public void setDaysBeforeDeparture(Integer daysBeforeDeparture) {
        this.daysBeforeDeparture = daysBeforeDeparture;
    }
}
