package com.kodilla.good.patterns.challenges.airline;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

    public void availableFlightToParis(FlightRequest flightRequest){

        String flight = flightRequest.getFlightList().stream()
                .filter(f -> f.getDepartureFlight().equals("Warsaw"))
                .filter(f ->f.getArrivalFlight().equals("Paris"))
                .map(Flight::toString)
                .collect(Collectors.joining("","\n",""));

        System.out.println("Available flight to Paris: " + flight);
    }

    public void availableFlightFromWarsawToParisThroughRome(FlightRequest flightRequest){

        String flightFrom = flightRequest.getFlightList().stream()
                .filter(f -> f.getDepartureFlight().equals("Warsaw"))
                .filter(f ->f.getArrivalFlight().equals("Rome"))
                .map(Flight::toString)
                .collect(Collectors.joining("","\n",""));

        String flightTo = flightRequest.getFlightList().stream()
                .filter(f -> f.getDepartureFlight().equals("Rome"))
                .filter(f ->f.getArrivalFlight().equals("Paris"))
                .map(Flight::toString)
                .collect(Collectors.joining("","",""));

        System.out.println("Available flight from Warsaw to Paris through Rome : " + flightFrom + flightTo);
    }


    public void availableFlightFromWarsawToParisThroughAnywhere(FlightRequest flightRequest){

       List<Flight> flightFrom = flightRequest.getFlightList().stream()
                .filter(f -> f.getDepartureFlight().equals("Warsaw"))
                .collect(Collectors.toList());


        List<String> flightThrough = flightFrom.stream()
                .map(Flight::getArrivalFlight)
               .collect(Collectors.toList());

        flightThrough.forEach(f->f.toUpperCase());

/*        List<Flight> flightTo = flightRequest.getFlightList().stream()
                .filter(f -> f.getArrivalFlight().equals("Paris"))
                .filter((f -> f.getDepartureFlight().equals(flightThrough)))
                .collect(Collectors.toList());*/

        System.out.println("List<Flight> flightFrom " +flightFrom+" List<String> flightThrough " +flightThrough+ " flightTo " );
    }




}