package com.kodilla.spring.calculator;

import org.springframework.context.annotation.Configuration;

@Configuration
public class Calculator {

    private Display display;

    double add(double a, double b) {
        double total = a + b;
        return display.displayValue(total);
    }

    double sub(double a, double b) {
        double difference = a - b;
        return display.displayValue(difference);
    }


    double mul(double a, double b) {
        double product = a * b;
        return display.displayValue(product);
    }

    double div(double a, double b) {
        double quotient = a / b;
        return display.displayValue(quotient);
    }

}


