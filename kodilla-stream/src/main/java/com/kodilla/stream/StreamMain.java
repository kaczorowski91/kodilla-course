package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.person.People;

public class StreamMain {
    public static void main(String[] args) {


        People.getList().stream()
                    .map(s -> s.toUpperCase())
                    .forEach(System.out::println);

        People.getList().stream()
                .map(String::toUpperCase)
                .forEach(s -> System.out.println(s));

        // Task #7.1
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
            System.out.println("Poem with modified sign L on R");
            return text.replace('L','R');
        });

    }
}