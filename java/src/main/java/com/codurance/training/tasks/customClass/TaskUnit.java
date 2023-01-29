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

    public TaskExist taskExist(TaskId taskId) {
        if(this.taskId == taskId) {
            return new TaskExist(true);
        }
        return new TaskExist(false);
    }
}
