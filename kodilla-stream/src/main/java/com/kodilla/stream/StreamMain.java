package com.kodilla.stream;

import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        String poem = "Litwo Ojczyno Moja";
        System.out.println("Original poem " + poem);

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify(poem, (text) -> {
            System.out.println("Poem to Upper Case");
            return text.toUpperCase();
        });

        poemBeautifier.beautify(poem, (text) -> {
            System.out.println("Poem to Lower Case");
            return text.toLowerCase();
        });

        poemBeautifier.beautify(poem, (text) -> {
            System.out.println("Poem with additional text");
            return "ABC "+text+" ABC";
        });

        poemBeautifier.beautify(poem, (text) -> {
            System.out.println("Poem with additional text");
            return text.replace('L','R');
        });

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);


    }
}