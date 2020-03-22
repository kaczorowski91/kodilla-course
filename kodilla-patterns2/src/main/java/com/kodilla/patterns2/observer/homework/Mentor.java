package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;

public class Mentor implements Observer {
    private final String name;
    private int taskInQueue;


    public Mentor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void update(TaskQueue taskQueue) {
        System.out.println(name + " New task in " + taskQueue.getName() + " total tasks " + taskQueue.getTheQueue().size() + " in queue");
        taskInQueue++;
    }

    public void check(TaskQueue taskQueue){
        taskQueue.removeTask();
        taskInQueue--;
    }

    public int getTaskInQueue() {
        return taskInQueue;
    }

}
