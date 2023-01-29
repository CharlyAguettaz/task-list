package com.codurance.training.tasks.customClass;

public class TaskDone {
    private boolean taskDoneValue;

    public TaskDone(boolean taskDoneValue) {
        this.taskDoneValue = taskDoneValue;
    }

    public String isTaskDone() {
        if (this.taskDoneValue) {
            return "[X]";
        }
        return "[ ]";
    }
}
