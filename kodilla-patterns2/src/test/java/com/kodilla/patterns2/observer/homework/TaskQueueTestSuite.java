package com.kodilla.patterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class TaskQueueTestSuite {

    @Test
    public void testInformMentorAboutTask(){
        //Given
        TaskQueue designPatternTaskQueue = new DesignPatternTaskQueue();
        Mentor mentor1 = new Mentor("Mentor1");
        designPatternTaskQueue.registerObserver(mentor1);

        //When
        designPatternTaskQueue.addTask(new Task("Task1"));
        designPatternTaskQueue.addTask(new Task ("Task2"));
        designPatternTaskQueue.addTask(new Task("Task3"));

        //Then
        Assert.assertEquals(3,mentor1.getTaskInQueue());
    }


    @Test
    public void testCheckRemoveFrom(){
        //Given
        StudentTaskQueue student1TaskQueue = new StudentTaskQueue();
        Mentor mentor1 = new Mentor("Menton1");
        student1TaskQueue.registerObserver(mentor1);
        //When
        student1TaskQueue.addTask(new Task("Task1"));
        student1TaskQueue.addTask(new Task("Task2"));
        student1TaskQueue.addTask(new Task("Task3"));

        mentor1.check(student1TaskQueue);
        //Then
        Assert.assertEquals(2,mentor1.getTaskInQueue());
    }
}
