package com.projecttwo.todolist;

import java.util.ArrayList;

class TodoList {
    private String topic;
    private ArrayList<Task> tasks;

    TodoList(String topic) {
        this.topic = topic;
        this.tasks = new ArrayList<Task>();
    }

    void addTask(String taskName, String employeeName,) {
        this.tasks.add(taskName);
    }

    public void display() {
        System.out.println("Here is our Todo List for " + topic);
        for (int i = 0; i < this.tasks.size(); i++) {
            System.out.println("Task " + (i + 1) + " is " + this.tasks.get(i));
        }
    }

    public void removeTask(int i) {
        try {
            this.tasks.remove(i);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Could not remove task.");
        }
    }

    public void rename(int i, String newTask) {
        try {
            this.tasks.set(i, newTask);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Could not rename task.");
        }
    }

}