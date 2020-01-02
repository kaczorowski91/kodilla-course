package com.kodilla.stream.forumuser;

import com.kodilla.stream.book.BookDirectory;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theUserList = new ArrayList<>();

    public Forum() {
        theUserList.add(new ForumUser(1, "Ciamajda", 'M', LocalDate.of(2005, 03, 12), 55));
        theUserList.add(new ForumUser(2, "Krzysio", 'M', LocalDate.of(1969, 8, 1), 554));
        theUserList.add(new ForumUser(3, "Lucy", 'F', LocalDate.of(2000, 2, 11), 5541));
        theUserList.add(new ForumUser(4, "Wladyslaw", 'M', LocalDate.of(1950, 8, 1), 0));
        theUserList.add(new ForumUser(5, "Beatka", 'F', LocalDate.of(1988, 12, 25), 54));
    }

    public List<ForumUser> getList() {
        return new ArrayList<>(theUserList);
    }


}
