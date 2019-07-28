package com.projecttwo.todolist;

public class Main {
    public static void main(String[] args) {

        TodoList myTodoList = new TodoList("My morning routine");

        myTodoList.addTask("Wake up.");
        myTodoList.addTask("Knock knock.");
        myTodoList.addTask("Follow the white rabbit.");
        myTodoList.addTask("Knock knock.");
        myTodoList.display();
        myTodoList.removeTask(2);
        myTodoList.display();
        myTodoList.rename(1, "Neo.");
        myTodoList.display();
    }
}