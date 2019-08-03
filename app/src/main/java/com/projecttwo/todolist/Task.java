package com.projecttwo.todolist;

class Task {
    private String taskName;
    private String employeeName;
    private String deadLine;
    private boolean isDone;

    Task(String taskName) {
        this.taskName = taskName;
        this.isDone = false;
    }

    public String getTaskName() {
        return this.taskName;
    }

}