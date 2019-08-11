package com.projecttwo.todolist;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanMenuOption = new Scanner(System.in);
        int menuOption = -1;
        while (menuOption != 3) {
            System.out.println("Please choose option 1 to add a new task.");
            System.out.println("Please choose option 2 to rename a task.");
            System.out.println("Please choose option 3 to assign a deadline.");
            if (scanMenuOption.hasNextInt()) {
                menuOption = scanMenuOption.nextInt();
            }
            switch (menuOption){
                case 1:
                    System.out.println("Please choose a topic for your To Do List.");
                    String topic = scanMenuOption.nextLine();
                    new TodoList(topic);
                    System.out.println("Your To Do List " + topic + " was created.");
                    break;
                case 2:
                    break;
            }
        }

        TodoList myTodoList = new TodoList("My morning routine");
        myTodoList.createTask("Wake up", "Lewis", "01/08/2019");
        myTodoList.createTask("Knock knock", "Neo", "06/08/2019");
        myTodoList.display();
        myTodoList.assignDeadLine("Wake up", "12/08/2019");
        myTodoList.assignTask("Wake up", "Neo");
        myTodoList.display();
        myTodoList.removeTask("Wake up");
        myTodoList.renameTask("Knock knock", "Bye bye");
        myTodoList.display();

    }
}