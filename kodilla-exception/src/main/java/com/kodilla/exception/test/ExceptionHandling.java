package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(2.0, 1.5);
            return;
        } catch (Exception e) {
            System.out.println("Error -> " + e);
        } finally {
            System.out.println("This is finally");
        }


    }

}
