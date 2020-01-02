package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MovieStoreStream {

    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();

        String movies = movieStore.getMovies().entrySet().stream()
                .flatMap(entry -> entry.getValue().stream())
                .collect(Collectors.joining(" ! "));
        System.out.println(movies);

/*        final String movies2 = movieStore.getMovies().entrySet().stream()
                .flatMap(n -> {
                    List<String> list = new ArrayList<>();
                    list.add(n.getKey());
                    list.addAll(n.getValue());
                    return list.stream();
                })
                .collect((Collectors.joining(" ! ")));
        System.out.println(movies2);*/

    }
}
