package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);
        //When
        String toDoTask = "toDo";
        board.getToDoList().addTask(toDoTask);
        String inProgressTask = "inProgress";
        board.getInProgressList().addTask(inProgressTask);
        String doneTask = "done";
        board.getDoneList().addTask(doneTask);
        //Then
        Assert.assertEquals("toDo", board.getToDoList().getTasks().get(0));
        Assert.assertEquals("inProgress", board.getInProgressList().getTasks().get(0));
        Assert.assertEquals("done", board.getDoneList().getTasks().get(0));
    }

}
