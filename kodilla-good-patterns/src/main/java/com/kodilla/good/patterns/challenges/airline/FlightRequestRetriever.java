package com.kodilla.good.patterns.challenges.airline;

import java.util.ArrayList;
import java.util.List;

public class FlightRequestRetriever {

    public FlightRequest retrieverFlightList() {

        List<Flight> flightList = new ArrayList<>();

        Flight flight1 = new Flight("Warsaw", "Paris");
        Flight flight2 = new Flight("Lodz", "Rome");
        Flight flight3 = new Flight("London", "Paris");
        Flight flight4 = new Flight("Moscow", "Toronto");
        Flight flight5 = new Flight("Los Angeles", "Belgrade");
        Flight flight6 = new Flight("Prague", "Helsinki");
        Flight flight7 = new Flight("Paris", "Prague");
        Flight flight8 = new Flight("Warsaw", "Rome");
        Flight flight9 = new Flight("Warsaw", "Atlanta");
        Flight flight10 = new Flight("Rome", "Paris");
        Flight flight11 = new Flight("Atlanta", "Paris");
        Flight flight12 = new Flight("Helsinki", "Paris");
        Flight flight13 = new Flight("Helsinki", "Warsaw");
        Flight flight14 = new Flight("Rome", "Paris");

        flightList.add(flight1);
        flightList.add(flight2);
        flightList.add(flight3);
        flightList.add(flight4);
        flightList.add(flight5);
        flightList.add(flight6);
        flightList.add(flight7);
        flightList.add(flight8);
        flightList.add(flight9);
        flightList.add(flight10);
        flightList.add(flight11);
        flightList.add(flight12);
        flightList.add(flight13);
        flightList.add(flight14);

        return new FlightRequest(flightList);
    }

    public Flight flightRetriever(){
        return new  Flight("Warsaw", "Paris");
    }
}
