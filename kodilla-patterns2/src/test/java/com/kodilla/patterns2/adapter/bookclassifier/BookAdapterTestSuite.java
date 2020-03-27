package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class BookAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<Book> theBooks = new HashSet<>();
        MedianAdapter medianAdapter = new MedianAdapter();
        theBooks.add(new Book("James Patterson", "Zdaze Cie zabic", 2000, "0001"));
        theBooks.add(new Book("Alex Kava", "Trucizna", 2010, "0002"));
        theBooks.add(new Book("Harlen Coben", "Nieznajomy", 1958, "0003"));
        theBooks.add(new Book("Wojciech Cejrowski", "Grigo", 2044, "0004"));
        theBooks.add(new Book("Robert C. Martin", "Czysty Kod", 2002, "0005"));
        theBooks.add(new Book("Harlan Coben", "O krok za daleko", 2020, "0006"));
        //When
        int median = medianAdapter.publicationYearMedian(theBooks);
        //Then
        Assert.assertEquals(median,2005,0);

    }
}
