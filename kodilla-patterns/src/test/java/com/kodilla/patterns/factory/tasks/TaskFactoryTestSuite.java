package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When

        Task drivingTask = taskFactory.makeTask(TaskFactory.DRIVINGTASK);
        //Then
        Assert.assertEquals("Driving_Task_01", drivingTask.getTaskName());
        Assert.assertEquals(false, drivingTask.isTaskExecuted());
        drivingTask.executeTask();
        Assert.assertEquals(true, drivingTask.isTaskExecuted());
    }

    @Test
    public void testPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task paintingTask = taskFactory.makeTask(TaskFactory.PAINTINGTASK);
        //Then
        Assert.assertEquals("Painting_Task_01", paintingTask.getTaskName());
        Assert.assertEquals(false, paintingTask.isTaskExecuted());
        paintingTask.executeTask();
        Assert.assertEquals(true, paintingTask.isTaskExecuted());
    }

    @Test
    public void testShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shoppingTask = taskFactory.makeTask(TaskFactory.SHOPPINGTASK);
        //Then
        Assert.assertEquals("Shopping_Task_01", shoppingTask.getTaskName());
        Assert.assertEquals(false, shoppingTask.isTaskExecuted());
        shoppingTask.executeTask();
        Assert.assertEquals(true, shoppingTask.isTaskExecuted());
    }
}


