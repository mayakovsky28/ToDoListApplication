package com.projecttwo.todolist;

import org.junit.Test;
import static org.junit.Assert.*;

public class TodoListTest {

    @Test
    public void isDone_isFalseOnInstantiation_false() {
        Task myTask = new Task("Mow the lawn");
        assertFalse(myTask.isDone());
    }

    @Test
    public void taskName_isInitialised() {
        Task myTask = new Task("Mow the lawn");
        assertEquals("Mow the lawn", myTask.getTaskName());
    }

    @Test
    public void runProgramme() {
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

    @Test
    public void employeeName_isInitialised() {
    TodoList myTodoList= new TodoList("Household chores");
    Task myTask = new Task ("Mow the lawn");
    myTodoList.assignTask("Mow the lawn", "Lewis");
    assertEquals("Lewis", myTask.getEmployeeName());
    }
}