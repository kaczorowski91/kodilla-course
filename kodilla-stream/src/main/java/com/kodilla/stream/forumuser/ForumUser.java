package com.kodilla.stream.forumuser;


import java.time.LocalDate;

public class ForumUser {

    private final int id;
    private final String name;
    private final char sex;
    private final LocalDate birthday;
    private final int postQuantity;

    public ForumUser(int id, String name, char sex, LocalDate birthday, int postQuantity) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.postQuantity = postQuantity;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getPostQuantity() {
        return postQuantity;
    }

    @Override
    public String toString() {
        return "Forum Use{" +
                "Id='" + id + '\'' +
                ", Name='" + name + '\'' +
                ", Sex='" + sex + '\'' +
                ", Birthday'" + birthday + '\'' +
                ", Post Quantity '" + postQuantity + '\'' +
                '}';


    }
}