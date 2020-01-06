package com.kodilla.good.patterns.challenges.airline;

import java.util.HashMap;
import java.util.Map;

public class FlightRetriever {

    public Flight retriever() {
        Map<String, String> flightList = new HashMap<>();
        flightList.put("Warszawa", "Paryz");
        flightList.put("Warszawa", "Londyn");
        flightList.put("Warszawa", "Moskwa");
        flightList.put("Warszawa", "Bruksela");
        flightList.put("Poznan", "Gdansk");
        flightList.put("Poznan", "Katowice");
        flightList.put("Poznan", "Wroclaw");
        flightList.put("Wroclaw", "Lodz");

        return new Flight(flightList);
    }

}



