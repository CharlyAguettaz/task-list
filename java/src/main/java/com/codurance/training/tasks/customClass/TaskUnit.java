package com.codurance.training.tasks.customClass;

public class TaskUnit {
    private TaskId taskId;
    private TaskDescription taskDescription;

    public TaskUnit(TaskId taskId, TaskDescription taskDescription) {
        this.taskId = taskId;
        this.taskDescription = taskDescription;
    }

    public String toString() {
        return this.taskId.toString() + ": " + this.taskDescription.toString();
    }

    private boolean taskExist(TaskId taskId) {
        return this.taskId == taskId;
    }
}
