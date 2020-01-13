package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {

        //Task #7.3

        Forum forum = new Forum();
        int year = LocalDate.now().getYear();
        Map<Integer, ForumUser> theResultStringOfUsers = forum.getList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> year - forumUser.getBirthday().getYear() > 20)
                .filter(forumUser -> forumUser.getPostQuantity() > 0)
                .collect(Collectors.toMap(ForumUser::getId, forumUser -> forumUser));

        System.out.println("# elements: " + theResultStringOfUsers.size());
        theResultStringOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);


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