package com.projecttwo.todolist;

import java.util.ArrayList;

class TodoList {
    private String topic;
    private ArrayList<Task> tasks;

    TodoList(String topic) {
        this.topic = topic;
        this.tasks = new ArrayList<>();
    }

    /**
     * This method is used to show all of the tasks in the to do list.
     *
     * @return None
     */
    void display() {
        System.out.println("Here is our To Do List for " + topic + ".");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println("Task " + (i + 1) + " is " + tasks.get(i).getTaskName() + " and is due to be completed by " + tasks.get(i).getEmployeeName() + " on " + tasks.get(i).getDeadLine() + ".");
        }
    }

    void assignTask(String taskName, String employeeName) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getTaskName().equals(taskName)) {
                tasks.get(i).setEmployeeName(employeeName);
                return;
            }
        }
    }

    void assignDeadLine(String taskName, String deadLine) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getTaskName().equals(taskName)) {
                tasks.get(i).setDeadLine(deadLine);
                return;
            }
        }
    }

    void createTask(String taskName, String employeeName, String deadLine) {
        Task taskOne = new Task(taskName);
        taskOne.setEmployeeName(employeeName);
        taskOne.setDeadLine(deadLine);
        tasks.add(taskOne);
    }

    void removeTask(String taskName) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getTaskName().equals(taskName)) {
                tasks.remove(i);
                return;
            }
        }
    }

    void renameTask(String taskName, String newTaskName) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getTaskName().equals(taskName)) {
                tasks.get(i).setTaskName(newTaskName);
                return;
            }
        }
    }
}