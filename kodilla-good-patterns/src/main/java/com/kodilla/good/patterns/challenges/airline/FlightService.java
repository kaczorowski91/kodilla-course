package com.kodilla.good.patterns.challenges.airline;

import java.util.List;
import java.util.stream.Collectors;

public class FlightService {

    public void availableFlight(FlightRequest flightRequest) {

        String flight = flightRequest.getFlightList().stream()
                .map(Flight::toString)
                .collect(Collectors.joining("", "\n", ""));

        System.out.println("Available Flights:" + flight);
    }

    public void availableFlightFrom(FlightRequest flightRequest, Flight flight) {

        String availableFlightFrom = flightRequest.getFlightList().stream()
                .filter(f -> f.getDepartureFlight().equals(flight.getDepartureFlight()))
                .map(Flight::toString)
                .collect(Collectors.joining("", "\n", ""));

        System.out.println("Available flights from " + flight.getDepartureFlight() + " " + availableFlightFrom);
    }

    public void availableFlightTo(FlightRequest flightRequest, Flight flight) {

        String availableFlightTo = flightRequest.getFlightList().stream()
                .filter(f -> f.getArrivalFlight().equals(flight.getArrivalFlight()))
                .map(Flight::toString)
                .collect(Collectors.joining("", "\n", ""));

        System.out.println("Available flight to " + flight.getArrivalFlight() + " " + availableFlightTo);
    }


    public void availableFlightThrough(FlightRequest flightRequest, Flight flight) {

        String flightFrom = flightRequest.getFlightList().stream()
                .filter(f -> f.getDepartureFlight().equals(flight.getDepartureFlight()))
                .filter(f -> !f.getArrivalFlight().equals(flight.getArrivalFlight()))
                .map(Flight::toString)
                .collect(Collectors.joining("","\n",""));

        List<String> flightFromArrivalFlightList = flightRequest.getFlightList().stream()
                .filter(f -> f.getDepartureFlight().equals(flight.getDepartureFlight()))
                .filter(f -> !f.getArrivalFlight().equals(flight.getArrivalFlight()))
                .map(Flight::getArrivalFlight)
                .collect(Collectors.toList());

        String flightTo = flightRequest.getFlightList().stream()
                .filter(f -> flightFromArrivalFlightList.contains(f.getDepartureFlight()))
                .map(Flight::toString)
                .collect(Collectors.joining("","\n",""));

        System.out.println("Available flights from "+ flight.getDepartureFlight()+ " to " + flight.getArrivalFlight()+
                " through anywhere:\n"+ flightFrom+flightTo);
    }


}