package com.kodilla.exception.test;

public class SecondChallenge {
    public String probablyIWillThrowException(double x, double y) throws Exception {
        if (x >= 2.0 || x < 1.0 || y == 1.5) {
            throw new Exception();
        }
        return "Done!";
    }
}