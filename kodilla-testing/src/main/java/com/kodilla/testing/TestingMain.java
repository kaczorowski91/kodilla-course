package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        //    System.out.println("Moduł 6. Wprowadzenie to testowania oprogramowania");

        Calculator calculator1 = new Calculator(5, 8);

        if(calculator1.add() == 13) {
            System.out.println("Adding is OK");
        }else{
            System.out.println("Adding has Error");
        }

        if(calculator1.subtraction() == -3) {
            System.out.println("Subtractionningn is OK");
        }else{
            System.out.println("Subtractionning has Error");
        }
    }
}