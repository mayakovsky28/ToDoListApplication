package com.projecttwo.todolist;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanMenuOption = new Scanner(System.in);
        int menuOption = -1;
        while (menuOption != 3) {
            System.out.println("Please choose option 1 to create a new to do list.");
            if (scanMenuOption.hasNextInt()) {
                menuOption = scanMenuOption.nextInt();
            }
            switch (menuOption){
                case 1:
                    System.out.print("Please choose a topic for your To Do List:");
                    String topic = scanMenuOption.nextLine();
                    new TodoList(topic);
                    System.out.println("Your To Do List " + topic + " was created.");
                    System.out.println("Please choose option 1 to add a new task.");
                    System.out.println("Please choose option 2 to edit or remove a task.");
                    if (scanMenuOption.hasNextInt()) {
                        menuOption = scanMenuOption.nextInt();
                    }
                    switch (menuOption) {
                        case 1: System.out.print("Please provide task name, employee name, and dead line:");
                        String newTask = scanMenuOption.nextLine();
                        TodoList.createTask(newTask);
                        case 2: System.out.println("Please choose option 1 to edit a task.");
                        System.out.println("Please choose option 2 to remove a task.");
                        if (scanMenuOption.hasNextInt()){
                            menuOption = scanMenuOption.nextInt();
                        }
                        switch (menuOption) {
                            case 1: System.out.print("Please write the name of the task you wish to edit:");
                            String taskToBeEdited = scanMenuOption.nextLine();
                            System.out.println("Task: " + taskToBeEdited + " is available for editing.");
                            System.out.println("Please choose option 1 to change the name of the task.");
                            System.out.println("Please choose option 2 to change the assigned employee.");
                            System.out.println("Please choose option 3 to change the dead line.");
                            if (scanMenuOption.hasNextInt()) {
                                menuOption= scanMenuOption.nextInt();
                            }
                            switch (menuOption) {
                                case 1: System.out.print("Please write the new task name for " + taskToBeEdited + ":");
                                String newTaskName = scanMenuOption.nextLine();
                                TodoList.renameTask(taskToBeEdited, newTaskName);
                                System.out.println(taskToBeEdited + " has been renamed " + newTaskName + ".");
                                break;
                                case 2: System.out.print("Please write the new assigned employee for " + taskToBeEdited + ":");
                                String newEmployee = scanMenuOption.nextLine();
                                TodoList.assignTask(taskToBeEdited, newEmployee);
                                System.out.println(taskToBeEdited + " has now been assigned to " + newEmployee + ".");
                                break;
                                case 3: System.out.print("Please write the new dead line for " + taskToBeEdited + ":");
                                String newDeadLine = scanMenuOption.nextLine();
                                TodoList.assignDeadLine(taskToBeEdited, newDeadLine);
                                System.out.println(taskToBeEdited + " has a new dead line of " + newDeadLine + ".");
                                break;
                            }
                            case 2: System.out.print("Please write the name of the task you wish to remove:");
                            String taskToBeDeleted = scanMenuOption.nextLine();
                            TodoList.removeTask(taskToBeDeleted);
                            System.out.println(taskToBeDeleted + " is no more.");
                            break;
                        }
                    }
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