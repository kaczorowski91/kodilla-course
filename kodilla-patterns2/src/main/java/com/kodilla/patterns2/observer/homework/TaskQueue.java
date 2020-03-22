package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class TaskQueue implements Observable {
    private final List<Observer> observers;
    private final ArrayDeque<Task> theQueue;
    private final String name;

    public TaskQueue(String name) {
        observers = new ArrayList<>();
        theQueue = new ArrayDeque<>();
        this.name = name;
    }

    public void addTask(Task task) {
        theQueue.offer(task);
        this.notifyObservers();
    }

    public void removeTask (){
        theQueue.poll();
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public ArrayDeque<Task> getTheQueue() {
        return theQueue;
    }

    public String getName() {
        return name;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers)
            observer.update(this);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

}



