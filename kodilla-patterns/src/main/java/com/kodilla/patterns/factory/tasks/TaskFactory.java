package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String DRIVINGTASK = "DRIVINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String SHOPPINGTASK = "SHOPPINGTASK";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case DRIVINGTASK:
                return new DrivingTask("Driving_Task_01", "London", "Audi");
            case PAINTINGTASK:
                return new PaintingTask("Painting_Task_01", "Red", "Ceiling");
            case SHOPPINGTASK:
                return new ShoppingTask("Shopping_Task_01", "Ice Cream", 5);
            default:
                return null;
        }
    }

}




