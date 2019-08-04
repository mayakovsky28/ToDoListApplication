package com.projecttwo.todolist;

import java.util.ArrayList;

class TodoList {
    private String topic;
    private ArrayList<Task> tasks;

    TodoList(String topic) {
        this.topic = topic;
        this.tasks = new ArrayList<>();
    }

    void display() {
        System.out.println("Here is our To Do List for " + topic);
        for (int i = 0; i < this.tasks.size(); i++) {
            System.out.println("Task " + (i + 1) + " is " + this.tasks.get(i) + ("."));
        }
    }

    /*void assignTask(String taskName, String employeeName) {
        for (int i = 0; i < this.tasks.size(); i++) {
    if (taskName == Task(i).taskName) {
        Task(i).employeeName = employeeName;
    }
        }
    }*/

    void assignDeadLine(String taskName, String deadLine){}

    void createTask(String taskName, String employeeName, String deadLine) {
        Task taskOne = new Task(taskName);
        taskOne.setEmployeeName(employeeName);
        taskOne.setDeadLine(deadLine);
        tasks.add(taskOne);
    }

    void markAsDone(String taskName){
    }
    
    void removeTask(String taskName) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getTaskName().equals(taskName)) {
                this.tasks.remove(i);
                return;
            }
        }
    }


//    void renameTask(String taskName, String newTaskName) {
//        try {
//            this.tasks.set(taskName, newTask);
//        } catch (IndexOutOfBoundsException e) {
//            System.out.println("Could not rename task, no such task.");
//        }
//    }

}