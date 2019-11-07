package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        //    System.out.println("Moduł 6. Wprowadzenie to testowania oprogramowania");

        Calculator calculator1 = new Calculator();

        if(calculator1.add(5,8) == 13) {
            System.out.println("Addition is OK");
        }else{
            System.out.println("Addition  has Error");
        }

        if(calculator1.subtract(5,8) == -3) {
            System.out.println("Subtraction is OK");
        }else{
            System.out.println("Subtraction has Error");
        }
    }
}