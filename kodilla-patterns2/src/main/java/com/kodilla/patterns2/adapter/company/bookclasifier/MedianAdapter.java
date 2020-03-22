package com.kodilla.patterns2.adapter.company.bookclasifier;

import com.kodilla.patterns2.adapter.company.bookclasifier.librarya.Book;
import com.kodilla.patterns2.adapter.company.bookclasifier.librarya.Classfier;
import com.kodilla.patterns2.adapter.company.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classfier {
    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, com.kodilla.patterns2.adapter.company.bookclasifier.libraryb.Book> theBooks = new HashMap<>();
/*        for (int i = 0; i < bookSet.size(); i++) {
            theBooks.put(new BookSignature());

        }*/


        return 0;
    }
}
