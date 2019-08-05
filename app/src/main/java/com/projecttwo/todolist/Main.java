package com.projecttwo.todolist;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TodoList myTodoList = new TodoList("My morning routine");
        myTodoList.createTask("Wake up", "Lewis", "01/08/2019");
        myTodoList.display();
    }
}