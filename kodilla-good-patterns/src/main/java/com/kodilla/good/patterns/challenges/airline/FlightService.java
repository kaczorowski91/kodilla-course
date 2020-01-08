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

    public void availableFlightFromWarsaw(FlightRequest flightRequest) {

        String flight = flightRequest.getFlightList().stream()
                .filter(f -> f.getDepartureFlight().equals("Warsaw"))
                .map(Flight::toString)
                .collect(Collectors.joining("", "\n", ""));

        System.out.println("Available flights from Warsaw:" + flight);
    }

    public void availableFlightToParis(FlightRequest flightRequest) {

        String flight = flightRequest.getFlightList().stream()
                .filter(f -> f.getDepartureFlight().equals("Warsaw"))
                .filter(f -> f.getArrivalFlight().equals("Paris"))
                .map(Flight::toString)
                .collect(Collectors.joining("", "\n", ""));

        System.out.println("Available flight to Paris: " + flight);
    }

    public void availableFlightFromWarsawToParisThroughRome(FlightRequest flightRequest) {

        String flightFrom = flightRequest.getFlightList().stream()
                .filter(f -> f.getDepartureFlight().equals("Warsaw"))
                .filter(f -> f.getArrivalFlight().equals("Rome"))
                .map(Flight::toString)
                .collect(Collectors.joining("", "\n", ""));

        String flightTo = flightRequest.getFlightList().stream()
                .filter(f -> f.getDepartureFlight().equals("Rome"))
                .filter(f -> f.getArrivalFlight().equals("Paris"))
                .map(Flight::toString)
                .collect(Collectors.joining("", "", ""));

        System.out.println("Available flight from Warsaw to Paris through Rome : " + flightFrom + flightTo);
    }


    public void availableFlightFromWarsawToParisThroughAnywhere(FlightRequest flightRequest) {

        List<String> flightFrom = flightRequest.getFlightList().stream()
                .filter(f -> f.getDepartureFlight().equals("Warsaw"))
                .filter(f -> !f.getArrivalFlight().equals("Paris"))
                .map(Flight::getArrivalFlight)
                .collect(Collectors.toList());

      //  List<Flight> flightThrough = flightRequest.getFlightList().stream()




        System.out.println("TEST  flightFrom " + flightFrom + "TEST  flightThrough " );
    }


}