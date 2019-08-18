package com.projecttwo.todolist;

import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class TodoListTest {
    TodoList myTodoList;
    Task myTask;

    @Before
    public void setUp(){
        myTodoList = new TodoList("My morning routine");
        myTask = new Task("Mow the lawn");
    }

    @Test
        public void isDone_isFalseOnInstantiation_false () {
            assertFalse(myTask.isDone());
        }

        @Test
        public void taskName_isInitialised () {
            assertEquals("Mow the lawn", myTask.getTaskName());
        }

        @Test
        public void runProgramme () {
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
        public void assignTask_changesEmployeeName () {
            myTodoList.assignTask(myTask.getTaskName(), "Lewis");
            assertEquals(myTask.getEmployeeName(), "Lewis");
        }

        @Test
        public void assignDeadline_changesDeadline () {

        }

        @Test
        public void createTask_populatesAllFields () {
        }

        @Test
        public void removeTask_deletesTask () {
        }

        @Test
        public void renameTask_changesTaskName () {
        }

        @Test
        public void testAll() throws FileNotFoundException {
            //TODO implement this method
            PrintStream out = new PrintStream(new FileOutputStream("output.txt"));
            out.println("Hello Rohan!");
            System.setOut(out);
        }

}