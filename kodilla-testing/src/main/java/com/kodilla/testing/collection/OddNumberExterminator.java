package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumberExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {

        ArrayList<Integer> evenNumbersList = new ArrayList<Integer>();

        for (Integer evenNumbers : numbers)
            if (evenNumbers % 2 == 0) {
                evenNumbersList.add(evenNumbers);
            }
        return evenNumbersList;
    }
}
