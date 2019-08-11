package com.projecttwo.todolist;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TodoList myTodoList = new TodoList("emptyTopic");

        Scanner scanMenuOption = new Scanner(System.in);
        String menuOption = "";
        while (menuOption.equals("")) {
            System.out.println("Please choose option 1 to create a new to do list.");
            //if (scanMenuOption.hasNext()) {
            menuOption = scanMenuOption.next();
            // }
            switch (menuOption) {
                case "1":
                    System.out.print("Please choose a topic for your To Do List: ");
                    if (scanMenuOption.hasNextLine()) {
                        String topic = scanMenuOption.nextLine();
                        while (topic.equals("")) {
                            topic = scanMenuOption.nextLine();
                        }
                       // if (topicsList.contains(topic)) {
                       //     System.out.println("There is already a to do list with this topic.")
                        myTodoList = new TodoList(topic);
                        System.out.println("Your To Do List " + topic + " was created.");
                        System.out.println("Please choose option 1 to add a new task.");
                        System.out.println("Please choose option 2 to edit or remove a task.");
                        //if (scanMenuOption.hasNext()) {
                        menuOption = scanMenuOption.next();
                        // }
                    }
                    switch (menuOption) {
                        case "1":
                            createTaskForm(myTodoList);
                            break;
                        case "2":
                            System.out.println("Please choose option 1 to edit a task.");
                            System.out.println("Please choose option 2 to remove a task.");
                            //if (scanMenuOption.hasNextInt()) {
                            menuOption = scanMenuOption.next();
                            //}
                            switch (menuOption) {
                                case "1":
                                    System.out.print("Please write the name of the task you wish to edit:");
                                    String taskToBeEdited = scanMenuOption.nextLine();
                                    System.out.println("Task: " + taskToBeEdited + " is available for editing.");
                                    System.out.println("Please choose option 1 to change the name of the task.");
                                    System.out.println("Please choose option 2 to change the assigned employee.");
                                    System.out.println("Please choose option 3 to change the dead line.");
                                    if (scanMenuOption.hasNext()) {
                                        menuOption = scanMenuOption.next();
                                    }
                                    switch (menuOption) {
                                        case "1":
                                            System.out.print("Please write the new task name for " + taskToBeEdited + ":");
                                            String newTaskName = scanMenuOption.nextLine();
                                            myTodoList.renameTask(taskToBeEdited, newTaskName);
                                            System.out.println(taskToBeEdited + " has been renamed " + newTaskName + ".");
                                            break;
                                        case "2":
                                            System.out.print("Please write the new assigned employee for " + taskToBeEdited + ":");
                                            String newEmployee = scanMenuOption.nextLine();
                                            myTodoList.assignTask(taskToBeEdited, newEmployee);
                                            System.out.println(taskToBeEdited + " has now been assigned to " + newEmployee + ".");
                                            break;
                                        case "3":
                                            System.out.print("Please write the new dead line for " + taskToBeEdited + ":");
                                            String newDeadLine = scanMenuOption.nextLine();
                                            myTodoList.assignDeadLine(taskToBeEdited, newDeadLine);
                                            System.out.println(taskToBeEdited + " has a new dead line of " + newDeadLine + ".");
                                            break;
                                    }
                                case "2":
                                    System.out.print("Please write the name of the task you wish to remove:");
                                    String taskToBeDeleted = scanMenuOption.nextLine();
                                    myTodoList.removeTask(taskToBeDeleted);
                                    System.out.println(taskToBeDeleted + " is no more.");
                                    break;
                            }
                    }
                    break;
                case "2":
                    break;
            }
        }

        TodoList myTodoList2 = new TodoList("My morning routine");
        myTodoList2.createTask("Wake up", "Lewis", "01/08/2019");
        myTodoList2.createTask("Knock knock", "Neo", "06/08/2019");
        myTodoList2.display();
        myTodoList2.assignDeadLine("Wake up", "12/08/2019");
        myTodoList2.assignTask("Wake up", "Neo");
        myTodoList2.display();
        myTodoList2.removeTask("Wake up");
        myTodoList2.renameTask("Knock knock", "Bye bye");
        myTodoList2.display();

    }

    static void createTaskForm(TodoList myTodoList) {
        Scanner scanForTask = new Scanner(System.in);
        System.out.print("Provide task name:\n");
        String taskName = scanForTask.next();
        System.out.print("Provide employee name:\n");
        String employeeName = scanForTask.next();
        System.out.print("Provide dead line:\n");
        String deadLine = scanForTask.next();
        myTodoList.createTask(taskName, employeeName, deadLine);
        myTodoList.display();
    }
}