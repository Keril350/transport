
package com.example.transportsys.model;

import jakarta.persistence.*;
import java.time.*;

@Entity
public class TransportEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String transportType;
    private String routeNumber;
    private LocalDateTime arrivalTime;

    private Integer passengersIn;
    private Integer passengersOut;

    // getters/setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTransportType() { return transportType; }
    public void setTransportType(String transportType) { this.transportType = transportType; }

    public String getRouteNumber() { return routeNumber; }
    public void setRouteNumber(String routeNumber) { this.routeNumber = routeNumber; }

    public LocalDateTime getArrivalTime() { return arrivalTime; }
    public void setArrivalTime(LocalDateTime arrivalTime) { this.arrivalTime = arrivalTime; }

    public Integer getPassengersIn() { return passengersIn; }
    public void setPassengersIn(Integer passengersIn) { this.passengersIn = passengersIn; }

    public Integer getPassengersOut() { return passengersOut; }
    public void setPassengersOut(Integer passengersOut) { this.passengersOut = passengersOut; }
}
