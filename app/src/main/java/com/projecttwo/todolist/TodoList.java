package com.projecttwo.todolist;

import java.util.ArrayList;

class TodoList {
    private String topic;
    private ArrayList<Task> tasks;

    TodoList(String topic) {
        this.topic = topic;
        this.tasks = new ArrayList<>();
    }

    TodoList myTodoList = new TodoList("My morning routine");


    Task taskOne = new Task;
        taskOne.taskName = "Wake up";
        taskOne.employeeName = "Lewis";
        taskOne.deadLine = "01/08/2019";
        myTodoList.tasks.add(taskOne);

    void display() {
        System.out.println("Here is our To Do List for " + topic);
        for (int i = 0; i < this.tasks.size(); i++) {
            System.out.println("Task " + (i + 1) + " is " + this.tasks.get(i) + ("."));
        }
    }

    void assignTask(String taskName, String employeeName) {
        for (int i = 0; i < this.tasks.size(); i++) {
    if (taskName == Task(i).taskName) {
        Task(i).employeeName = employeeName;
    }
        }
    }

    void assignDeadLine(String taskName, String deadLine){}

    Task taskOne = new Task();
    taskOne.taskName = "Wake up";
    taskOne.employeeName = "Lewis";
    taskOne.deadLine = "01/08/2019";
    TodoList(0) = taskOne;

    void createTask(Task tasks);
    this.tasks = task;
    }

    void markAsDone(String taskName){}
    
    void removeTask(int i) {
        try {
            this.tasks.remove(i);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Could not remove task, no such task.");
        }
    }

    void renameTask(int i, String newTask) {
        try {
            this.tasks.set(i, newTask);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Could not rename task, no such task.");
        }
    }

}