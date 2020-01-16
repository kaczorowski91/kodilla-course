package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //given
        Library library = new Library("Prototype Library");
        IntStream.iterate(1, n -> n + 1)
                .limit(3)
                .forEach(n -> library.getBooks().add(new Book(n + " Part", n*n +"Author", LocalDate.of(2000, 12, 05))));

        Library shallowCloneLibrary = null;
        try {
            shallowCloneLibrary = library.shallowCopy();
            shallowCloneLibrary.setName("Shallow Clone Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepCloneLibrary =null;
        try {
            deepCloneLibrary=library.deepCopy();
            deepCloneLibrary.setName("Deep Clone Library");
        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }
        System.out.println("Prepare Data: \n");
        System.out.println(library+"\n");
        System.out.println(shallowCloneLibrary+"\n");
        System.out.println(deepCloneLibrary+"\n");
        //When
        library.getBooks().add(new Book("Tittle 99","James Patterson",LocalDate.of(2020,01,01)));
        //Then
        System.out.println("Test, after Add Book: \n");
        System.out.println(library+"\n");
        System.out.println(shallowCloneLibrary+"\n");
        System.out.println(deepCloneLibrary+"\n");
        Assert.assertEquals(4, library.getBooks().size());
        Assert.assertEquals(4, shallowCloneLibrary.getBooks().size());
        Assert.assertEquals(3, deepCloneLibrary.getBooks().size());
    }
}
