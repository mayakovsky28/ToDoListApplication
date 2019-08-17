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

    String getTaskName() {
        return this.taskName;
    }
    void setTaskName(String newTaskName) {
        this.taskName = newTaskName;
    }

    String getEmployeeName() {
        return employeeName;
    }
    void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    String getDeadLine() {
        return deadLine;
    }
    void setDeadLine(String deadLine) {
        this.deadLine = deadLine;
    }

    boolean isDone() {
        return isDone;
    }
    void setDone(boolean done) {
        isDone = done;
    }
}