package com.kodilla.exception.test;
import java.util.HashMap;
import java.util.Map;

public class FindFlight {

    public void flightAvailable(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> arrivalAirportAvailable = new HashMap<>();
        arrivalAirportAvailable.put("Warsaw", Boolean.TRUE);
        arrivalAirportAvailable.put("London", Boolean.FALSE);

        if (arrivalAirportAvailable.containsKey(flight.getArrivalAirport()) && arrivalAirportAvailable.get(flight.getArrivalAirport())) {
            //roznica contain value a get!
            System.out.println("Arrival airport is available");
        } else {
            throw new RouteNotFoundException("Arrival airport is unavailable");
        }
    }

    public static void main(String[] args) throws RouteNotFoundException {

        FindFlight findFlight = new FindFlight();

        Flight flight = new Flight("Paris","Warsaw");

        findFlight.flightAvailable(flight);
    }
}
