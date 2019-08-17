package com.projecttwo.todolist;

import org.junit.Assert;
import org.junit.Test;

class TodoListTest {
    static void testAll() {

        @Test
        public void isDone_isFalseOnInstantiation_false () {
            Task myTask = new Task("Mow the lawn");
            Assert.assertFalse(myTask.isDone());
        }

        @Test
        public void taskName_isInitialised () {
            Task myTask = new Task("Mow the lawn");
            Assert.assertEquals("Mow the lawn", myTask.getTaskName());
        }

        @Test
        public void runProgramme () {
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
        public void assignTask_changesEmployeeName () {
            TodoList myTodoList = new TodoList("Household chores");
            Task myTask = new Task("Mow the lawn");
            myTodoList.assignTask("Mow the lawn", "Lewis");
        }

        @Test
        public void assignDeadline_changesDeadline () {
            TodoList myTodolist = new TodoList("Household chores");

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
    }
}