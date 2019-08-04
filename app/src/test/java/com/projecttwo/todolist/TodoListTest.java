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
}