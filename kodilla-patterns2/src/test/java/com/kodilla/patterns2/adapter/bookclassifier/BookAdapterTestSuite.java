package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.company.bookclasifier.MedianAdaptee;
import com.kodilla.patterns2.adapter.company.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.company.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class BookAdapterTestSuite {

    @Test
    public void publicationYearMedianTest(){
        //Given
        Set<Book> theBooks = new HashSet<>();
        MedianAdapter medianAdapter = new MedianAdapter();
        theBooks.add(new Book("James Patterson","Zdaze Cie zabic",2000,"no"));
        theBooks.add(new Book("Alex Kava","Trucizna",2010,"no"));
        theBooks.add(new Book("Harlen Coben","Nieznajomy",1958,"no"));
        theBooks.add(new Book("Wojciech Cejrowski","Grigo",2015,"yes"));
        theBooks.add(new Book("Robert C. Martin","Czysty Kod",2011,"no"));
        //When
        int median = medianAdapter.publicationYearMedian(theBooks);
        //Then
















    }
}
