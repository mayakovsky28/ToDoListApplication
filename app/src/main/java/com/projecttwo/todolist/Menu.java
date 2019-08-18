package com.projecttwo.todolist;

import java.util.ArrayList;
import java.util.Scanner;

class Menu {
    ArrayList taskList = new ArrayList<String>();
    TodoList myTodoList = new TodoList("emptyTopic");

    void generateUserMenu() {
        Scanner scanMenuOption = new Scanner(System.in);
        String menuOption = "";
        while (!menuOption.equals("3")) {
            System.out.println("Please choose option 1 to create a new to do list.");
            System.out.println("Please choose option 4 to close the programme.");
            //if (scanMenuOption.hasNext()) {
            menuOption = scanMenuOption.next();
            // }
            switch (menuOption) {
                case "1":
                    createToDoList();
                    do {
                        menuOption = "";
                        System.out.println("Please choose option 1 to add a new task.");
                        System.out.println("Please choose option 2 to edit or remove a task.");
                        System.out.println("Please choose option 4 to close the programme.");
                        if (scanMenuOption.hasNext()) {
                            menuOption = scanMenuOption.next();
                        }
                        switch (menuOption) {
                            case "1":
                                createTaskForm(myTodoList);
                                break;
                            case "2":
                                System.out.println("Please choose option 1 to edit a task.");
                                System.out.println("Please choose option 2 to mark a task as completed.");
                                if (scanMenuOption.hasNext()) {
                                    menuOption = scanMenuOption.next();
                                }
                                switch (menuOption) {
                                    case "1":
                                        Scanner scanForTaskToBeEdited = new Scanner(System.in);
                                        System.out.print("Please write the name of the task you wish to edit: \n");
                                        String taskToBeEdited = scanForTaskToBeEdited.nextLine();
                                        System.out.println("Task " + taskToBeEdited + " is available for editing.");
                                        System.out.println("Please choose option 1 to change the name of the task.");
                                        System.out.println("Please choose option 2 to change the assigned employee.");
                                        System.out.println("Please choose option 3 to change the dead line.");
                                        if (scanMenuOption.hasNext()) {
                                            menuOption = scanMenuOption.next();
                                        }
                                        switch (menuOption) {
                                            case "1":
                                                System.out.print("Please write the new task name for " + taskToBeEdited + ": \n");
                                                String newTaskName = scanForTaskToBeEdited.nextLine();
                                                myTodoList.renameTask(taskToBeEdited, newTaskName);
                                                System.out.println("Task " + taskToBeEdited + " has been renamed " + newTaskName + ".");
                                                break;
                                            case "2":
                                                System.out.print("Please write the new assigned employee for " + taskToBeEdited + ": \n");
                                                String newEmployee = scanForTaskToBeEdited.nextLine();
                                                myTodoList.assignTask(taskToBeEdited, newEmployee);
                                                System.out.println(taskToBeEdited + " has now been assigned to " + newEmployee + ".");
                                                break;
                                            case "3":
                                                System.out.print("Please write the new dead line for " + taskToBeEdited + ": \n");
                                                String newDeadLine = scanForTaskToBeEdited.nextLine();
                                                myTodoList.assignDeadLine(taskToBeEdited, newDeadLine);
                                                System.out.println(taskToBeEdited + " has a new dead line of " + newDeadLine + ".");
                                                break;
                                        }
                                        break;
                                    case "2":
                                        System.out.print("Please write the name of the task you wish to complete: \n");
                                        String taskToBeDeleted = scanMenuOption.nextLine();
                                        myTodoList.removeTask(taskToBeDeleted);
                                        System.out.println(taskToBeDeleted + " is no more.");
                                        break;
                                }
                        }
                    } while (!menuOption.equals("4"));
                case "2":
                    System.out.println("Good bye!");
                    return;
            }
        }
    }

    private void createTaskForm(TodoList myTodoList) {
        Scanner scanForTask = new Scanner(System.in);
        System.out.print("Provide task name:\n");
        String taskName = scanForTask.nextLine();
        if (taskList.contains(taskName)) {
            System.out.println("The task " + taskName + " already exists.");
            createTaskForm(myTodoList);
        } else {
            taskList.add(taskName);
            System.out.print("Provide employee name:\n");
            String employeeName = scanForTask.nextLine();
            System.out.print("Provide dead line:\n");
            String deadLine = scanForTask.nextLine();
            myTodoList.createTask(taskName, employeeName, deadLine);
            myTodoList.display();
        }
    }

    private void createToDoList() {
        Scanner scanForTopic = new Scanner(System.in);
        System.out.print("Please choose a topic for your To Do List: ");
        if (scanForTopic.hasNextLine()) {
            String topic = scanForTopic.nextLine();
            while (topic.equals("")) {
                topic = scanForTopic.nextLine();
            }
            ArrayList<String> topicsList = new ArrayList<>();
            for (int i = 0; i < topicsList.size(); i++) {
                if (topicsList.get(i).equals(topic)) {
                    System.out.println("There is already a to do list with this topic.");
                    return;
                }
                topicsList.add(topic);
            }
            TodoList.topic = topic;
            System.out.println("Your To Do List " + topic + " was created.");
        }
    }
}